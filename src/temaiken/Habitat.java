package temaiken;

import java.util.Scanner;

public class Habitat {
    private int cod;
    private String nombre;
    private String clima;
    private String tipoVegetacion;
    private String continente;

    public Habitat(int cod, String nombre, String clima, String tipoVegetacion, String continente)
    {
        this.cod = cod;
        this.nombre = nombre;
        this.clima = clima;
        this.tipoVegetacion = tipoVegetacion;
        this.continente = continente;
        
    }

    public Habitat(){
        ingresarAtributos();
    }
    
    private void ingresarAtributos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el código: ");
        cod = scanner.nextInt();

        scanner.nextLine();//Limpio el Buffer

        System.out.println("Ingresar el nombre del Habitat: ");
        nombre = scanner.nextLine();

        System.out.println("Ingresar el clima del Habitat: ");
        clima = scanner.nextLine();

        System.out.println("Ingresar el tipo de vegetacion del habitat: ");
        tipoVegetacion = scanner.nextLine();
        
        System.out.println("Ingresar el continente del habitat: ");
        continente = scanner.nextLine();  
    }
    
    public String mostrar(){
        return nombre + " "+clima+ " " + tipoVegetacion + " " +continente;
    }
 
}
