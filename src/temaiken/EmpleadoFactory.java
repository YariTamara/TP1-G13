package temaiken;

/**
 * La clase EmpleadoFactory implementa el patrón de diseño Factory 
 * para crear instancias de diferentes tipos en función de un tipo especificado.
 * 
 */
public class EmpleadoFactory {

    /**
     * Crea y devuelve una instancia de una subclase de Empleado según el tipo especificado.
     *
     * @param tipo una cadena que indica el tipo de empleado a crear. 
     * @return una instancia de Empleado, que puede ser Cuidador o Guia.
     * @throws IllegalArgumentException si el tipo especificado no es reconocido.
     */
    public static Empleado crearUsuario(String tipo) {
        switch (tipo.toLowerCase()) {
            case "cuidador":
                return new Cuidador();

            case "guia":
                return new Guia();

            default:
                throw new IllegalArgumentException("Usuario Desconocido");
        }
    }
}
