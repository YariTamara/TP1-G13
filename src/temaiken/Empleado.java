package temaiken;

import java.util.Date;
import java.util.Scanner;

/**
 * La clase @code Empleado representa un empleado del sistema Temaikén.
 * Contiene información básica como nombre, dirección, teléfono, usuario y contraseña,
 * además de la fecha de ingreso al sistema y los permisos de menú asignados.
 * 
 * Esta clase sirve como clase base para otros tipos de empleados.
 *
 */
public class Empleado {

    private String nombre;
    private String direccion;
    private Integer telefono;
    private Date fechaIngreso;
    private String user;
    private String pass;
    private Menu permisosMenu;

    /**
     * Constructor que inicializa un empleado con todos sus datos.
     * 
     * @param nombre       el nombre del empleado
     * @param direccion    la dirección del empleado
     * @param telefono     el número de teléfono del empleado
     * @param fechaIngreso la fecha de ingreso al sistema
     * @param user         el nombre de usuario del empleado
     * @param pass         la contraseña del empleado
     */
    public Empleado(String nombre, String direccion, Integer telefono, Date fechaIngreso, String user, String pass) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
        this.user = user;
        this.pass = pass;
    }

    /**
     * Constructor por defecto que solicita los atributos del empleado por consola.
     * Utiliza un Scanner para ingresar los datos manualmente.
     */
    public Empleado() {
        ingresarAtributos();
    }

    /**
     * Método sobrescribible que puede ser implementado por subclases para mostrar datos del empleado.
     */
    public void mostrarDatos() {
        // Este método está pensado para ser sobrescrito por subclases
    }

    /**
     * Muestra el menú correspondiente a los permisos del empleado.
     * 
     * @param baseDatos instancia de la base de datos a utilizar
     * @param u         el empleado que accede al menú
     * @return siempre devuelve false (puede ser modificado según la lógica del menú)
     */
    public boolean mostrarMenu(BaseDeDatos baseDatos, Empleado u) {
        permisosMenu.mostrarMenu(baseDatos, u);
        return false;
    }

    /**
     * Verifica si el usuario y la contraseña ingresados coinciden con los del empleado.
     * 
     * @param usr el nombre de usuario ingresado
     * @param pwd la contraseña ingresada
     * @return true si coinciden, false en caso contrario
     */
    public boolean coincidenUsrPwd(String usr, String pwd) {
        return this.user.equalsIgnoreCase(usr) && this.pass.equals(pwd);
    }

    /**
     * Establece los permisos de menú para el empleado.
     * 
     * @param permisosMenu una implementación concreta de {@link Menu}
     */
    public void setPermisosMenu(Menu permisosMenu) {
        this.permisosMenu = permisosMenu;
    }

    /**
     * Devuelve el nombre del empleado.
     * 
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la dirección del empleado.
     * 
     * @return la dirección
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Devuelve el número de teléfono del empleado.
     * 
     * @return el teléfono
     */
    public Integer getTelefono() {
        return telefono;
    }

    /**
     * Devuelve la fecha de ingreso del empleado al sistema.
     * 
     * @return la fecha de ingreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Método privado que solicita por consola los atributos del empleado.
     * Utilizado por el constructor por defecto.
     */
    private void ingresarAtributos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingresar la dirección: ");
        direccion = scanner.nextLine();

        System.out.println("Ingresar el teléfono: ");
        telefono = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer

        System.out.println("Ingresar el usuario: ");
        user = scanner.nextLine();

        System.out.println("Ingresar la contraseña: ");
        pass = scanner.nextLine();

        fechaIngreso = new Date(); // Asigna la fecha actual como fecha de ingreso
    }
}
