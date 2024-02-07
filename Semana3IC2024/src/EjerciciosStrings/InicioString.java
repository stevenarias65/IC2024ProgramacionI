
package EjerciciosStrings;

import java.util.Scanner;


public class InicioString {
    
    //Variables de instancia o Atributos
   
    
    //Metodos 
    public static void main(String[] args) {
        
        
//        int edad = 10;
//        String nombre = "Ronald";
//        
//        System.out.println("La persona " + nombre + " tiene "+edad+" Años");

        String contrasenna = "";
        
        //Pero, si quiere utilizar una clase que debeo de hacer????
//        Scanner entrada = new Scanner(System.in);
//        
//        contrasenna = entrada.nextLine();
//        
//        System.out.println(contrasenna.length());
//        
        String mensaje = "Hola soy un mensaje en String";
        
        System.out.println(mensaje.charAt(7));
        System.out.println(mensaje.toLowerCase());
        System.out.println(mensaje.toUpperCase());
        System.out.println(mensaje.substring(0, 8));
        
        String nombre = "Ronald ";
        
        System.out.println(nombre.trim());
        
        
        System.out.println(nombre.startsWith("l"));
        System.out.println(nombre.endsWith(" "));
        
        
        String correo = "Stevenairas65@gmail.com";
        
        int posicionarroba = correo.indexOf("@");
        System.out.println(posicionarroba);
        
        System.out.println(correo.substring(posicionarroba, correo.length()));
        
        
        
        int numero2 = 12;
        String numero2encaracteres = String.valueOf(numero2);
        System.out.println(numero2encaracteres+numero2encaracteres);
        
        numero2 = Integer.parseInt(numero2encaracteres);
        System.out.println(numero2+numero2);
        
        
        String numerodoublestring = "12.1";
        double numerodouble = Double.parseDouble(numerodoublestring);
        System.out.println(numerodouble+numerodouble);
        
        
        String cadena1 = "hola";
        String cadena2 = "hola";
        
        System.out.println(cadena1.equals(cadena2));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
   
    
    
}
