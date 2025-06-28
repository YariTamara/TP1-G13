package temaiken;

import java.util.Date;
import java.util.Scanner;

public class Cuidador extends Empleado {

    public Cuidador(String nombre, String direccion, Integer telefono, Date fechaIngreso, String user, String pass) {
        super(nombre, direccion, telefono, fechaIngreso, user, pass);
        super.setPermisosMenu(new MenuCuidador());
    }

    @Override
    public void mostrarDatos() {
        System.out.println(
                "Cuidador: "
                + getNombre()
                + " Direccion: " + getDireccion()
                + " Telefono: " + getTelefono()
                + " FechaIngreso: " + getFechaIngreso());
    }

    public Cuidador() {
        super.setPermisosMenu(new MenuCuidador());
    }

    
    
    
    
}
