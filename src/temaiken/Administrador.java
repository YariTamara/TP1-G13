package temaiken;

import java.util.Date;

public class Administrador extends Empleado {
    
    public Administrador(String nombre, String direccion, Integer telefono, Date fechaIngreso, String user, String pass)
    {
        super(nombre, direccion, telefono, fechaIngreso, user, pass);
        super.setPermisosMenu(new MenuAdministrador());
    }
    
    @Override
    public void mostrarDatos()
    {
        System.out.println(
                "Administrador: "
                + getNombre()
                + " Direccion: " + getDireccion()
                + " Telefono: " + getTelefono()
                + " FechaIngreso: " + getFechaIngreso());
    }
}
