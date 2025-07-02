package temaiken;

import java.util.Scanner;

/**
 * La clase Especie representa una especie animal en el sistema del Temaiken.
 * Contiene información como su código identificador, nombre en español, nombre científico y una descripción.
 * 
 * Esta clase permite crear objetos a partir de datos ingresados manualmente o mediante parámetros.
 * 
 * Puede ser utilizada, por ejemplo, para asociar especies a cuidadores, en registros de animales, etc.
 * 
 */
public class Especie {

    private Integer cod;
    private String nombreEsp;
    private String nombreCien;
    private String descripcion;

    /**
     * Constructor que inicializa una especie con todos sus atributos.
     * 
     * @param cod         el código numérico de la especie
     * @param nombreEsp   el nombre común de la especie en español
     * @param nombreCien  el nombre científico de la especie
     * @param descripcion una descripción breve de la especie
     */
    public Especie(Integer cod, String nombreEsp, String nombreCien, String descripcion) {
        this.cod = cod;
        this.nombreEsp = nombreEsp;
        this.nombreCien = nombreCien;
        this.descripcion = descripcion;
    }

    /**
     * Constructor por defecto que solicita los atributos de la especie por consola.
     */
    public Especie() {
        ingresarAtributos();
    }

    /**
     * Devuelve una representación en forma de cadena de los datos principales de la especie.
     * 
     * @return una cadena con el nombre en español, nombre científico y descripción
     */
    public String mostrar() {
        return "Nombre Español: " + nombreEsp + ". Nombre Cientifico: " 
             + nombreCien + ". Descripcion: " + descripcion;
    }

    /**
     * Método privado que solicita los atributos de la especie al usuario mediante consola.
     * Usado por el constructor por defecto.
     */
    private void ingresarAtributos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el código: ");
        cod = scanner.nextInt();

        scanner.nextLine(); // Limpia el buffer

        System.out.println("Ingresar el nombre de la especie: ");
        nombreEsp = scanner.nextLine();

        System.out.println("Ingresar el nombre científico de la especie: ");
        nombreCien = scanner.nextLine();

        System.out.println("Ingresar la descripción de la especie: ");
        descripcion = scanner.nextLine();
    }

    /**
     * Devuelve el código identificador de la especie.
     * 
     * @return el código
     */
    public Integer getCod() {
        return cod;
    }

    /**
     * Devuelve el nombre común en español de la especie.
     * 
     * @return el nombre en español
     */
    public String getNombreEsp() {
        return nombreEsp;
    }
}

