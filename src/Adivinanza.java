import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main (String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        /**
         * variable (final): reservada para variables que nunca cambian su valor
         * como si se tratase de una constante
         */
        final int MAX_INTENTOS = 5;  //maximo intentos 5
        final int MIN = 1;           //valor minimo (num 1)
        final int MAX = 10;         //valor maximo (num 10)

        int bestScore = Integer.MAX_VALUE; //maximo valor (mejor puntaje)
        boolean jugar = true;  //variable para iniciar el bucle

        System.out.println("Bienvenido a mi primer juego!");
        while(jugar){
            int objetivo = rand.nextInt(MAX - MIN + 1) + MIN;

            System.out.println("\nHe pensado un número entre " + MIN + " y " + MAX + ".");
            System.out.println("Tienes " + MAX_INTENTOS + " intentos. ¡Buena suerte!");

            int intentos = 0;
            boolean acertado = false;

            while (intentos < MAX_INTENTOS) {
                System.out.println("\nLo siento, se han acabado los intentos");
                System.out.println("\nGame over :(");
            }
        }
        sc.close();
    }
}
