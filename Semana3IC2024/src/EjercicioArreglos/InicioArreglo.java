/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioArreglos;

import java.util.Scanner;

/**
 *
 * @author steven
 */
public class InicioArreglo {
    public static void main(String[] args) {
        
        int[] edad = new int[10];
        int cantidades[] = new int[10];
        
        
        edad[0] = 12;
        edad[1] = 22;
        edad[2] = 12;
        edad[3] = 12;
        edad[4] = 12;
        edad[5] = 15;
        edad[6] = 12;
        edad[7] = 12;
        edad[8] = 12;
        edad[9] = 12;
        
        
        String[] nombres = {"Ronald","Diego","Antony","Josepth","Joel","Stanley"};
        
        for (int i = 0; i < nombres.length; i++) {
            
            System.out.println("El nombre es: "+ nombres[i]);
            
        }
        
        
        
        Scanner entrada = new Scanner(System.in);
        int cantidadArreglo = entrada.nextInt();
        
        int notas[] = new int[cantidadArreglo];
        
        for (int i = 0; i < notas.length; i++) {
            
            notas[i] = entrada.nextInt();
            
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Los datos son: " + notas[i]);
        }
      
         
        
        
        
        
    }
}
