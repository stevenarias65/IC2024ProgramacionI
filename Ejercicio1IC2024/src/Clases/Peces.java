
package Clases;

public class Peces extends Animales{
    
    private String tipoAletas;
    private String tipoescamas;
    private String color;

    public Peces(String especies, String alimentacion, String habitad, double tamaño) {
        super(especies, alimentacion, habitad, tamaño);
    }

    public String getTipoAletas() {
        return tipoAletas;
    }

    public void setTipoAletas(String tipoAletas) {
        this.tipoAletas = tipoAletas;
    }

    public String getTipoescamas() {
        return tipoescamas;
    }

    public void setTipoescamas(String tipoescamas) {
        this.tipoescamas = tipoescamas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

   
}
