package temaiken;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase {@code Zona} representa una zona geográfica dentro del parque,
 * definida por un código identificador, un nombre, una extensión (en km²)
 * y una lista de especies asignadas a esa zona.
 * <p>
 * Esta clase permite:
 * <ul>
 *   <li>Asignar especies a una zona</li>
 *   <li>Visualizar las especies de una zona</li>
 *   <li>Mostrar la información básica de la zona</li>
 * </ul>
 * 
 * Se utiliza tanto para gestión como para visualización dentro del sistema de administración del parque Temaikèn.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 * 
 * @see Especie
 */
public class Zona {
    
    private int cod;
    private String nombre;
    private double extension;
    private ArrayList<Especie> especies = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    /**
     * Constructor por defecto.
     */
    public Zona() {
        // Constructor vacío
        ingresarAtributos();
    }

    /**
     * Constructor completo que inicializa todos los atributos de la zona.
     *
     * @param cod código único de la zona
     * @param nombre nombre de la zona
     * @param extension extensión en kilómetros cuadrados
     */
    public Zona(int cod, String nombre, double extension) {
        this.cod = cod;
        this.nombre = nombre;
        this.extension = extension;
    }

    /**
     * Permite cargar los datos de una zona mediante entrada por consola.
     */
    private void ingresarAtributos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el código: ");
        cod = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer

        System.out.println("Ingresar el nombre de la Zona: ");
        nombre = scanner.nextLine();

        System.out.println("Ingresar la extension de la Zona: ");
        extension = scanner.nextDouble();
        scanner.nextLine(); // Limpia el buffer
    }

    /**
     * Agrega una especie a la zona actual.
     *
     * @param e la especie a agregar
     */
    public void agregarEspecie(Especie e) {
        especies.add(e);
    }

    /**
     * Muestra por consola la lista de especies asociadas a esta zona.
     */
    public void verEspecies() {
        for (Especie e : especies) {
            System.out.println("- " + e.getNombreEsp());
        }
    }

    /**
     * Devuelve una representación breve de la zona, incluyendo su nombre y extensión.
     *
     * @return cadena con nombre y extensión
     */
    public String mostrar() {
        return nombre + ". " + extension + "km2.";
    }

    /**
     * Obtiene el nombre de la zona.
     *
     * @return nombre de la zona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el código identificador de la zona.
     *
     * @return código numérico de la zona
     */
    public int getCod() {
        return cod;
    }
}

