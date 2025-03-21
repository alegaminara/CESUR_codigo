public class RecursividadInvertirDigitos {
    public static int invertirNumeroAux(int n, int resultado){
        if (n == 0) return resultado;

        int ultimoDigito = n % 10;
        resultado = resultado * 10 + ultimoDigito;

        return invertirNumeroAux(n / 10, resultado);
    }
    
    public static int invertirNumero(int n){
        return invertirNumeroAux(n, 0);
    }

    public static void main(String[] args) {
        System.out.println(invertirNumero(1234));
    }
}