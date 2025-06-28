
package temaiken;

import java.time.LocalTime;


public class ItinerarioGuia {
    private int codigoItinerario;
    private String nombreGuia;
    private LocalTime horaIni;
    private LocalTime horaFin;

    public ItinerarioGuia(int codigoItinerario, String nombreGuia, LocalTime horaIni, LocalTime horaFin) {
        this.codigoItinerario = codigoItinerario;
        this.nombreGuia = nombreGuia;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
    }

    public int getCodigoItinerario() {
        return codigoItinerario;
    }

    public String getNombreGuia() {
        return nombreGuia;
    }

    public LocalTime getHoraIni() {
        return horaIni;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }
    
    public String mostrar(){
        return "Codigo Itinerario "+codigoItinerario + " Guia: "+nombreGuia+
                " Hora Ini: "+horaIni+ " Hora Fin: "+horaFin;
    }
    
}
