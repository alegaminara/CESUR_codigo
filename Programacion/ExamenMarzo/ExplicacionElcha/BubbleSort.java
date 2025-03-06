public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];      // Guardamos arr[j] en una variable temporal
                    arr[j] = arr[j + 1];    // Sobrescribimos arr[j] con arr[j + 1]
                    arr[j + 1] = temp;      // Asignamos el valor guardado en temp a arr[j + 1]

                }
            }
        }
    }

// for (i = 0; i < n - 1; i++) hace múltiples pasadas por el array.
// for (j = 0; j < n - i - 1; j++) compara elementos adyacentes.
// if (arr[j] > arr[j + 1]) intercambia los valores si están en el orden incorrecto.

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
