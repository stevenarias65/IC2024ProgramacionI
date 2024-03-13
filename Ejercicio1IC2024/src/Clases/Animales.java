
package Clases;


public class Animales {
    
    private String especies;
    private String alimentacion;
    private String habitad;
    private double tamaño;

    public Animales(String especies, String alimentacion, String habitad, double tamaño) {
        this.especies = especies;
        this.alimentacion = alimentacion;
        this.habitad = habitad;
        this.tamaño = tamaño;
    }

    public String getEspecies() {
        return especies;
    }

    public void setEspecies(String especies) {
        this.especies = especies;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
    
    
    
    
}
