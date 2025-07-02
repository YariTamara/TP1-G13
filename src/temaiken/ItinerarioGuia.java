package temaiken;

import java.time.LocalTime;

/**
 * La clase ItinerarioGuia representa la asignación de un Guia a un Itinerario
 * en un horario determinado.
 */
public class ItinerarioGuia {

    private int codigoItinerario;
    private String nombreGuia;
    private LocalTime horaIni;
    private LocalTime horaFin;

    /**
     * Constructor que crea una relación entre un Itinerario y un Guia, incluyendo los horarios asignados.
     * 
     * @param itinerario el itinerario asignado
     * @param guia el guía asignado al itinerario
     * @param horaIni hora de inicio del itinerario
     * @param horaFin hora de finalización del itinerario
     */
    public ItinerarioGuia(Itinerario itinerario, Guia guia, LocalTime horaIni, LocalTime horaFin) {
        this.codigoItinerario = itinerario.getCodigo();
        this.nombreGuia = guia.getNombre();
        this.horaIni = horaIni;
        this.horaFin = horaFin;
    }

    /**
     * Devuelve el código del itinerario asignado.
     * 
     * @return el código del itinerario
     */
    public int getCodigoItinerario() {
        return codigoItinerario;
    }

    /**
     * Devuelve el nombre del guía asignado.
     * 
     * @return el nombre del guía
     */
    public String getNombreGuia() {
        return nombreGuia;
    }

    /**
     * Devuelve la hora de inicio del itinerario.
     * 
     * @return la hora de inicio
     */
    public LocalTime getHoraIni() {
        return horaIni;
    }

    /**
     * Devuelve la hora de finalización del itinerario.
     * 
     * @return la hora de finalización
     */
    public LocalTime getHoraFin() {
        return horaFin;
    }

    /**
     * Devuelve una representación textual del itinerario asignado al guía.
     * 
     * @return una cadena con los detalles del itinerario y guía
     */
    public String mostrar() {
        return "Codigo Itinerario: " + codigoItinerario +
               ". Guia: " + nombreGuia +
               ". Hora Ini: " + horaIni +
               ". Hora Fin: " + horaFin;
    }
}

