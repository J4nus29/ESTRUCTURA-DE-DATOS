import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        int[] numeros = new int[15];

        Scanner entrada = new Scanner(System.in);

        int numero;

        for (int i = 0; i < 15; i++) {

            do {
                System.out.println("Ingrese un numero entre 10 y 100:");
                numero = entrada.nextInt();

                if (numero < 10 || numero > 100) {
                    System.out.println("Numero fuera del rango. Intente nuevamente.");
                }

            } while (numero < 10 || numero > 100);

            numeros[i] = numero;
        }

        System.out.println("Vector completo:");

        for (int i = 0; i < 15; i++) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}
