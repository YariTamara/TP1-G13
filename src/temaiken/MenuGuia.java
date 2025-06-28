package temaiken;

import java.util.Scanner;

public class MenuGuia implements Menu {

    @Override
    public void mostrarMenu(BaseDeDatos baseDatos, Empleado e)
    {
        Scanner scanner = new Scanner(System.in);
        Integer opcion;
        
        System.out.println(
                "\n\nMENU DE GUIA:\n\n"
                + "1. Mostrar Datos propios\n"
                + "2. Mostrar lista de Itinerarios\n"
                + "3. Mostrar lista de Itinerarios - Guia\n"
                + "4. Salir\n\n"
                + "Ingrese opcion: ");
        
        opcion = scanner.nextInt();
        
        switch (opcion){
            case 1: e.mostrarDatos();
            case 2: baseDatos.mostrarItinerarios();
            case 3: baseDatos.mostrarItinerarioGuia();
            case 4: return;
        }
    }
    
}
