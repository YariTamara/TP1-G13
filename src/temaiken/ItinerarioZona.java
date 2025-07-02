package temaiken;

/**
 * La clase ItinerarioZona representa la relación entre un Itinerario y una Zona
 * dentro del Temaiken.
 */
public class ItinerarioZona {

    private int codigoItinerario;
    private int codigoZona;
    private String nombreZona;

    /**
     * Constructor que crea una relación entre un itinerario y una zona.
     *
     * @param itinerario el itinerario en el cual se recorrerá la zona
     * @param zona la zona asignada al itinerario
     */
    public ItinerarioZona(Itinerario itinerario, Zona zona) {
        this.codigoItinerario = itinerario.getCodigo();
        this.codigoZona = zona.getCod();
        this.nombreZona = zona.getNombre();
    }

    /**
     * Devuelve el código del itinerario asociado.
     *
     * @return el código del itinerario
     */
    public int getCodigoItinerario() {
        return codigoItinerario;
    }

    /**
     * Devuelve el código de la zona asociada.
     *
     * @return el código de la zona
     */
    public int getCodigoZona() {
        return codigoZona;
    }

    /**
     * Devuelve el nombre de la zona asociada.
     *
     * @return el nombre de la zona
     */
    public String getNombreZona() {
        return nombreZona;
    }

    /**
     * Devuelve una cadena con el vínculo entre itinerario y zona.
     *
     * @return una cadena con los códigos del itinerario y la zona
     */
    public String mostrar() {
        return "Codigo Itinerario: " + codigoItinerario + 
               ". Codigo Zona: " + codigoZona;
    }
}


