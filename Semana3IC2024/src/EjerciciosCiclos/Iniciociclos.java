
package EjerciciosCiclos;


public class Iniciociclos {
    
    
    //for,while,do while
    
    public static void main(String[] args) {
        
        for (int i = 10; i >= 1; i--) {
            System.out.println("el valor de i "+i);
            
        }
        
        int contador = 0;
        while(contador < 10){
            System.out.println("hola");
            contador++ ;
        }
        
        
        
        int contadordo = 0;
        
        do {  
            
            System.out.println("Hola desde do");
            contadordo++;
        } while (contadordo<10);
        
        
        
    }
    
    
    
}
