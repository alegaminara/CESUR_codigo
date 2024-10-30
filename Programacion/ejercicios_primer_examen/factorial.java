public class factorial {
    public static void main(String[] args) {
        int numero = 5;
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        System.out.println(resultado);
    }
}
