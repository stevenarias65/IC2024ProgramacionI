
package Vistas;

import Clases.DiasSemana;
import Clases.Peces;
import Clases.Perros;

public class Inicio {
    
    public static void main(String[] args) {
        
        
        Perros perro1 = new Perros("Prueba", "Alimentacion", "habitad", 0, "Mucho", 0, "Muy bueno");
        Peces pez1 = new Peces("Especie Peces", "Alimentacion peces", "Habitad peces", 0);
        
        
        perro1.setTamaño(10);
        pez1.setTamaño(20);
        
        System.out.println(perro1.getTamaño());
        System.out.println(pez1.getTamaño());
        
       
        System.out.println(DiasSemana.LUNES);
        
        
        
    }
    
}
