package temaiken;

import java.util.Scanner;

/**
 * La clase MenuGuia implementa la interfaz Menu y representa
 * el menú específico para los empleados con rol de Guía.
 Mmenú limitado a la visualización.
 *
 */
public class MenuGuia implements Menu {

    /**
     * Muestra el menú interactivo del guía, permitiendo acceder a diversas vistas
     * relacionadas con los itinerarios y zonas asignadas.
     *
     * @param baseDatos referencia al sistema de base de datos con toda la información
     * @param e el empleado (guía) que accede al sistema
     */
    @Override
    public void mostrarMenu(BaseDeDatos baseDatos, Empleado e) {
        Scanner scanner = new Scanner(System.in);
        Integer opcion;

        do {
            System.out.println(
                    "\n\nMENU DE GUIA:\n\n"
                    + "1. Mostrar Datos propios\n"
                    + "2. Mostrar lista de Itinerarios\n"
                    + "3. Mostrar lista de Itinerarios - Guia\n"
                    + "4. Mostrar lista de Itinerarios - Zonas\n"
                    + "5. Salir\n\n"
                    + "Ingrese opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Muestra los datos personales del guía
                    e.mostrarDatos();
                    break;
                case 2:
                    // Muestra todos los itinerarios disponibles
                    baseDatos.mostrarItinerarios();
                    break;
                case 3:
                    // Muestra las asignaciones entre itinerarios y guías
                    baseDatos.mostrarItinerarioGuia();
                    break;
                case 4:
                    // Muestra las asignaciones entre itinerarios y zonas
                    baseDatos.mostrarItinerarioZona();
                    break;
                case 5:
                default:
                    // Salir del menú
                    return;
            }
        } while (opcion > 5); // Validación de salida
    }
}
