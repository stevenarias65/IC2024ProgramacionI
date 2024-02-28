package Vistas;

//Inicio
import Clases.Personas;
import java.util.Scanner;

public class Inicio {

    //Atributos
    //Metodos
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite cuantas personas desea ingresar");
        int cantidad = entrada.nextInt();

        //Tipo[] nombre = new tipo[cantidad]
        Personas[] arregloPersonas = new Personas[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Digite el nombre de la persona: " + (i + 1));
            String nombre = entrada.next();
            System.out.println("Digite la cedulade la persona: " + (i + 1));
            String cedula = entrada.next();
            System.out.println("digite el telefonode la persona: " + (i + 1));
            String telefono = entrada.next();
            System.out.println("digite la edadde la persona: " + (i + 1));
            int edad = entrada.nextInt();
            System.out.println("digite la alturade la persona: " + (i + 1));
            double altura = entrada.nextDouble();

            Personas objetoIngresar = new Personas(nombre, cedula, telefono, edad, altura);
            arregloPersonas[i] = objetoIngresar;

        }

        //For normal
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Los datos de la persona numero " + (i + 1));
            System.out.println("El nombre es: " + arregloPersonas[i].getNombre());
            System.out.println("La cedula es: " + arregloPersonas[i].getCedula());
            System.out.println("El telefono es: " + arregloPersonas[i].getTelefono());
            System.out.println("La edad es: " + arregloPersonas[i].getEdad());
            System.out.println("La altura es: " + arregloPersonas[i].getAltura());
            System.out.println("----------------------------------------------");
            
        }
        
        System.out.println("For mejorado");
        //For mejorado 
        for (Personas datos : arregloPersonas) {
            
            System.out.println("Los datos de la persona numero ");
            System.out.println("El nombre es: " + datos.getNombre());
            System.out.println("La cedula es: " + datos.getCedula());
            System.out.println("El telefono es: " + datos.getTelefono());
            System.out.println("La edad es: " + datos.getEdad());
            System.out.println("La altura es: " + datos.getAltura());
            System.out.println("----------------------------------------------");
            
            
        }
        
        
        
        
        
//        String nombre = entrada.next();
//        String cedula = entrada.next();
//        String telefono = entrada.next();
//        int edad = entrada.nextInt();
//        double altura = entrada.nextDouble();
//        
//        //Objeto 1
//        Personas persona1 = new Personas(nombre, cedula, telefono, edad, altura);
//        
//        System.out.println(persona1.toString());
//        
//        
//        
//        //Objeto 2
//        Personas persona2 = new Personas("22222", "8612312");
//        //Objeto 3
//        Personas persona3 = new Personas();
//        
//        
//        persona1.setEdad(20);
//        
//        int edadMostrada = persona1.getEdad();
//       
//        System.out.println(persona1.getEdad());
//        
//        
//        
//        persona1.setNombre("Ronald Arias");
//        persona1.setCedula("111111111");      
//        persona1.nombre = "Diego Miranda";
//        int edad = -10;
//        
//        if (edad < 0) {
//            System.out.println("Error datos no validos negativos");
//        }else{
//            persona1.edad = edad;
//        }
//        
//        
//        persona2.nombre = "Diego Araya";
//        
//        System.out.println(persona1.nombre);
    }

}
