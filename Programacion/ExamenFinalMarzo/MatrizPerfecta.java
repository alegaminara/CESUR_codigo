
import java.util.Arrays;

public class MatrizPerfecta {
    public static boolean Matrix(int[][] matriz){
        int columna = matriz.length, suma = 0, sumaDiagonalPrincipal = 0, sumaDiagonalSecundaria = 0;
        int[] primeraColumna = new int[columna], ultimaFila = new int[columna];

        for (int[] fila : matriz) {
            if (fila.length != columna) {
                return false;
            }
        }
        for (int num : matriz[0]) {
            suma += num;
        } 
        for (int i = 0; i < columna; i++) {
            int sumaFilas = 0, sumaColumnas = 0;
            for (int j = 0; j < columna; j++) {
                sumaFilas += matriz[i][j];
                sumaColumnas += matriz[j][i];
            }
            if (sumaFilas != suma || sumaColumnas != suma) {
                return false;
            }
        }
        for (int i = 0; i < columna; i++) {
            primeraColumna[i] = matriz[i][0];
            ultimaFila[i] = matriz[columna-1][i];
        }
        Arrays.sort(primeraColumna);
        Arrays.sort(ultimaFila);
        if (!Arrays.equals(primeraColumna, ultimaFila)) {
            return false;
        }
        for (int i = 0; i < columna; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][columna - i - 1];
        }
        if (sumaDiagonalPrincipal != suma && sumaDiagonalSecundaria != suma) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] matriz1 = {
            {2, 4, 3},
            {4, 3, 2},
            {3, 2, 4}
        };
        int[][] matriz2 = {
            { 2, 7, 6 },
            { 9, 5, 1 },
            { 4, 3, 8 }
        };
        boolean resultado = Matrix(matriz1);
        boolean resultado2 = Matrix(matriz2);
        System.out.println("Resultado 1 = " + resultado);
        System.out.println("Resultado 2 = " + resultado2);
    }
}