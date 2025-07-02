package temaiken;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 * La clase MenuAdministrador representa el menú interactivo exclusivo para usuarios
 * con permisos de administrador dentro del sistema del Temaikèn.
 * 
 * Permite realizar operaciones de administración como:
 * Altas y bajas de entidades (Especie, Empleado, Habitat, Zona, Itinerario).
 * Asignaciones entre entidades (por ejemplo, especie a hábitat o guía a itinerario)
 * Visualización de listas de entidades.
 * 
 * Esta clase implementa la interfaz Menu, lo que le permite integrarse en el sistema
 * de control de accesos de usuarios según sus permisos.
 */

public class MenuAdministrador implements Menu {

    Scanner scanner = new Scanner(System.in);
    private BaseDeDatos baseDatos;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

/**
 * Muestra el menu principal del Administrador
 * @param baseDatos Referencia a la base de datos
 * @param e Empleado que accede al menu
 */
    
    @Override
    public void mostrarMenu(BaseDeDatos baseDatos, Empleado e)
    {
        this.baseDatos = baseDatos;

        Integer opcion;

        do
        {
            System.out.println(
                    "\n\nMENU DE ADMINISTRADOR:\n\n"
                    + "1. Altas\n"
                    + "2. Bajas\n"
                    + "3. Asignaciones\n"
                    + "4. Vistas\n"
                    + "5. Cerrar Sesion\n\n"
                    + "Ingrese opcion: ");

            opcion = scanner.nextInt();

            switch (opcion)
            {
                case 1:
                    menuAlta();
                    break;
                case 2:
                    menuBaja();
                    break;
                case 3:
                    menuAsignacion();
                    break;
                case 4:
                    menuVista();
                case 5:
                    break;
                default:
                    break;
            }
        }while(opcion != 5);
    }

 /**
  * Muestra las opciones de alta Especie, Empleado, Habitat, Zona e Itinerario
  */
    private void menuAlta()
    {
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

        switch (opcion)
        {
            case 1:
                altaEspecie();
                break;
            case 2:
                altaEmpleado();
                break;
            case 3:
                altaHabitat();
                break;
            case 4:
                altaZona();
                break;
            case 5:
                altaItinerario();
                break;
            default:
                break;
        }
    }

 /**
  * Muestra las opciones de baja Especie, Empleado, Habitat, Zona e Itinerario
  */
    
    private void menuBaja()
    {
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

        switch (opcion)
        {
            case 1:
                bajaEspecie();
                break;
            case 2:
                bajaEmpleado();
                break;
            case 3:
                bajaHabitat();
                break;
            case 4:
                bajaZona();
                break;
            case 5:
                bajaItinerario();
                break;
            default:
                break;
        }
    }

 /**
  * Muestra las opciones de asignacion Especie-Habitat, Especie-Zona, Itinerario-Guia, 
  * Zona-Itinerario, Especie-Cuidador
  */
    private void menuAsignacion()
    {
        Integer opcion;

        System.out.println(
                "\n\nMENU DE ASIGNACION:\n\n"
                + "1. Asignar Especie a Habitat\n"
                + "2. Asignar Especie a Zona\n"
                + "3. Asignar Itinerario a Guia\n"
                + "4. Asignar Zona a Itinerario\n"    
                + "5. Asignar Especie a Cuidador\n"
                + "Ingrese opcion: ");

        opcion = scanner.nextInt();

        switch (opcion)
        {
            case 1:
                asignarEspecieHabitat();
                break;
            case 2:
                asignarEspecieZona();
                break;
            case 3:
                asignarItinerarioGuia();
                break;
            case 4:
                asignarZonaItinerario();
                break;
            case 5:
                asignarEspecieCuidador();
                break;
            default:
                break;
        }
    }
    
/**
 * Muestra las opciones para visualizar Especies, Habitats, Zonas e Itinerarios
 */
    
    private void menuVista()
    {
        Integer opcion;

        System.out.println(
                "\n\nMENU DE VISTA:\n\n"
                + "1. Mostrar lista de Especies\n"
                + "2. Mostrar lista de Habitats\n"
                + "3. Mostrar lista de Zonas\n"
                + "4. Mostrar lista de Itinerarios\n"
                + "Ingrese opcion: ");

        opcion = scanner.nextInt();

        switch (opcion)
        {
            case 1:
                baseDatos.mostrarEspecies();
                break;
            case 2:
                baseDatos.mostrarHabitat();
                break;
            case 3:
                baseDatos.mostrarZonas();
                break;
            case 4:
                baseDatos.mostrarItinerarios();
                break;
            default:
                break;
        }
    }

/**
 * Permite realizar el alta de una especie y guardarla en la base de datos
 */
    
    private void altaEspecie()
    {
        scanner.nextLine(); //Limpia el Buffer
        System.out.println("Alta especie");
        Especie e = new Especie();
        baseDatos.agregarEspecie(e);
        System.out.println("Especie creada...");
    }

/**
 * Permite realizar el alta de un Empleado y guardarlo en la base de datos
 */
    private void altaEmpleado()
    {
        scanner.nextLine(); //Limpia el Buffer
        System.out.println("Alta empleado");
        System.out.println("Ingrese el tipo de usuario: Cuidador / Guia");
        String op = scanner.nextLine();
        try
        {
            baseDatos.agregarUsuario(EmpleadoFactory.crearUsuario(op));
            System.out.println("Usuario creado...");
        } catch (IllegalArgumentException e)
        {
            System.out.println("Error : " + e.getMessage());
        }
    }

/**
 * Permite el alta de un habitat y almacenarlo en la base de datos
 */    
    
    private void altaHabitat()
    {
        scanner.nextLine(); //Limpia el Buffer
        System.out.println("Alta habitat");
        Habitat h = new Habitat();
        baseDatos.agregarHabitat(h);
        System.out.println("Habitat creada...");
    }
/**
 * Permite el alta de una Zona y almacenarlo en la base de datos
 */ 
    private void altaZona()
    {
        scanner.nextLine(); //Limpia el Buffer
        System.out.println("Alta zona");
        Zona z = new Zona();
        baseDatos.agregarZona(z);
        System.out.println("Zona creada...");
    }
/**
 * Permite el alta de un Itinerario y almacenarlo en la base de datos
 */ 
    private void altaItinerario()
    {
        scanner.nextLine(); //Limpia el Buffer
        System.out.println("Alta itinerario");
        Itinerario i = new Itinerario();
        baseDatos.agregarItinerario(i);
        System.out.println("Itinerario creado...");
    }

/**
 * Permite la baja de una Especie
 */
    private void bajaEspecie()
    {
        
        System.out.println("Baja especie");
        baseDatos.eliminarEspecie();
        System.out.println("Especie eliminada...");
    }

 /**
 * Permite la baja de un Empleado
 */
    private void bajaEmpleado()
    {
        
        System.out.println("Baja empleado");
        baseDatos.eliminarEmpleado();
        System.out.println("Empleado eliminado...");
    }

 /**
 * Permite la baja de un Habitat
 */
    private void bajaHabitat()
    {
        
        System.out.println("Baja habitat");
        baseDatos.eliminarHabitat();
        System.out.println("Habitat eliminda...");
    }
/**
 * Permite realizar la eliminacion de una determinada Zona
 */
    private void bajaZona()
    {
        
        System.out.println("Baja zona");
        baseDatos.eliminarZona();
        System.out.println("Zona eliminida...");
    }
/**
 * Permite realizar la eliminacion de un determinado Itinerario
 * 
 */
    private void bajaItinerario()
    {
        
        System.out.println("Baja itinerario");
        baseDatos.eliminarItinerario();
        System.out.println("Itinerario eliminado...");
    }

/**
 * Permite realizar la asignacion de Especie - Habitat
 */
    private void asignarEspecieHabitat()
    {
        Especie especieElegida;
        Habitat habitatElegida;

        especieElegida = baseDatos.elegirEspecie();
        habitatElegida = baseDatos.elegirHabitat();

        baseDatos.agregarEspecieHabitat(new EspecieHabitat(especieElegida, habitatElegida));
        System.out.println("Se agrega Especie - Habitat");
    }

/**
 * Permite realizar la asignacion de Itinerario - Guia
 */    
    
    private void asignarItinerarioGuia()
    {
        Itinerario itinerarioElegido;
        Guia guiaElegido;

        itinerarioElegido = baseDatos.elegirItinerario();
        guiaElegido = baseDatos.elegirGuia();

        baseDatos.agregarItinerarioGuia(new ItinerarioGuia(itinerarioElegido, guiaElegido, LocalTime.now(), LocalTime.now().plusHours(1)));
        System.out.println("Se agrega Itinerario - Guia");
    }

/**
 * Permite realizar la asignacion de Especie - Cuidador y asignar fecha Ini y Final
 */    
    
     private void asignarEspecieCuidador()
    {
        Especie especieElegida;
        Cuidador cuidadorElegido; 
        Date fechaIni = null;
        Date fechaFin = null;
        String fechaIniStr;
        String fechaFinStr;
        
        especieElegida = baseDatos.elegirEspecie();
        cuidadorElegido = baseDatos.elegirCuidador();
        
        // Ingresar fecha de inicio
        boolean fechaValida = false;
        
        while (!fechaValida) {
            scanner.nextLine(); //Limpia el Buffer
            System.out.print("Ingrese la fecha de inicio (dd/MM/yyyy): ");
            fechaIniStr = scanner.nextLine();
            try {
                fechaIni = dateFormat.parse(fechaIniStr);
                fechaValida = true;
            } catch (ParseException e) {
                System.out.println("Formato de fecha inválido.");
            }
        }

        // Ingresar fecha de fin
        fechaValida = false;
        
        while (!fechaValida) {
            System.out.print("Ingrese la fecha de fin (dd/MM/yyyy): ");
            fechaFinStr = scanner.nextLine();
            try {
                fechaFin = dateFormat.parse(fechaFinStr);
                
                if (fechaFin.before(fechaIni)) {
                    System.out.println("La fecha de fin no puede ser anterior a la fecha de inicio. Intente de nuevo.");
                } else {
                    fechaValida = true;
                }
            } catch (ParseException e) {
                System.out.println("Formato de fecha inválido.");
            }
        }

        baseDatos.agregarCuidadorEspecie(new CuidadorEspecie(cuidadorElegido, especieElegida, fechaIni, fechaFin));
        System.out.println("Se agrega Cuidador - Especie");
    }


/**
 * Permite realizar la asignacion de una Zona-Itinerario
 */

     
    private void asignarZonaItinerario()
    {
        Itinerario itinerarioElegido;
        Zona zonaElegida;

        itinerarioElegido = baseDatos.elegirItinerario();
        zonaElegida = baseDatos.elegirZona();

        baseDatos.agregarItinerarioZona(new ItinerarioZona(itinerarioElegido, zonaElegida));
        System.out.println("Se agrega Itinerario - Zona");
    }

/**
 * Permite asignar una Especie a una determinada Zona
 */    
    
    private void asignarEspecieZona()
    {        
        Especie especieElegida;
        Zona zonaElegida;
        
        especieElegida = baseDatos.elegirEspecie();
        zonaElegida = baseDatos.elegirZona();

        zonaElegida.agregarEspecie(especieElegida);
        System.out.println("Se agrega Zona - Especie");
    }
}
