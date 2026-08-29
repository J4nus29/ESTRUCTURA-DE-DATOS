import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Punto 1: Crear y llenar el vector
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

        // Punto 2: Buscar un valor en el vector
        int numeroBuscado;

        System.out.println("Ingrese el numero que desea buscar:");
        numeroBuscado = entrada.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 15; i++) {

            if (numeros[i] == numeroBuscado) {
                System.out.println("Numero encontrado en el indice: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El numero no se encuentra en el vector.");
        }

        // Punto 3: Determinar el mayor y el menor
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i < 15; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

        // Punto 4: Identificar multiplos
        int x;

        System.out.println("Ingrese un numero para buscar sus multiplos:");
        x = entrada.nextInt();

        boolean hayMultiplos = false;

        for (int i = 0; i < 15; i++) {

            if (numeros[i] % x == 0) {
                System.out.println("Multiplo encontrado: " + numeros[i]);
                hayMultiplos = true;
            }
        }

        if (!hayMultiplos) {
            System.out.println("No hay multiplos de " + x + " en el vector.");
        }

        // Punto 5: Calcular la suma
        int suma = 0;

        for (int i = 0; i < 15; i++) {
            suma += numeros[i];
        }

        System.out.println("Suma total: " + suma);

        // Punto 6: Calcular promedio y crear nuevo vector
        double promedio = (double) suma / 15;

        System.out.println("Promedio: " + promedio);

        int cantidadMayores = 0;

        for (int i = 0; i < 15; i++) {

            if (numeros[i] > promedio) {
                cantidadMayores++;
            }
        }

        int[] numerosMayores = new int[cantidadMayores];
        int posicion = 0;

        for (int i = 0; i < 15; i++) {

            if (numeros[i] > promedio) {
                numerosMayores[posicion] = numeros[i];
                posicion++;
            }
        }

        if (cantidadMayores > 0) {

            System.out.println("Numeros mayores que el promedio:");

            for (int i = 0; i < cantidadMayores; i++) {
                System.out.println(numerosMayores[i]);
            }

            System.out.println(
                    "Cantidad de numeros por encima del promedio: " + cantidadMayores
            );

        } else {
            System.out.println("No hay numeros mayores que el promedio.");
        }

        entrada.close();
    }
}