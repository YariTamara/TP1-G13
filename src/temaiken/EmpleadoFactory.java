package temaiken;

public class EmpleadoFactory {

    public static Empleado crearUsuario(String tipo) {

        switch(tipo.toLowerCase()) {

            case "cuidador":
                return new Cuidador();
    
            case "guia":
                return new Guia();
                
            default:
                throw new IllegalArgumentException("Usuario Desconocido");
        }

    }
}