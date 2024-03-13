
package Clases;


public class Perros extends Animales implements CicloVida{
    
    private String tipoPelaje;
    private double tamaño;
    private String pedigree;

    public Perros(String especies, String alimentacion, String habitad, double tamaño,String TipoPelaje,double tamañoPerros, String pedigree) {
        super(especies, alimentacion, habitad, tamaño);
        this.tipoPelaje = TipoPelaje;
        this.tamaño = tamañoPerros;
        this.pedigree = pedigree;
        
    }

    
    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public double getTamaño() {
        System.out.println("Se retorno el tamaño del perro");
        return tamaño;
    }

    @Override
    public void setTamaño(double tamaño) {
        System.out.println("Se estalebio el tamaño del perro");
        this.tamaño = tamaño;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

 

    @Override
    public void crecer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public void morir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reporducir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void nacer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
