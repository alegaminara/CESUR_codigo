public class VerificarDiagonales {
    public static boolean diagonalesIguales(int[][] matriz) {
        int n = matriz.length;
        int valorDiagonal = matriz[0][0];

        for (int i = 0; i < n; i++) {
            if (matriz[i][i] != valorDiagonal || matriz[i][n - i - 1] != valorDiagonal) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {2, 3, 2},
            {4, 2, 5},
            {2, 7, 2}
        };

        boolean resultado = diagonalesIguales(matriz); // false

        System.out.println("¿Las diagonales son iguales? " + resultado);
    }
}
