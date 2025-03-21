import java.util.Arrays;

public class BubbleSort2D {
    public static int[][] bubbleSort2D(int[][] matriz) {
        int columnas = matriz.length;
        int filas = matriz[0].length;
        
        // Copiar la matriz correctamente
        int[][] matrizOrdenada = new int[columnas][filas];
        for (int i = 0; i < columnas; i++) {
            matrizOrdenada[i] = matriz[i].clone();
        }

        // Bubble Sort 2D
        for (int k = 0; k < columnas * filas; k++) {
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < filas - 1; j++) {
                    if (matrizOrdenada[i][j] > matrizOrdenada[i][j + 1]) {
                        int temp = matrizOrdenada[i][j];
                        matrizOrdenada[i][j] = matrizOrdenada[i][j + 1];
                        matrizOrdenada[i][j + 1] = temp;
                    }
                }
            }
        }
        return matrizOrdenada;
    }

    public static void main(String[] args) {
        int[][] matriz = {{5, 3, 8}, {1, 9, 2}, {4, 6, 7}};
        int[][] resultado = bubbleSort2D(matriz);

        // Imprimir la matriz ordenada
        for (int[] fila : resultado) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
