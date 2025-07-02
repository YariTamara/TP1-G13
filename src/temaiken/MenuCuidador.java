package temaiken;

import java.util.Scanner;

/**
 * La clase MenuCuidador implementa la interfaz Menu y representa
 * el menú de opciones disponible para los empleados con rol de Cuidador.
 * 
 * Proporciona funcionalidades específicas de consulta de información relacionadas
 * con las especies que cuidan.
 * Este menú está diseñado solo para lectura y no permite modificaciones sobre los datos.
 *
 */
public class MenuCuidador implements Menu {

    /**
     * Muestra el menú interactivo para cuidadores, permitiéndoles visualizar
     * información relevante dentro del sistema.
     * 
     * @param baseDatos referencia al sistema de base de datos
     * @param e el empleado (cuidador) que accede al menú
     */
    @Override
    public void mostrarMenu(BaseDeDatos baseDatos, Empleado e) {
        Scanner scanner = new Scanner(System.in);
        Integer opcion;

        do {
            System.out.println(
                    "\n\nMENU DE CUIDADOR:\n\n"
                    + "1. Mostrar Datos propios\n"
                    + "2. Mostrar lista de Especies por Habitat\n"
                    + "3. Mostrar lista de Especies por Zona\n"
                    + "4. Mostrar lista de Especies y Cuidadores asignados\n"
                    + "5. Salir\n\n"
                    + "Ingrese opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Muestra los datos del propio cuidador
                    e.mostrarDatos();
                    break;
                case 2:
                    // Muestra todas las especies agrupadas por hábitat
                    baseDatos.mostrarEspeciesHabitats();
                    break;
                case 3:
                    // Muestra todas las especies agrupadas por zona
                    baseDatos.mostrarEspeciesZonas();
                    break;
                case 4:
                    // Muestra todas las especies y los cuidadores asignados a ellas
                    baseDatos.mostrarCuidadoresEspecies();
                    break;
                case 5:
                default:
                    // Finaliza el menú
                    return;
            }
        } while (opcion != 5);
    }
}

