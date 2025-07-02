package temaiken;

import java.util.Date;
import java.util.Scanner;

/**
 * La clase Cuidador representa a un empleado con rol de cuidador en el sistema.
 * Extiende la clase Empleado y configura los permisos del menú específicos para cuidadores.
 * 
 * Esta clase puede ser utilizada para mostrar información básica del cuidador y para inicializar 
 * objetos con o sin información específica.
 */
public class Cuidador extends Empleado {

    /**
     * Constructor con parámetros para crear un nuevo cuidador con datos específicos.
     * 
     * @param nombre       el nombre del cuidador
     * @param direccion    la dirección del cuidador
     * @param telefono     el número de teléfono del cuidador
     * @param fechaIngreso la fecha de ingreso del cuidador a la institución
     * @param user         el nombre de usuario para acceso al sistema
     * @param pass         la contraseña correspondiente al usuario
     */
    public Cuidador(String nombre, String direccion, Integer telefono, Date fechaIngreso, String user, String pass) {
        super(nombre, direccion, telefono, fechaIngreso, user, pass);
        super.setPermisosMenu(new MenuCuidador());
    }

    /**
     * Constructor por defecto. Inicializa un objeto cuidador y asigna los permisos de menú correspondientes.
     */
    public Cuidador() {
        super.setPermisosMenu(new MenuCuidador());
    }

    /**
     * Muestra por consola los datos del cuidador, incluyendo nombre, dirección, teléfono y fecha de ingreso.
     * Este método sobrescribe el método mostrarDatos de la clase Empleado.
     */
    @Override
    public void mostrarDatos() {
        System.out.println(
            "Cuidador: " + getNombre() 
            + " Direccion: " + getDireccion()
            + " Telefono: " + getTelefono()
            + " FechaIngreso: " + getFechaIngreso()
        );
    }
}
