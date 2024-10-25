public class numeroMaximo {
    public static int numero(int A, int B){
        if (A >= B) {
            return A;
        } else {
            return B;
        }
    }
    public static void main(String[] args) {
        numero(5, 6);
    }
}