package temaiken;

import java.util.Date;

/**
 * La clase {@code Guia} representa un empleado con el rol de guía dentro del Temaiken.
 * Hereda de Empleado y establece los permisos de menú correspondientes al rol de guía.
 * Incluye constructores para inicializar el objeto con o sin datos, y un método para mostrar su información.
 * 
 * @see MenuGuia
 * @see Empleado
 * @see Cuidador
 */
public class Guia extends Empleado {

    /**
     * Constructor que inicializa un guía con todos sus datos personales y de acceso.
     * 
     * @param nombre       el nombre del guía
     * @param direccion    la dirección del guía
     * @param telefono     el número de teléfono del guía
     * @param fechaIngreso la fecha de ingreso al sistema
     * @param user         el nombre de usuario para acceso al sistema
     * @param pass         la contraseña correspondiente al usuario
     */
    public Guia(String nombre, String direccion, Integer telefono, Date fechaIngreso, String user, String pass) {
        super(nombre, direccion, telefono, fechaIngreso, user, pass);
        super.setPermisosMenu(new MenuGuia());
    }

    /**
     * Constructor por defecto que asigna los permisos de menú correspondientes a un guía.
     */
    public Guia() {
        super.setPermisosMenu(new MenuGuia());
    }

    /**
     * Muestra los datos del guía por consola, incluyendo nombre, dirección, teléfono y fecha de ingreso.
     * Este método sobrescribe el método mostrarDatos() de la clase Empleado.
     */
    @Override
    public void mostrarDatos() {
        System.out.println(
                "Guia: " + getNombre()
                + " Direccion: " + getDireccion()
                + " Telefono: " + getTelefono()
                + " FechaIngreso: " + getFechaIngreso());
    }
}

