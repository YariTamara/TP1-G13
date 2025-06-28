package temaiken;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class MenuAdministrador implements Menu {
    Scanner scanner = new Scanner(System.in);
    private BaseDeDatos baseDatos;
    
    @Override
    public void mostrarMenu(BaseDeDatos baseDatos, Empleado e)
    {
        this.baseDatos = baseDatos;
        
        Integer opcion;
        
        System.out.println(
                "\n\nMENU DE ADMINISTRADOR:\n\n"
                + "1. Altas\n"
                + "2. Bajas\n"
                + "3. Asignaciones\n"
                + "5. Salir\n\n"       
                + "Ingrese opcion: ");
        
        opcion = scanner.nextInt();
        
        switch (opcion){
            case 1: menuAlta();
            break;
            case 2: menuBaja();
            break;
            case 3: menuAsignacion();
            break;
            case 4: return;
        }
    }
    
    //------------------------------------------------------------
    //MENU ALTA
    private void menuAlta(){
        Integer opcion;
        
        System.out.println(
                "\n\nMENU DE ALTA:\n\n"
                + "1. Alta Especie\n"
                + "2. Alta Empleado\n"
                + "3. Alta Habitat\n"
                + "4. Alta Zona\n"
                + "5. Alta Itinerario\n"
                + "Ingrese opcion: ");
        
        opcion = scanner.nextInt();
        
        switch (opcion){
            case 1: altaEspecie();
            break;
            case 2: altaEmpleado();
            break;
            case 3: altaHabitat();
            break;
            case 4: altaZona();
            break;
            case 5: altaItinerario();
            break;
        }
    }
    
    //------------------------------------------------------------
    //MENU BAJA
    private void menuBaja(){
        Integer opcion;
        
        System.out.println(
                "\n\nMENU DE BAJA:\n\n"
                + "1. Baja Especie\n"
                + "2. Baja Empleado\n"
                + "3. Baja Habitat\n"
                + "4. Baja Zona\n"
                + "5. Baja Itinerario\n"
                + "Ingrese opcion: ");
        
        opcion = scanner.nextInt();
        
        switch (opcion){
            case 1: bajaEspecie();
            break;
            case 2: bajaEmpleado();
            break;
            case 3: bajaHabitat();
            break;
            case 4: bajaZona();
            break;
            case 5: bajaItinerario();
            break;
        }
    }
    
    //------------------------------------------------------------
    //MENU ASIGNACION
    private void menuAsignacion(){
        Integer opcion;
        
        System.out.println(
                "\n\nMENU DE ASIGNACION:\n\n"
                + "1. Asignar Especie a Habitat\n"
                + "2. Asignar Especie a Zona\n"
                + "3. Asignar Itinerario a Guia\n"
                + "4. Asignar Especie a Cuidador\n"
                + "Ingrese opcion: ");
        
        opcion = scanner.nextInt();
        
        switch (opcion){
            case 1: asignarEspecieHabitat();
            break;
            case 2: asignarEspecieZona();
            break;
            case 3: asignarItinerarioGuia();
            break;
            case 4: asignarEspecieCuidador();
            break;
        }
    }

    //------------------------------------------------------------
    //FUNCIONES ALTA
    private void altaEspecie()
    {
        System.out.println("alta especie");
        Especie e = new Especie();
        baseDatos.agregarEspecie(e);
        System.out.println("Se crea especie");
    }

    private void altaEmpleado() {
        System.out.println("alta empleado");
        System.out.println("Ingrese el tipo de usuario: Cuidador / Guia");
        scanner.nextLine();//limpia Buffer
        try {
            baseDatos.agregarUsuario(EmpleadoFactory.crearUsuario(scanner.nextLine()));
            System.out.println("Usuario Creado.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }

    private void altaHabitat()
    {
        System.out.println("alta habitat");
        Habitat h = new Habitat();
        baseDatos.agregarHabitat(h);
        System.out.println("Se crea habitat");
    }

    private void altaZona()
    {
        System.out.println("alta zona");
        Zona z = new Zona();
        baseDatos.agregarZona(z);
        System.out.println("Se crea zona");
    }

    private void altaItinerario()
    {
        System.out.println("alta itinerario");
        Itinerario i = new Itinerario();
        baseDatos.agregarItinerario(i);
        System.out.println("Se crea zona");
    }

    //------------------------------------------------------------
    //FUNCIONES BAJA
    private void bajaEspecie()
    {
        System.out.println("baja especie");
        baseDatos.eliminarEspecie();
        System.out.println("se elimina especie");
    }

    private void bajaEmpleado()
    {
        System.out.println("baja empleado");
        baseDatos.eliminarEmpleado();
        System.out.println("se elimina empleado");
    }

    private void bajaHabitat()
    {
        System.out.println("baja habitat");
        baseDatos.eliminarHabitat();
        System.out.println("se elimina habitat");
    }

    private void bajaZona()
    {
        System.out.println("baja zona");
        baseDatos.eliminarZona();
        System.out.println("se elimina zona");
    }

    private void bajaItinerario()
    {
        System.out.println("baja itinerario");
        baseDatos.eliminarItinerario();
        System.out.println("se elimina itinerario");
    }

    //------------------------------------------------------------
    //FUNCIONES ASIGNACION
    private void asignarEspecieHabitat() {
        String nombreEspecie;
        String nombreHabitat;
        scanner.nextLine();
        System.out.println("escriba el NOMBRE de la Especie: ");
        baseDatos.mostrarEspecies();
        nombreEspecie = scanner.nextLine();

        System.out.println("escriba el NOMBRE del Habitat: ");
        baseDatos.mostrarHabitat();
        nombreHabitat = scanner.nextLine();
        
        baseDatos.agregarEspecieHabitat(new EspecieHabitat(nombreEspecie,nombreHabitat));
        System.out.println("Se agrega Especie - Habitat");
    }

    private void asignarItinerarioGuia(){
        int codigoItinerario;
        String nombreGuia;
        scanner.nextLine();
        System.out.println("escriba el CODIGO del Itinerario: ");
        baseDatos.mostrarItinerarios();
        codigoItinerario = scanner.nextInt();
        
        System.out.println("escriba el NOMBRE del Guia: ");
        scanner.nextLine();
        baseDatos.mostrarGuias();
        nombreGuia = scanner.nextLine();
        
        baseDatos.agregarItinerarioGuia(new ItinerarioGuia(codigoItinerario,nombreGuia,LocalTime.now(),LocalTime.now().plusHours(1)));
        System.out.println("Se agrega Itinerario - Guia");
    }

    private void asignarEspecieCuidador()
    {
        String nombreCuidador;
        String nombreEspecie;
        scanner.nextLine();
        System.out.println("escriba el NOMBRE del cuidador: ");
        baseDatos.mostrarCuidadores();
        nombreCuidador = scanner.nextLine();
        
        System.out.println("escriba el NOMBRE de la especie: ");
        baseDatos.mostrarEspecies();
        nombreEspecie = scanner.nextLine();
        
        baseDatos.agregarCuidadorEspecie(new CuidadorEspecie(nombreCuidador,nombreEspecie,LocalDateTime.now(),LocalDateTime.now().plusDays(30)));
        System.out.println("Se agrega Cuidador - Especie");
        
    }

    private void asignarEspecieZona(){
        
        int codigoZona;
        Especie e = null;
        Zona z = null;
        
        scanner.nextLine();
        System.out.println("escriba el CODIGO de la Especie: ");
        baseDatos.mostrarEspecies();
        e = baseDatos.elegirEspecie();
        
        scanner.nextLine();
        System.out.println("escriba el CODIGO de la Zona: ");
        z = baseDatos.elegirZona();
        
        z.agregarEspecie(e);
       
        System.out.println("Se agrega Especie a la Zona");
       scanner.nextLine();
        
        
    }
}
