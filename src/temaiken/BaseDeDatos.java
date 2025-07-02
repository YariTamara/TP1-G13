package temaiken;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Crea una Base De Datos de los empleados, especies, zonas, habitat, itinerario
 */

public class BaseDeDatos
{
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Empleado> usuarios;
    private ArrayList<Especie> especies;
    private ArrayList<Zona> zonas;
    private ArrayList<Habitat> habitats;
    private ArrayList<Itinerario> itinerarios;
    private ArrayList<Guia> guias;
    private ArrayList<Cuidador> cuidadores;

    private ArrayList<CuidadorEspecie> cuidadoresEspecies;
    private ArrayList<EspecieHabitat> especiesHabitats;
    private ArrayList<ItinerarioGuia> itinerariosGuias;
    private ArrayList<ItinerarioZona> itinerariosZonas;

    public BaseDeDatos()
    {
        usuarios = new ArrayList<>();
        especies = new ArrayList<>();
        zonas = new ArrayList<>();
        habitats = new ArrayList<>();
        itinerarios = new ArrayList<>();
        guias = new ArrayList<>();
        cuidadores = new ArrayList<>();
        cuidadoresEspecies = new ArrayList<>();
        especiesHabitats = new ArrayList<>();
        itinerariosGuias = new ArrayList<>();
        itinerariosZonas = new ArrayList<>();
    }

    //--------------------------------------------------------------------------
    //AGREGAR ELEMENTOS A LA LISTA
 
/**
 * Permite agregar un Empleado a la base de datos
 * @param p recibe un Empleado y lo almacena en la base de datos
 */    
    
    public void agregarUsuario(Empleado p)
    {
        if (p != null) {
            usuarios.add(p);
        }
        if (p instanceof Cuidador) {
            cuidadores.add((Cuidador) p);
        }

        if (p instanceof Guia) {
            guias.add((Guia) p);
        }
    }

/**Permite agregar una Especie a la base de datos
 * 
 * @param e Recibe una especie y la almacena en la base de datos
 */
    public void agregarEspecie(Especie e)
    {
        if (e != null)
        {
            especies.add(e);
        }else{
            System.out.println("No hay especie");
        }
    }
/**
 * Permite agregar una Zona a la base de datos
 * @param z  Recibe una zona y la almacena en la base de datos
 */
    public void agregarZona(Zona z)
    {
        if (z != null)
        {
            zonas.add(z);
        }
    }

/**
 * Permite agregar un Habitat a la base de datos
 * @param h Recibe un habitat y la almacena en la base de datos
 */    
    
    public void agregarHabitat(Habitat h)
    {
        if (h != null)
        {
            habitats.add(h);
        }
    }

/**
 * Permite agregar un Itinerario a la base de datos
 * @param i Recibe un itinerario y lo almacena en la base de datos
 */
    
    public void agregarItinerario(Itinerario i)
    {
        if (i != null)
        {
            itinerarios.add(i);
        }
    }

/**
 * Permite agregar un Guia a la base de datos
 * @param g Recibe un Guia y lo almacena en una lista particular en la base de datos
 */    
    
    public void agregarGuia(Guia g)
    {
        if (g != null)
        {
            guias.add(g);
        }
    }

/**
 * Permite agregar un Cuidador a la base de datos
 * @param c Recibe un Cuidador y lo almacena en una lista particular en la base de datos
 */    
    
    public void agregarCuidador(Cuidador c)
    {
        if (c != null)
        {
            cuidadores.add(c);
        }
    }

/**
 * Permite agregar una la relacion Cuidador-Especie a la base de datos
 * 
 * @param ce Recibe un CuidadorEspecie y lo almacena en la base de datos
 */    
    
    public void agregarCuidadorEspecie(CuidadorEspecie ce)
    {
        if (ce != null)
        {
            cuidadoresEspecies.add(ce);
        }

    }

/**
 * Permite agregar una la relacion Especie-Habitat a la base de datos
 * @param eh Recibe un EspecieHabitat y lo almacena en la base de datos
 */    
    
    public void agregarEspecieHabitat(EspecieHabitat eh)
    {
        if (eh != null)
        {
            especiesHabitats.add(eh);
        }

    }

/**
 * Permite agregar una la relacion Itinerario-Guia a la base de datos
 * @param ig Recibe un ItinerarioGuia y lo almacena en la base de datos
 */    
    
    public void agregarItinerarioGuia(ItinerarioGuia ig)
    {
        if (ig != null)
        {
            itinerariosGuias.add(ig);
        }

    }

/**
 * Permite agregar una la relacion Itinerario-Zona a la base de datos
 * @param iz Recibe un ItinerarioZona y lo almacena en la base de datos
 */

    public void agregarItinerarioZona(ItinerarioZona iz)
    {
        if (iz != null)
        {
            itinerariosZonas.add(iz);
        }

    }

    //--------------------------------------------------------------------------
    //LOGIN USUARIO

/**
 * Busca un usuario en la BD
 * @param usr Recibe un usuario-identificacion
 * @param pwd Recibe una contraseña
 * @return Devuelve el empleado que coincida con los parametros de usr y pwd
 */

    public Empleado buscarUsuario(String usr, String pwd)
    {
        Empleado usuario = null;

        for (Empleado u : usuarios)
        {
            if (u.coincidenUsrPwd(usr, pwd))
            {
                usuario = u;
                break;
            }
        }
        return usuario;
    }

/**
 * Busca una Especie en la BD
 * @param cod Recibe el codigo de una especie
 * @return Devuelve la especie que coincida con el codigo
 */
    
        public Especie buscarEspecie(int cod)
    {
        Especie especie = null;
        int c;
        for (Especie e : especies)
        {
            c = e.getCod();
            if (c == cod)
            {
                especie = e;
                break;
            }
        }
        return especie;
    }

    //--------------------------------------------------------------------------
    //MOSTRAR LISTA
 
 /**
  * Muestra las Especies almacenadas en la Base de Datos
  */       
        
        public void mostrarEspecies()
    {
        int contador = 1;
        
        for (Especie e : especies)
        {
            System.out.println(contador++ + "- " + e.mostrar() + "\n");
        }
    }
/**
 * Muestra los empleados almacenados en la Base de Datos
 * 
 */
        
    public void mostrarEmpleados()
    {
        int contador = 1;

        for (Empleado u : usuarios)
        {
            System.out.println(contador++ + "-");
            u.mostrarDatos();
        }
    }
/**
 * Muestra los habitats almacenados en la Base de Datos
 * 
 */
    public void mostrarHabitat()
    {
        int contador = 1;

        for (Habitat h : habitats)
        {
            System.out.println(contador++ + "-" + h.mostrar());

        }
    }
/**
 * Muestra los itinerarios almacenados en la Base de Datos
 * 
 */
    public void mostrarItinerarios()
    {
        int contador = 1;

        for (Itinerario i : itinerarios)
        {
            System.out.println(contador++ + "- " + i.mostrar() + "\n");
        }
    }
/**
 * Muestra las zonas almacenados en la Base de Datos
 * 
 */
    public void mostrarZonas()
    {
        int contador = 1;

        for (Zona z : zonas)
        {
            System.out.println(contador++ + " - " + z.mostrar() + "\n");
        }
    }
/**
 * Muestra los cuidadores almacenados en la Base de Datos
 * 
 */
    public void mostrarCuidadores()
    {
        for (Empleado e : usuarios)
        {
            if (e instanceof Cuidador)
            {
                e.mostrarDatos();
            }
        }
    }
/**
 * Muestra los guias almacenados en la Base de Datos
 * 
 */
    public void mostrarGuias()
    {
        for (Empleado e : usuarios)
        {
            if (e instanceof Guia)
            {
                e.mostrarDatos();
            }
        }
    }
/**
 * Muestra la asignacion de Cuidadores - Especies almacenados en la base de datos
 */    
    public void mostrarCuidadoresEspecies()
    {
        for (CuidadorEspecie i : cuidadoresEspecies)
        {
            System.out.println(i.mostrar());
        }
    }
/**
 * Muestra la asignacion de Especies - Habitats almacenados en la base de datos
 */
    
    public void mostrarEspeciesHabitats()
    {
        for (Habitat h : habitats)
        {
            System.out.println(
                    "\nHabitat " + h.getNombre() + ":"
            );
            
            for(EspecieHabitat eh: especiesHabitats)
            {
                if(eh.getHabitatNombre().equals(h.getNombre())){
                    System.out.println("- " + eh.getEspecie().getNombreEsp());
                }
            }
            System.out.println("");
        }
    }
/**
 * Muestra la asignacion Itinerario - Guia almacenado en la base de datos
 */
    public void mostrarItinerarioGuia()
    {
        for (Itinerario i : itinerarios)
        {
            System.out.println(
                    "\nItinerario " + i.getCodigo()+ ":"
            );
            
            for(ItinerarioGuia ig : itinerariosGuias)
            {
                if(ig.getCodigoItinerario() == i.getCodigo()){
                    System.out.println("- " + ig.getNombreGuia());
                }
            }
            System.out.println("");
        }
    }
 
/**
 * Muestra la asignacion de Itinerario - Zona almacenada en la base de datos
 */    
    public void mostrarItinerarioZona()
    {
        for (Itinerario i : itinerarios)
        {
            System.out.println(
                    "\nItinerario " + i.getCodigo()+ ":"
            );
            
            for(ItinerarioZona iz : itinerariosZonas)
            {
                if(iz.getCodigoItinerario() == i.getCodigo()){
                    System.out.println("- " + iz.getNombreZona());
                }
            }
            System.out.println("");
        }
    }
/**
 * Muestra la asignacion de Especies - Zonas almacenada en la base de datos
 */ 
    
    void mostrarEspeciesZonas()
    {
        for (Zona z : zonas)
        {
            System.out.println(
                "\nZona " + z.getNombre()+ ":"
            );
            
            z.verEspecies();
        }
    }

/**
 * Muestra los Empleados almacenados en la base de datos
 * @return Devuelve el Empleado seleccionado
 */
    public Empleado elegirUsuario()
    {
        int opcion;
        int contador = 1;

        for (Empleado p : usuarios)
        {
            System.out.println(contador++ + "- " + p.getNombre() + "\n");
        }

        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > usuarios.size());

        return usuarios.get(opcion - 1);
    }
/**
 * Muestra las Especies almacenadas en la base de datos
 * @return Devuelve la Especie seleccionada
 */
    public Especie elegirEspecie()
    {
        int opcion;
        int contador = 1;
        
        for (Especie e : especies)
        {
            System.out.println(contador++ + "- " + e.getNombreEsp() + "\n");
        }

        do
        {
            System.out.println("Ingrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > especies.size());

        return especies.get(opcion - 1);
    }
/**
 * Muestra las Zonas almacenadas en la base de datos
 * @return Devuelve la Zona seleccionada
 */
    public Zona elegirZona()
    {
        int opcion;
        int contador = 1;

        for (Zona z : zonas)
        {
            System.out.println(contador++ + "- " + z.getNombre() + "\n");
        }

        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > zonas.size());

        return zonas.get(opcion - 1);
    }
/**
 * Muestra las Zonas almacenadas en la base de datos
 * @return Devuelve el Habitat seleccionada
 */
    public Habitat elegirHabitat()
    {
        int opcion;
        int contador = 1;

        for (Habitat h : habitats)
        {
            System.out.println(contador++ + "- " + h.getNombre() + "\n");
        }

        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > habitats.size());

        return habitats.get(opcion - 1);
    }
/**
 * Muestra los Itinerarios almacenados en la base de datos
 * @return Devuelve el Itinerario seleccionado
 */
    public Itinerario elegirItinerario()
    {
        int opcion;
        int contador = 1;

        for (Itinerario i : itinerarios)
        {
            System.out.println(contador++ + "- " + i.getCodigo()+ "\n");
        }

        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > itinerarios.size());

        return itinerarios.get(opcion - 1);
    }
/**
 * Muestra los Guias almacenados en la base de datos
 * @return Devuelve el Guia seleccionado
 */
    public Guia elegirGuia()
    {
        int opcion;
        int contador = 1;

        for (Guia g : guias)
        {
            System.out.println(contador++ + "- " + g.getNombre() + "\n");
        }

        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > guias.size());

        return guias.get(opcion - 1);
    }
/**
 * Muestra los cuidadores almacenados en la base de datos
 * @return Devuelve el Cuidador seleccionado
 */
    public Cuidador elegirCuidador()
    {
        int opcion;
        int contador = 1;

        for (Cuidador c : cuidadores)
        {
            System.out.println(contador++ + "- " + c.getNombre() + "\n");
        }

        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > cuidadores.size());

        return cuidadores.get(opcion - 1);
    }

 /**
  * Muestra las especies de la base de datos y permite eliminar seleccionando una
  */

    public void eliminarEspecie()
    {
        mostrarEspecies();
        especies.remove(elegirEspecie());
    }
 /**
  * Muestra los Empleados de la base de datos y permite eliminar seleccionando uno
  */
    public void eliminarEmpleado()
    {
        mostrarEmpleados();
        usuarios.remove(elegirUsuario());
    }

 /**
  * Muestra los Habitats de la base de datos y permite eliminar seleccionando una
  */    
    
    public void eliminarHabitat()
    {
        mostrarHabitat();
        habitats.remove(elegirHabitat());
    }
    
 /**
  * Muestra los Itinerarios de la base de datos y permite eliminar seleccionando uno
  */
    public void eliminarItinerario()
    {
        mostrarItinerarios();
        itinerarios.remove(elegirItinerario());
    }
    
 /**
  * Muestra los Empleados de la base de datos y permite eliminar seleccionando uno
  */     
    public void eliminarZona()
    {
        mostrarZonas();
        zonas.remove(elegirZona());
    }
}
