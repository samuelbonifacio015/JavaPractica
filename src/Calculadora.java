//libreria de Scanner para input del usuario
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        //se crea un nuevo scanner para permitir input
        Scanner sc = new Scanner(System.in);
        /**
         * creamos un objeto booleano "continuar que sea true
         * para que se inicie la aplicacion
         */
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido a mi primera aplicacion de calculadora");
            System.out.print("Ingresa tu primer numero: ");
            double num1 = sc.nextDouble();

            System.out.print("Ingresa el segundo numero: ");
            double num2 = sc.nextDouble();

            System.out.println("Elige una operacion: ");
            System.out.println("1.Suma ");
            System.out.println("2.Resta ");
            System.out.println("3.Multiplicacion ");
            System.out.println("4.Division ");
            System.out.println("5.Salir ");
            System.out.println();
            System.out.println("Elige una opcion: ");
            int opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if(num1 != 0){
                        System.out.println("Resultado: " + (num1 / num2));
                    }else{
                        System.out.println("El numero no es valido, intenta nuevamente");
                    }
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
            }
            System.out.println();
        }
        sc.close();
    }
}

