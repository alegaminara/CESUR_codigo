public class BubbleSort2D {
    public static void bubbleSort2D(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        for (int k = 0; k < filas * columnas; k++) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas - 1; j++) {
                    if (matriz[i][j] > matriz[i][j + 1]) {
                        int temp = matriz[i][j];
                        matriz[i][j] = matriz[i][j + 1];
                        matriz[i][j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {{5, 3, 8}, {1, 9, 2}, {4, 6, 7}};
        bubbleSort2D(matriz);
    }
}
