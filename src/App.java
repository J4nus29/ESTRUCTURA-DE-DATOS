import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // =========================================================
        // PUNTO 1: CREAR Y LLENAR EL VECTOR
        // =========================================================

        // Creamos un vector llamado "numeros" que puede almacenar
        // 15 valores de tipo entero.
        int[] numeros = new int[15];

        // Creamos un objeto Scanner para poder leer los datos
        // que el usuario ingresa por el teclado.
        Scanner entrada = new Scanner(System.in);

        // Variable que utilizaremos para almacenar temporalmente
        // cada número que ingrese el usuario.
        int numero;

        // Recorremos las 15 posiciones del vector.
        // La variable "i" comienza en 0 porque los índices
        // de un vector empiezan desde 0 y terminan en 14.
        for (int i = 0; i < 15; i++) {

            // El bloque do-while permite pedir el número al usuario
            // al menos una vez y repetir la solicitud si el número
            // está fuera del rango permitido.
            do {
                System.out.println("Ingrese un numero entre 10 y 100:");
                numero = entrada.nextInt();

                // Verificamos si el número está fuera del rango
                // permitido: menor que 10 o mayor que 100.
                if (numero < 10 || numero > 100) {
                    System.out.println("Numero fuera del rango. Intente nuevamente.");
                }

            // Mientras el número sea inválido, se vuelve a solicitar.
            } while (numero < 10 || numero > 100);

            // Cuando el número es válido, lo guardamos en la posición
            // actual del vector.
            numeros[i] = numero;
        }

        // Mostramos todos los valores almacenados en el vector.
        System.out.println("Vector completo:");

        // Recorremos nuevamente el vector para mostrar sus elementos.
        for (int i = 0; i < 15; i++) {
            System.out.println(numeros[i]);
        }


        // =========================================================
        // PUNTO 2: BUSCAR UN VALOR EN EL VECTOR
        // =========================================================

        // Variable donde almacenaremos el número que el usuario
        // desea buscar dentro del vector.
        int numeroBuscado;

        System.out.println("Ingrese el numero que desea buscar:");
        numeroBuscado = entrada.nextInt();

        // Esta variable nos permite saber si encontramos
        // al menos una coincidencia.
        // Comenzamos suponiendo que no lo hemos encontrado.
        boolean encontrado = false;

        // Recorremos todas las posiciones del vector.
        for (int i = 0; i < 15; i++) {

            // Comparamos el elemento actual del vector con
            // el número que queremos buscar.
            if (numeros[i] == numeroBuscado) {

                // Si son iguales, mostramos el índice donde
                // encontramos el número.
                System.out.println("Numero encontrado en el indice: " + i);

                // Indicamos que sí encontramos el número.
                encontrado = true;
            }
        }

        // Si después de recorrer todo el vector "encontrado"
        // sigue siendo false, significa que el número no estaba.
        if (!encontrado) {
            System.out.println("El numero no se encuentra en el vector.");
        }


        // =========================================================
        // PUNTO 3: DETERMINAR EL MAYOR Y EL MENOR
        // =========================================================

        // Tomamos el primer elemento del vector como referencia
        // inicial tanto para el mayor como para el menor.
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorremos nuevamente el vector para comparar todos
        // sus elementos.
        for (int i = 0; i < 15; i++) {

            // Si el elemento actual es mayor que el valor
            // almacenado en "mayor", actualizamos "mayor".
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            // Si el elemento actual es menor que el valor
            // almacenado en "menor", actualizamos "menor".
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostramos el resultado obtenido.
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);


        // =========================================================
        // PUNTO 4: IDENTIFICAR MULTIPLOS
        // =========================================================

        // Variable que almacenará el número X que utilizará
        // el usuario para buscar los múltiplos.
        int x;

        System.out.println("Ingrese un numero para buscar sus multiplos:");
        x = entrada.nextInt();

        // Comenzamos suponiendo que no existen múltiplos.
        // Si encontramos uno, cambiamos su valor a true.
        boolean hayMultiplos = false;

        // Recorremos todos los elementos del vector.
        for (int i = 0; i < 15; i++) {

            // Utilizamos el operador % para obtener el residuo
            // de la división.
            // Si el residuo es 0, significa que el número
            // es múltiplo de X.
            if (numeros[i] % x == 0) {

                // Mostramos el número que es múltiplo.
                System.out.println("Multiplo encontrado: " + numeros[i]);

                // Indicamos que encontramos al menos un múltiplo.
                hayMultiplos = true;
            }
        }

        // Si no encontramos ningún múltiplo, mostramos el mensaje.
        if (!hayMultiplos) {
            System.out.println("No hay multiplos de " + x + " en el vector.");
        }


        // =========================================================
        // PUNTO 5: CALCULAR LA SUMA
        // =========================================================

        // Variable acumuladora que comienza en 0.
        int suma = 0;

        // Recorremos todos los elementos del vector.
        for (int i = 0; i < 15; i++) {

            // Vamos acumulando cada valor dentro de "suma".
            suma += numeros[i];
        }

        // Mostramos la suma total.
        System.out.println("Suma total: " + suma);


        // =========================================================
        // PUNTO 6: CALCULAR PROMEDIO Y CREAR NUEVO VECTOR
        // =========================================================

        // Calculamos el promedio dividiendo la suma entre
        // la cantidad de elementos del vector.
        // Utilizamos double porque el promedio puede tener decimales.
        double promedio = (double) suma / 15;

        System.out.println("Promedio: " + promedio);

        // Contador que almacenará cuántos números son mayores
        // que el promedio.
        int cantidadMayores = 0;

        // Recorremos el vector para contar cuántos valores
        // están por encima del promedio.
        for (int i = 0; i < 15; i++) {

            if (numeros[i] > promedio) {
                cantidadMayores++;
            }
        }

        // Creamos un nuevo vector con exactamente la cantidad
        // de posiciones que necesitamos.
        int[] numerosMayores = new int[cantidadMayores];

        // Esta variable indica en qué posición del nuevo vector
        // vamos a guardar cada número.
        int posicion = 0;

        // Recorremos nuevamente el vector original.
        for (int i = 0; i < 15; i++) {

            // Si el número es mayor que el promedio...
            if (numeros[i] > promedio) {

                // Lo copiamos al nuevo vector.
                numerosMayores[posicion] = numeros[i];

                // Avanzamos a la siguiente posición del nuevo vector.
                posicion++;
            }
        }

        // Comprobamos si encontramos números mayores que el promedio.
        if (cantidadMayores > 0) {

            System.out.println("Numeros mayores que el promedio:");

            // Recorremos el nuevo vector para mostrar
            // los valores almacenados.
            for (int i = 0; i < cantidadMayores; i++) {
                System.out.println(numerosMayores[i]);
            }

            // Mostramos cuántos números están por encima del promedio.
            System.out.println(
                    "Cantidad de numeros por encima del promedio: " + cantidadMayores
            );

        } else {

            // Si no existe ningún número mayor que el promedio,
            // mostramos este mensaje.
            System.out.println("No hay numeros mayores que el promedio.");
        }

        // Cerramos el Scanner porque ya no necesitamos
        // recibir más datos del usuario.
        entrada.close();
    }
}