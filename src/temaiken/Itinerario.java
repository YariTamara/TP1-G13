package temaiken;

import java.util.Scanner;

/**
 * La clase Itinerario representa un recorrido del Temaiken.
 * Cada itinerario tiene un código único, una duración estimada, longitud,
 * un límite de visitantes y una cantidad estimada de especies que se pueden observar.
 * 
 */
class Itinerario {

    private int cod;
    private int duracion; // en minutos
    private double longitud; // en kilómetros
    private int maxVisitantes;
    private int especiesVistas;

    /**
     * Constructor que inicializa todos los atributos del itinerario.
     *
     * @param cod            código identificador del itinerario
     * @param duracion       duración estimada del recorrido (en minutos)
     * @param longitud       longitud del recorrido (en kilómetros)
     * @param maxVisitantes  cantidad máxima de visitantes permitidos
     * @param especiesVistas número estimado de especies que se pueden observar
     */
    public Itinerario(int cod, int duracion, double longitud, int maxVisitantes, int especiesVistas) {
        this.cod = cod;
        this.duracion = duracion;
        this.longitud = longitud;
        this.maxVisitantes = maxVisitantes;
        this.especiesVistas = especiesVistas;
    }

    /**
     * Constructor por defecto. Solicita los datos del itinerario al usuario mediante consola.
     */
    public Itinerario() {
        ingresarAtributos();
    }

    /**
     * Devuelve el código identificador del itinerario.
     *
     * @return el código del itinerario
     */
    public int getCodigo() {
        return cod;
    }

    /**
     * Devuelve una representación en texto del itinerario.
     *
     * @return una cadena con los principales atributos del itinerario
     */
    public String mostrar() {
        return "Codigo: " + cod
             + ". Duracion (Min.): " + duracion
             + ". Longitud (Km.): " + longitud
             + ". Visitantes: " + maxVisitantes
             + ". Especies: " + especiesVistas;
    }

    /**
     * Método privado que solicita por consola todos los datos del itinerario.
     * Utilizado por el constructor por defecto.
     */
    private void ingresarAtributos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el código: ");
        cod = scanner.nextInt();

        System.out.println("Ingresar la duración (minutos): ");
        duracion = scanner.nextInt();

        scanner.nextLine(); // Limpia el buffer

        System.out.println("Ingresar la longitud (km): ");
        longitud = scanner.nextDouble();

        scanner.nextLine(); // Limpia el buffer

        System.out.println("Ingresar máximo de visitantes: ");
        maxVisitantes = scanner.nextInt();

        System.out.println("Ingresar número de especies vistas: ");
        especiesVistas = scanner.nextInt();
    }
}

