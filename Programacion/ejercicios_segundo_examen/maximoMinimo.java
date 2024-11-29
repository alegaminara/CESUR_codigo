package ejercicios_segundo_examen;

public class maximoMinimo {
    // public static void main(String[] args){
        
    //     int[] arrayList = {1, 2, 3, 4, 5};
        
    //     int maximo = arrayList[0];
    //     int minimo = arrayList[0];

    //     System.out.println("El array está compuesto por: ");

    //     for (int i = 0; i < arrayList.length; i++) {
    //         System.out.println(arrayList[i]);
    //         if (arrayList[i] > maximo) {
    //             maximo = arrayList[i];
    //         } if (arrayList[i] < minimo) {
    //             minimo = arrayList[i];
    //         }
    //     }    
    //     System.out.println("Máximo " + maximo);    
    //     System.out.println("Mínimo " + minimo);    
    // }
    public static int maxOmin(int[] array, int maximo, int minimo){
        maximo = array[0];
        minimo = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            } if (array[i] < minimo) {
                minimo = array[i];
            }

        }

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);

        return 0;
    }
    public static void main(String[] args) {
        int[] arrayList = {256, 698, 12005, 458, 46, 1, 654, 8561};

        maxOmin(arrayList, 0, 0);
    }
}
