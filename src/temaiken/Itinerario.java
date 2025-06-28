package temaiken;

import java.util.Scanner;

class Itinerario {
    private int codigo;
    private int duracion;
    private double longitud;
    private int maxVisitantes;
    private int especiesVistas;

    public Itinerario(int codigo, int duracion, double longitud, int maxVisitantes, int especiesVistas)
    {
        this.codigo = codigo;
        this.duracion = duracion;
        this.longitud = longitud;
        this.maxVisitantes = maxVisitantes;
        this.especiesVistas = especiesVistas;
    }

    public int getCodigo()
    {
        return codigo;
    }
    
    public String mostrar(){
      return "Codigo: " + codigo + ". Duracion (Min.): " + duracion + ".Longitud (Km.): " + longitud + ". Visitantes: " + maxVisitantes + ". Especies: " + especiesVistas;  
    }

    public Itinerario() {
        ingresarAtributos();
    }

    
    private void ingresarAtributos(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el código: ");
        codigo = scanner.nextInt();
        
        System.out.println("Ingresar la duracion: ");
        duracion = scanner.nextInt();
        
        scanner.nextLine();//Limpio el Buffer
        
        System.out.println("Ingresar la longitud: ");
        longitud = scanner.nextDouble();
        
        scanner.nextLine();//Limpio el Buffer
        
        System.out.println("Ingresar maximo de visitantes: ");
        maxVisitantes = scanner.nextInt();
        
        System.out.println("Ingresar numero de espeices vistas: ");
        especiesVistas = scanner.nextInt();

    }

}
