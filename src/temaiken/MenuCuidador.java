package temaiken;

import java.util.Scanner;

public class MenuCuidador implements Menu {
    
    @Override
    public void mostrarMenu(BaseDeDatos baseDatos, Empleado e)
    {
        Scanner scanner = new Scanner(System.in);
        Integer opcion;
        
        System.out.println(
                "\n\nMENU DE CUIDADOR:\n\n"
                + "1. Mostrar Datos propios\n"
                + "2. Mostrar lista de Especies\n"
                + "3. Mostrar lista de Especies y Cuidadores asigados\n"
                + "4. Salir\n\n"
                + "Ingrese opcion: ");
        
        opcion = scanner.nextInt();
        
        switch (opcion){
            case 1: e.mostrarDatos();
            case 2: baseDatos.mostrarEspecies();
            case 3: baseDatos.mostrarCuidadoresEspecies();
            case 4: return;
        }
    }

 

}
