package temaiken;

import java.util.Date;
/**
 * Administrador representa un super usuario capaz de realizar ABM de usuarios
 * especies,itinerarios,habitat y zonas
 */

public class Administrador extends Empleado {
    
    /**Crea un usuario administrador
     * @param nombre nombre del Administrador
     * @param direccion direccion del Administrador
     * @param telefono telefono del Administrador
     * @param fechaIngreso fecha de ingreso del Administrador
     * @param user usuario-identificacion para ingresar al sistema
     * @param pass contraseña ngresar al sistema
     */
    
    public Administrador(String nombre, String direccion, Integer telefono, Date fechaIngreso, String user, String pass)
    {
        super(nombre, direccion, telefono, fechaIngreso, user, pass);
        super.setPermisosMenu(new MenuAdministrador());
    }
     
    @Override
    public void mostrarDatos()
    {
        System.out.println(
                "Administrador: " + getNombre()
                + " Direccion: " + getDireccion()
                + " Telefono: " + getTelefono()
                + " FechaIngreso: " + getFechaIngreso());
    }
}
