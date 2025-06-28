package temaiken;

import java.util.Scanner;

public class Especie {
    private Integer cod;
    private String nombreEsp;
    private String nombreCien;
    private String descripcion;

    public Especie(Integer cod, String nombreEsp, String nombreCien, String descripcion)
    {
        this.cod = cod;
        this.nombreEsp = nombreEsp;
        this.nombreCien = nombreCien;
        this.descripcion = descripcion;
    }

    public Especie() {
        ingresarAtributos();
    }
    
    
    public String mostrar()
    {
        return "Nombre Español: " + nombreEsp + ". Nombre Cientifico: " + nombreCien + ". Descripcion: " + descripcion;
    }

    
    private void ingresarAtributos(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el código: ");
        cod = scanner.nextInt();
        
        scanner.nextLine();//Limpio el Buffer
        
        System.out.println("Ingresar el nombre de la especie: ");
        nombreEsp = scanner.nextLine();
 
        System.out.println("Ingresar el nombre de científico de la especie: ");
        nombreCien = scanner.nextLine();

        System.out.println("Ingresar la descripción de la especie: ");
        descripcion = scanner.nextLine();

    }

    public Integer getCod() {
        return cod;
    }

    public String getNombreEsp() {
        return nombreEsp;
    }
   
    
    
}
