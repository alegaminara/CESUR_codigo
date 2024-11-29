package ejercicios_segundo_examen;

public class pares {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    
        int pares = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares = array[i];
                System.out.println(pares);
            }
        }
    }
}
