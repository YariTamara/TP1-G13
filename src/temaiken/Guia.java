package temaiken;

import java.util.Date;

public class Guia extends Empleado {
    
    public Guia(String nombre, String direccion, Integer telefono, Date fechaIngreso, String user, String pass)
    {
        super(nombre, direccion, telefono, fechaIngreso, user, pass);
        super.setPermisosMenu(new MenuGuia());
    }
    
    @Override
    public void mostrarDatos()
    {
        System.out.println(
                "Guia: "
                + getNombre()
                + " Direccion: " + getDireccion()
                + " Telefono: " + getTelefono()
                + " FechaIngreso: " + getFechaIngreso());
    }

    public Guia() {
        super.setPermisosMenu(new MenuGuia());
    }


    
    
}
