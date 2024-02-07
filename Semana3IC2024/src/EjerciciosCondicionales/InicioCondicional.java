package EjerciciosCondicionales;

public class InicioCondicional {

    public static void main(String[] args) {
        int nota = 1000;
        if (nota > 60) {
            System.out.println("El estudiante paso");
        } else {
            System.out.println("El estudiante reporbo");
        }

        if (nota < 50) {
            System.out.println("Nota inferios a 50");
        } else if (nota < 60) {
            System.out.println("Nota inferior a 60");
        } else if (nota < 80) {
            System.out.println("la nota es inferior a 80");
        } else if (nota < 90) {
            System.out.println("nota inferior a 90");
        } else {
            System.out.println("la nota es mayor a 90");
        }

        String condicion = nota > 70 ? "Paso" : "Se quedo";
        boolean condicionboolena = nota >= 70 ? true : false;
        
        
        
        int numero = 11;
        
        switch (numero) {
            case 1:
                System.out.println("El dato es un uno");
                break;
            case 2,3,4,5:
                System.out.println("El dato es 1,2,3,4 o 5");
                break;
            default:
                System.out.println("el dato es otro");
        }

    }

}
