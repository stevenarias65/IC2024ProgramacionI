
package Modelos;


public class Usuarios {
    
    private String nombre;
    private String apellidos;
    private String usuarios;
    private String pass;
    private String rol;

    public Usuarios(String nombre, String apellidos, String usuarios, String pass, String rol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuarios = usuarios;
        this.pass = pass;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
