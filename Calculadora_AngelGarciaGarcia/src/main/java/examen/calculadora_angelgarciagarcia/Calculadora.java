
package examen.calculadora_AngelGarciaGarcia;

import java.util.Scanner;

/**
 *
 * @author AlvaroD
 */
public class Calculadora {
    
    static Scanner scanner = new Scanner(System.in);
    static int opcion = -1; //opción del menú
    static float numero1 = 0, numero2 = 0; //Variables de entrada

    public static void main(String[] args) {

        System.out.println("Bienvenidos, esta es la calculadora creada en java si encuentras algun tipo de error en el mismo, por favor comunicalo");
        while (opcion != 0) {
            //Try catch para evitar que el programa termine si hay un error
            try {
                System.out.println("Elige opción:\n" + ""
                        + "1.- Sumar\n"
                        + "2.- Restar\n"
                        + "3.- Multiplicar\n"
                        + "4.- Dividir\n"
                        + "0.- Salir");

                System.out.println("Selecciona una opción de 0 a 4");
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1 -> {
                        pideNumeros();
                        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    }
                    case 2 -> {
                        pideNumeros();
                        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    }
                    case 3 -> {
                        pideNumeros();
                        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                    }
                    case 4 -> {
                        pideNumeros();
                        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    }
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no disponible");
                }

                System.out.println("\n");

            } catch (NumberFormatException e) {
                System.out.println("Error!");
            }
        }

    }

    //Método para recoger las variables de entrada
    public static void pideNumeros() {
        System.out.println("Introduce el primer número:");
        numero1 = Integer.parseInt(scanner.nextLine());    // si hubiera que cambiar esto tambien, solo habria que poner: numero1 = scanner.nextFloat();

        System.out.println("Introduce el segundo número:");
        numero2 = Integer.parseInt(scanner.nextLine());

    }
}
