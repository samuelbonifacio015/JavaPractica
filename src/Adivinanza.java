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
                intentos++;
                System.out.println("\nIntento (" + intentos + "), Ingresa tu numero: ");

                if(!sc.hasNextInt()){
                    String basura = sc.next();
                    System.out.println("Entrada inválida: '" + basura + "'. Ingresa un número entero.");
                    intentos--; // no contar intento inválido
                    continue;
                }

                int apuesta = sc.nextInt();

                //si la apuesta esta fuera del rango
                if (apuesta < MIN || apuesta > MAX) {
                    System.out.println("\nNumero esta fuera de rango. Debe estar entre 1 y 10");
                    intentos--; //no contar como intento válido
                    continue;
                }

                //si la apuesta es el objetivo
                if (apuesta == objetivo){
                    System.out.println("\n¡Correcto! Adivinaste en " + intentos + " intento(s).");
                    acertado = true;
                    if (intentos < bestScore) bestScore = intentos;
                    break;

                    //si el num apuesta es menor al objetivo, entonces el sistema indica
                    //que el num es mas alto y viceversa
                }else if (apuesta < objetivo) {
                    System.out.println("\nMas alto.");
                }else {
                    System.out.println("\nMas bajo");
                }
            }

            //si no es acertado despues de todos los intentos, se muestra gameover
            if (!acertado) {
                System.out.println("Se acabaron los intentos, el numero era: " + objetivo);
            }

            //el sistema pregunta al usuario si quiere jugar de nuevo
            System.out.println("\nDesea jugar de nuevo? (s/n)");
            String resp = sc.next();
            //jugar ve si el usuario responde s o y
            jugar = resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("y");
        }
        if (bestScore != Integer.MAX_VALUE){
            System.out.println("\nLo sentimos!, tu mejor resultado fue: " + bestScore + "intento(s).");
        }
        System.out.println("Gracias por jugar! Hasta la proxima!");
        sc.close();
    }
}
