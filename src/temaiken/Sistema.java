package temaiken;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sistema {
    Scanner scanner = new Scanner(System.in);
    BaseDeDatos baseDatos;
    
    public Sistema() {
        baseDatos = new BaseDeDatos();
    }
    
    public void precargarDatos(){
        Administrador a = new Administrador("admin", "direccion1", 1234, new Date(), "admin", "admin");
        Cuidador c = new Cuidador("cuidador", "direccion2", 1234, new Date(), "cuidador", "cuidador");
        Guia g = new Guia("guia", "direccion3", 1234, new Date(), "guia", "guia");
        Especie e = new Especie(101, "Leon", "Leonidus Felinus", "El Rey de la selva");
        Habitat h = new Habitat(102,"Sabana Africana","Cálido.","Grandes extensiones de pastizales.","Africa");
        Itinerario i = new Itinerario(103, 60, 30.3, 15, 20);
        Zona z = new Zona(104, "Zona frontal", 33.5);
        
        baseDatos.agregarUsuario(a);
        baseDatos.agregarUsuario(c);
        baseDatos.agregarUsuario(g);
        //baseDatos.agregarCuidador(c);
       // baseDatos.agregarGuia(g);
        
        baseDatos.agregarEspecie(e);
        baseDatos.agregarHabitat(h);
        baseDatos.agregarItinerario(i);
        baseDatos.agregarZona(z);
    }
    
    public void arrancar(){
        
        boolean corriendo = true;
        
        while (corriendo) {
            Empleado u = null;
            System.out.println("\nIngrese usuario:");
            String usuario = scanner.next();
            System.out.println("Ingrese password:");
            String password = scanner.next();

            u = baseDatos.buscarUsuario(usuario, password);

            if (u == null) {
                System.out.println("Usuario/password inexistente");
            } else {
                corriendo = u.mostrarMenu(baseDatos, u);
            }
            
            /*************/
            System.out.println("\n");
            System.out.println("presione 0 para salir");
            System.out.println("presione 1 para volver a loggear");
            if(scanner.nextInt()==1){
                corriendo = true;
            }
        }
        System.out.println("Hasta luego");
    }
}