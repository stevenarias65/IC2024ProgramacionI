package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InicioE {

    public static void main(String[] args) {

        boolean opcion = true;

        while (opcion) {

            try {
                
                int arreglo[] = {1,2};

                Scanner entrada = new Scanner(System.in);

                System.out.println("Favor digitar 2 numeros");
                int numero1 = entrada.nextInt();
                int numero2 = entrada.nextInt();

                int resultado = numero1 / numero2;

                System.out.println("El resultado es: " + resultado);
                System.out.println(arreglo[2]);

            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error en el arreglo");
            } catch (InputMismatchException e) {
                System.out.println("Digito un dato erroneo");
            } catch (Exception e) {
                System.out.println("Ocurrio algo intenta de nuevo");
            }finally{
                System.out.println("siempre se ejectua");
            }

        }

    }

}
