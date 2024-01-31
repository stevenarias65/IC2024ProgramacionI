//Establecer en paquete esta
package PKinicio;

import java.util.Scanner;


//crear una clase
//nivel de encapsulameinto + palabra clave de clase + nombre de la clase + llaves
public class Inicio { 
    
    //un metodo void sigmifica que no devuleve nada!!!!!!!!!!!!!!!!!!!!
    public static void main(String [] agrs){
        //Variables
        String nombre;
        String apellidos;
        int edad; 
        
        System.out.println("hola mundo");
        System.out.print("Hola \n");
        
        
        //Como Scanner es una clase que tendriamos que crear? objeto
        //Objeto
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el nombre");
        nombre = entrada.nextLine();
        System.out.println("Digite el apellido");
        apellidos = entrada.nextLine();
        System.out.println("Digite la edad");
        edad = entrada.nextInt();
        
        System.out.println("Su edad es: " + edad + "Su nombre es " + nombre +" "+ apellidos);
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        persona1.nombre = "Ronald";
        persona2.nombre = "Diego";
        
        
        
    } 
 


}
