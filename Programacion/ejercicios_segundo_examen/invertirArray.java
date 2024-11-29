package ejercicios_segundo_examen;

public class invertirArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        } for (int i = 0; i < arrayInvertido.length; i++) {
            System.out.println(arrayInvertido[i]);
        }
    }
}
