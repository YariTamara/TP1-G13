package temaiken;

/**
 * La clase EspecieHabitat representa la relación entre una Especie 
 * y un Habitat dentro del sistema del Temaiken.
 */
public class EspecieHabitat {

    private Especie especie;
    private Habitat habitat;

    /**
     * Crea una nueva relación entre una especie y un hábitat.
     *
     * @param especie la especie asignada al hábitat
     * @param habitat el hábitat donde se encuentra la especie
     */
    public EspecieHabitat(Especie especie, Habitat habitat) {
        this.especie = especie;
        this.habitat = habitat;
    }

    /**
     * Devuelve la especie asociada.
     *
     * @return la especie
     */
    public Especie getEspecie() {
        return especie;
    }

    /**
     * Devuelve el hábitat asociado.
     *
     * @return el hábitat
     */
    public Habitat getHabitat() {
        return habitat;
    }

    /**
     * Devuelve el nombre del hábitat asociado a esta relación.
     *
     * @return el nombre del hábitat
     */
    public String getHabitatNombre() {
        return habitat.getNombre();
    }
}
