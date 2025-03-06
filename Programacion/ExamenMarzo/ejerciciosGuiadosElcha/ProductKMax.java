public class ProductKMax {
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int calcularProducto(int[] arr, int k) {
        bubbleSort(arr);
        int producto = 1;
        
        for (int i = arr.length - k; i < arr.length; i++) {
            producto *= arr[i];
        }
        
        return producto;
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        int resultado = calcularProducto(arr, 3); // 7 * 9 * 4 = 252

        System.out.println("Producto de los 3 números más grandes: " + resultado);
    }
}
