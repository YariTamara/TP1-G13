
package temaiken;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class CuidadorEspecie {
    private String nombreCuidador;
    private String nombreEspecie;
    private LocalDateTime  fechaInicial;
    private LocalDateTime  fechaFinal;

    public CuidadorEspecie(String nombreCuidador, String nombreEspecie, LocalDateTime  fechaInicial, LocalDateTime  fechaFinal) {
        this.nombreCuidador = nombreCuidador;
        this.nombreEspecie = nombreEspecie;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }

    public String getNombreCuidador() {
        return nombreCuidador;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public LocalDateTime getFechaInicial() {
        return fechaInicial;
    }

    public LocalDateTime getFechaFinal() {
        return fechaFinal;
    }
    
    public String mostrar(){
        return "Cuidador: "+nombreCuidador+ " Especie: "  +nombreEspecie+ " Inicio: " +fechaInicial+ " Final: " +fechaFinal; 
    }
    
    
}
