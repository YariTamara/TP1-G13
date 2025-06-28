package temaiken;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseDeDatos {

    Scanner scanner = new Scanner(System.in);
    private List<Empleado> usuarios;
    private List<Especie> especies;
    private List<Zona> zonas;
    private List<Habitat> habitats;
    private List<Itinerario> itinerarios;
    private List<Guia> guias;
    private List<Cuidador> cuidadores;

    private List<CuidadorEspecie> cuidadoresEspecies;
    private List<EspecieHabitat> especiesHabitats;
    private List<ItinerarioGuia> itinerariosGuias;

    public BaseDeDatos() {
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
    }
    
    //AGREGAR ELEMENTOS A LA LISTA
    
    public void agregarUsuario(Empleado p) {
        if (p != null) {
        usuarios.add(p);
        }
   
    }
    
    public void agregarEspecie(Especie e) {
        if (e != null) {
        especies.add(e);
        }
    }
    
    public void agregarZona(Zona z) {
        if (z != null) {
        zonas.add(z);
        }
    }
    
    public void agregarHabitat(Habitat h) {
        if (h != null) {
        habitats.add(h);
        }
    }
    
    public void agregarItinerario(Itinerario i) {
        if (i != null) {
        itinerarios.add(i);
        }
    }
    
    public void agregarGuia(Guia g) {
        if (g != null) {
        guias.add(g);
        }
    }
    
    public void agregarCuidador(Cuidador c) {
        if (c != null) {
        cuidadores.add(c);
        }
    }
    
    public void agregarCuidadorEspecie(CuidadorEspecie ce) {
        if (ce != null) {
            cuidadoresEspecies.add(ce);
        }

    }

    public void agregarEspecieHabitat(EspecieHabitat eh) {
        if (eh != null) {
            especiesHabitats.add(eh);
        }

    }

    public void agregarItinerarioGuia(ItinerarioGuia ig) {
        if (ig != null) {
            itinerariosGuias.add(ig);
        }

    }
    
    

    //LOGIN USUARIO
    
    public Empleado buscarUsuario(String usr, String pwd)
    {
        Empleado usuario = null;

        for (Empleado u : usuarios)
        {
            if (u.coincidenUsrPwd(usr,pwd))
            {
                usuario = u;
                break;
            }
        }
        return usuario;
    }

    //MOSTRAR LISTA
    public void mostrarEspecies() {
        int contador = 1;

        for (Especie e : especies) {
            System.out.println(contador++ + "- " + e.mostrar() + "\n");
        }
    }
    
    public void mostrarEmpleados() {
        int contador = 1;

        for (Empleado u : usuarios) {
            System.out.println(contador++ + "-");
            u.mostrarDatos();
        }
    }

    public void mostrarHabitat() {
        int contador = 1;

        for (Habitat h : habitats ) {
            System.out.println(contador++ + "-" + h.mostrar());
            
        }
    }
    
    public void mostrarItinerarios() {
        int contador = 1;

        for (Itinerario i : itinerarios) {
            System.out.println(contador++ + "- " + i.mostrar() + "\n");
        }
    }
    
    
    public void mostrarZonas() {
        int contador = 1;

        for (Zona z : zonas) {
            System.out.println(contador++ + " - " + z.mostrar() + "\n");
        }
    }
    
    
    public void mostrarCuidadores() {
        for (Empleado e : usuarios) {
            if (e instanceof Cuidador) {
                e.mostrarDatos();
            }
        }
    }

    public void mostrarGuias() {
        for (Empleado e : usuarios) {
            if (e instanceof Guia) {
                e.mostrarDatos();
            }
        }
    }
    
    public void mostrarCuidadoresEspecies() {
        for (CuidadorEspecie i : cuidadoresEspecies) {
            System.out.println(i.mostrar());
        }
    }

    public void mostrarItinerarioGuia() {
        for (ItinerarioGuia ig : itinerariosGuias) {
            System.out.println(ig.mostrar());
        }
    }
    
    
    
        
    //SELECCIONAR LISTA
    public Empleado 
        Usuario()
    {
        int opcion;
        int contador = 1;
        String posiblesUsuarios = "";
        
        for(Empleado p : usuarios)
        {
            posiblesUsuarios += "" + contador++ + "- " + p + "\n";
        }
        
        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > usuarios.size());
        
        return usuarios.get(opcion-1);
    }
    
    public Especie elegirEspecie()
    {
        int opcion;
        int contador = 1;
        String posiblesEspecies = "";
        
        for(Especie e : especies)
        {
            posiblesEspecies += "" + contador++ + "- " + e + "\n";
            
        }
        
        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > especies.size());
        
        return especies.get(opcion-1);
    }
    
    public Zona elegirZona()
    {
        int opcion;
        int contador = 1;
        String posiblesZonas = "";
        
        for(Zona z : zonas)
        {
            posiblesZonas += "" + contador++ + "- " + z + "\n";
        }
        
        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > zonas.size());
        
        return zonas.get(opcion-1);
    }
    
    public Habitat elegirHabitat()
    {
        int opcion;
        int contador = 1;
        String posiblesHabitats = "";
        
        for(Habitat h : habitats)
        {
            posiblesHabitats += "" + contador++ + "- " + h + "\n";
        }
        
        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > habitats.size());
        
        return habitats.get(opcion-1);
    }
    
    public Itinerario elegirItinerario()
    {
        int opcion;
        int contador = 1;
        String posiblesItinerarios = "";
        
        for(Itinerario i : itinerarios)
        {
            posiblesItinerarios += "" + contador++ + "- " + i + "\n";
        }
        
        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > itinerarios.size());
        
        return itinerarios.get(opcion-1);
    }
    
    public Guia elegirGuia()
    {
        int opcion;
        int contador = 1;
        String posiblesGuias = "";
        
        for(Guia g : guias)
        {
            posiblesGuias += "" + contador++ + "- " + g + "\n";
        }
        
        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > guias.size());
        
        return guias.get(opcion-1);
    }
    
    public Cuidador elegirCuidador()
    {
        int opcion;
        int contador = 1;
        String posiblesCuidadores = "";
        
        for(Cuidador c : cuidadores)
        {
            posiblesCuidadores += "" + contador++ + "- " + c + "\n";
        }
        
        do
        {
            System.out.println("\nIngrese opcion: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > cuidadores.size());
        
        return cuidadores.get(opcion-1);
    }
    
/*******************nueva implementacion*************************/
   
    public void eliminarEspecie(){
        mostrarEspecies();
        especies.remove(elegirEspecie());
    }
    
    public void eliminarEmpleado(){
        mostrarEmpleados();
        usuarios.remove(Usuario());
    }
    
    public void eliminarHabitat() {
        mostrarHabitat();
        habitats.remove(elegirHabitat());
    }
    
    public void eliminarItinerario() {
        mostrarItinerarios();
        itinerarios.remove(elegirItinerario());
    }

    public void eliminarZona(){
        mostrarZonas();
        zonas.remove(elegirZona());
    }
    
}
