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

        int numeroBuscado;

        System.out.println("Ingrese el numero que desea buscar:");
        numeroBuscado = entrada.nextInt();

        boolean encontrado = false;

        int mayor = numeros[0];
        int menor = numeros[0];


        for (int i = 0; i < 15; i++) {

            if (numeros[i] == numeroBuscado) {
                System.out.println("Numero encontrado en el indice: " + i);
                encontrado = true;
            }
                
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            
        }

        if (!encontrado) {
            System.out.println("El numero no se encuentra en el vector.");
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

        System.out.println("Vector completo:");

        for (int i = 0; i < 15; i++) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}