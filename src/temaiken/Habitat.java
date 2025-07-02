package temaiken;

import java.util.Scanner;

/**
 * La clase Habitat representa el entorno natural de una o varias especies dentro del Temaiken.
 * Contiene información como el nombre del hábitat, su clima, tipo de vegetación, continente y un código identificador.
 * 
 * Esta clase permite crear hábitats a partir de parámetros o mediante entrada por consola.
 * 
 */
public class Habitat {

    private int cod;
    private String nombre;
    private String clima;
    private String tipoVegetacion;
    private String continente;

    /**
     * Constructor que inicializa todos los atributos de un hábitat.
     * 
     * @param cod             el código identificador del hábitat
     * @param nombre          el nombre del hábitat
     * @param clima           el tipo de clima predominante
     * @param tipoVegetacion  el tipo de vegetación del hábitat
     * @param continente      el continente al que pertenece el hábitat
     */
    public Habitat(int cod, String nombre, String clima, String tipoVegetacion, String continente) {
        this.cod = cod;
        this.nombre = nombre;
        this.clima = clima;
        this.tipoVegetacion = tipoVegetacion;
        this.continente = continente;
    }

    /**
     * Constructor por defecto. Solicita los atributos del hábitat mediante consola.
     */
    public Habitat() {
        ingresarAtributos();
    }

    /**
     * Devuelve el código identificador del hábitat.
     * 
     * @return el código del hábitat
     */
    public int getCod() {
        return cod;
    }

    /**
     * Devuelve el nombre del hábitat.
     * 
     * @return el nombre del hábitat
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Solicita al usuario los datos necesarios para crear un objeto Habitat.
     *
     */
    private void ingresarAtributos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el código: ");
        cod = scanner.nextInt();

        scanner.nextLine(); // Limpia el buffer

        System.out.println("Ingresar el nombre del Habitat: ");
        nombre = scanner.nextLine();

        System.out.println("Ingresar el clima del Habitat: ");
        clima = scanner.nextLine();

        System.out.println("Ingresar el tipo de vegetación del habitat: ");
        tipoVegetacion = scanner.nextLine();

        System.out.println("Ingresar el continente del habitat: ");
        continente = scanner.nextLine();
    }

    /**
     * Devuelve una representación textual básica del hábitat.
     * 
     * @return una cadena con los principales atributos del hábitat
     */
    public String mostrar() {
        return nombre + " " + clima + " " + tipoVegetacion + " " + continente;
    }
}

