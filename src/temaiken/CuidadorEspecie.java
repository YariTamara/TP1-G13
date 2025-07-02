package temaiken;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * La clase CuidadorEspecie representa la asignación de un cuidador a una especie
 * dentro de un intervalo de tiempo determinado.
 * 
 * Esta clase mantiene una relación entre el nombre del cuidador, el nombre de la especie,
 * y las fechas de inicio y fin de esa asignación.
 */
public class CuidadorEspecie {
    
    private String nombreCuidador;
    private String nombreEspecie;
    private Date fechaInicial;
    private Date fechaFinal;

    /**
     * Crea una nueva asignación entre un cuidador y una especie, con fechas de inicio y fin.
     * 
     * @param cuidador     el cuidador asignado
     * @param especie      la especie a la que se asigna el cuidador
     * @param fechaInicial la fecha de inicio de la asignación
     * @param fechaFinal   la fecha de finalización de la asignación
     */
    public CuidadorEspecie(Cuidador cuidador, Especie especie, Date fechaInicial, Date fechaFinal) {
        this.nombreCuidador = cuidador.getNombre();
        this.nombreEspecie = especie.getNombreEsp();
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }

    /**
     * Devuelve el nombre del cuidador asignado.
     * 
     * @return el nombre del cuidador
     */
    public String getNombreCuidador() {
        return nombreCuidador;
    }

    /**
     * Devuelve el nombre de la especie asignada.
     * 
     * @return el nombre de la especie
     */
    public String getNombreEspecie() {
        return nombreEspecie;
    }

    /**
     * Devuelve la fecha de inicio de la asignación.
     * 
     * @return la fecha inicial
     */
    public Date getFechaInicial() {
        return fechaInicial;
    }

    /**
     * Devuelve la fecha de finalización de la asignación.
     * 
     * @return la fecha final
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Devuelve una representación en texto de la asignación del cuidador a la especie.
     * Incluye el nombre del cuidador, especie, fecha de inicio y finalización.
     * 
     * @return una cadena con los datos de la asignación
     */
    public String mostrar() {
        return "Cuidador: " + nombreCuidador + ". Especie: " + nombreEspecie 
               + ". Inicio: " + fechaInicial + ". Final: " + fechaFinal;
    }
}
