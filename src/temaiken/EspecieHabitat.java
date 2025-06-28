package temaiken;

public class EspecieHabitat {
    private String nombreEspecie;
    private String nombreHabitat;

    public EspecieHabitat(String nombreEspecie, String nombreHabitat) {
        this.nombreEspecie = nombreEspecie;
        this.nombreHabitat = nombreHabitat;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public String getNombreHabitat() {
        return nombreHabitat;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public void setNombreHabitat(String nombreHabitat) {
        this.nombreHabitat = nombreHabitat;
    }
    
    public String mostrar(){
        return "Nombre Especie: "+nombreEspecie+" Nombre Habitat: "+nombreHabitat;
    }
    
}
