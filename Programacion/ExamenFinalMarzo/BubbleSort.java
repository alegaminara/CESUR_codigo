
import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int[] arrayOrdenado = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arrayOrdenado[i] = arr[i];
        } //Fácilmente reemplazable con un int[] arrayOrdenado = arr.clone();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrayOrdenado[j] > arrayOrdenado[j + 1]) {
                    int temp = arrayOrdenado[j];      // Guardamos arrayOrdenado[j] en una variable temporal
                    arrayOrdenado[j] = arrayOrdenado[j + 1];    // Sobrescribimos arrayOrdenado[j] con arrayOrdenado[j + 1]
                    arrayOrdenado[j + 1] = temp;      // Asignamos el valor guardado en temp a arrayOrdenado[j + 1]
                }
            }
        }
        return arrayOrdenado;
    }

// for (i = 0; i < n - 1; i++) hace múltiples pasadas por el array.
// for (j = 0; j < n - i - 1; j++) compara elementos adyacentes.
// if (arr[j] > arr[j + 1]) intercambia los valores si están en el orden incorrecto.

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] resultado = bubbleSort(arr);
        System.out.println(Arrays.toString(resultado)); 
    }
}
