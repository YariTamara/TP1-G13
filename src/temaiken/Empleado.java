package temaiken;

import java.util.Date;
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String direccion;
    private Integer telefono;
    private Date fechaIngreso;
    private String user;
    private String pass;
    private Menu permisosMenu;


    
    
    public Empleado(String nombre, String direccion, Integer telefono, Date fechaIngreso, String user, String pass)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
        this.user = user;
        this.pass = pass;
    }
    
    public void mostrarDatos()
    {
        
    }
    
    public boolean mostrarMenu(BaseDeDatos baseDatos, Empleado u){
        permisosMenu.mostrarMenu(baseDatos, u);
        return false;
    }
    
    public boolean coincidenUsrPwd(String usr, String pwd)
    {
        return this.user.equalsIgnoreCase(usr) && this.pass.equals(pwd);
    }

    public void setPermisosMenu(Menu permisosMenu)
    {
        this.permisosMenu = permisosMenu;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public Integer getTelefono()
    {
        return telefono;
    }

    public Date getFechaIngreso()
    {
        return fechaIngreso;
    }

//**************************Nuevo constructor*************************************************//
    public Empleado(){
        ingrearAtributos();
    }

    private void ingrearAtributos(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el nombre: ");
        nombre = scanner.nextLine();
        
        System.out.println("Ingresar el telefono: ");
        telefono = scanner.nextInt();
        
        scanner.nextLine();//Limpia el buffer
 
        System.out.println("Ingresar el usuario: ");
        user = scanner.nextLine();

        System.out.println("Ingresar la contraseña: ");
        pass = scanner.nextLine();
        
        fechaIngreso = new Date();
        
    }

}
