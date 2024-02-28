package Clases;

//Nombre
public class Personas {

    //Atributos o variables de instancia
    private String nombre;
    private String cedula;
    private String telefono;
    private int edad;
    private double altura;

    //Constructor
    public Personas(String nombre, String cedula, String telefono, int edad, double altura) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        if (edad < 0) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }

        this.altura = altura;
    }

    //Sobrecarga
    public Personas(String cedula, String telefono) {
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public Personas() {

    }

    @Override
    public String toString() {
        return " La persona tiene los siguinetes datos: " + "nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", edad=" + edad + ", altura=" + altura;
    }

    //Metodos
    //Metodos get set
    //el metodo encapsulamento - tipo metodo - nombre - parametros 
    //Tipos de metodos, void no devuelve nada
    //String devuelve un String, double devuelve, int devuelve un int, un metodo de tipo boolean devuelve un boolen
    public void setEdad(int edad) {
        if (edad < 20) {
            System.out.println("Edad incorrecta vuelve a intentar");
        } else {
            this.edad = edad;
        }
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {

        if (altura < 0) {
            System.out.println("No se permiten numeros negativos");
        } else {
            this.altura = altura;
        }

    }

}
