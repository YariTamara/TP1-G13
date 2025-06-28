package temaiken;

import java.util.ArrayList;
import java.util.Scanner;

public class Zona {
    private int cod;
    private String nombre;
    private double extension;
    private ArrayList<Especie> especies = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public Zona() {
        
    }

    public Zona(int cod,String nombre, double extension) {
        this.nombre = nombre;
        this.extension = extension;
        this.cod = cod;
    }
   
    private void ingresarAtributos(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el código: ");
        cod = scanner.nextInt();
        
        scanner.nextLine();//Limpio el Buffer
        
        System.out.println("Ingresar el nombre de la Zona: ");
        nombre = scanner.nextLine();
        
        System.out.println("Ingresar la extension de la Zona: ");
        extension = scanner.nextDouble();
        scanner.nextLine();//Limpio el Buffer
        
    }
    
    public void agregarEspecie(Especie e){
        especies.add(e);
    }
    
    public void agregarEspecie(BaseDeDatos bd){
        int codEspecie;
        System.out.println("Ingrese el codigo de la especie");
        codEspecie = scanner.nextInt();
        especies.add(bd.elegirEspecie());
    }
    public void verEspecies(){
      for(Especie e : especies){
          System.out.println(e.getCod() + e.getNombreEsp());
      }
    }
    public String mostrar(){
        return nombre + " " + extension;
    }
    
    
}
