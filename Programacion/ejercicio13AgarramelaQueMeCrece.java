import java.util.Random; // Importa la clase Random para generar números aleatorios
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class ejercicio13AgarramelaQueMeCrece {
    public static void main(String[] args) {
        int[] array = new int[100];  // Declara un arreglo de 100 elementos
        Random r = new Random();     // Crea un objeto Random para generar números aleatorios
        Scanner sc = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada del usuario

        // Llenamos el arreglo con números aleatorios entre 0 y 500 (inclusive)
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(501); // nextInt(501) genera un número entre 0 y 500 (inclusive)
        }

        // Mostramos el arreglo original
        System.out.println("Array:");
        displayArray(array, -1);  // Llamamos al método displayArray, pasamos -1 porque no hay nada resaltado aún

        // Pedimos al usuario que elija entre resaltar el máximo o el mínimo
        int choice = 0;
        for (int i = 0; i < 1; i++) {  // Un solo ciclo para pedir la opción
            System.out.println("Do you want to highlight the (1) maximum or (2) minimum?");
            System.out.print("Enter your choice (1 or 2): ");
            choice = sc.nextInt();  // Leemos la opción del usuario
            if (choice != 1 && choice != 2) {  // Si la opción no es válida, mostramos un mensaje de error
                System.out.println("Invalid choice. Please enter 1 or 2.");
                i--; // Decrementamos 'i' para repetir el ciclo y pedir una opción válida
            }
        }

        // Determinamos el índice del valor máximo o mínimo dependiendo de la opción del usuario
        int index = (choice == 1) ? findMaxIndex(array) : findMinIndex(array);

        // Mostramos el arreglo nuevamente, pero ahora con el valor resaltado
        System.out.println("Highlighted Array:");
        displayArray(array, index);  // Llamamos al método displayArray con el índice del valor resaltado

        sc.close();  // Cerramos el objeto Scanner
    }

    // Método para mostrar el arreglo. Si el índice de resaltar es diferente de -1, se resalta ese valor.
    public static void displayArray(int[] array, int highlightIndex) {
        for (int i = 0; i < array.length; i++) {
            if (i == highlightIndex) {  // Si el índice actual es el de resaltar, lo mostramos con asteriscos
                System.out.printf("**%3d** ", array[i]);
            } else {
                System.out.printf("%3d ", array[i]);  // Si no es el índice resaltado, solo mostramos el número
            }
        }
        System.out.println();  // Imprimimos una nueva línea después de mostrar el arreglo
    }

    // Método para encontrar el índice del valor máximo en el arreglo
    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;  // Empezamos asumiendo que el primer elemento es el máximo
        for (int i = 1; i < array.length; i++) {  // Comenzamos desde el segundo elemento
            if (array[i] > array[maxIndex]) {  // Si encontramos un número mayor que el actual máximo
                maxIndex = i;  // Actualizamos el índice del máximo
            }
        }
        return maxIndex;  // Devolvemos el índice del valor máximo
    }

    // Método para encontrar el índice del valor mínimo en el arreglo
    public static int findMinIndex(int[] array) {
        int minIndex = 0;  // Empezamos asumiendo que el primer elemento es el mínimo
        for (int i = 1; i < array.length; i++) {  // Comenzamos desde el segundo elemento
            if (array[i] < array[minIndex]) {  // Si encontramos un número menor que el actual mínimo
                minIndex = i;  // Actualizamos el índice del mínimo
            }
        }
        return minIndex;  // Devolvemos el índice del valor mínimo
    }
}