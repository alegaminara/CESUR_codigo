package ejercicios_segundo_examen;

public class mediana {
    // public static void main(String[] args) {
    //     int[] array = {1, 2, 3, 4, 5};

    //     int suma = 0; 
    //     int media = 0;

    //     for (int i = 0; i < array.length; i++) {
    //         suma += array[i];
    //         media = (suma / array.length);    
    //     } System.out.println(media);
    // }
    
    public static int media(int[] array, int suma, int media){
        suma = 0;
        media = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            media = (suma/array.length);
        }
        
        System.out.println("La media del array es " + media);

        return 0;
    }

    public static void main(String[] args) {
        int[] arrayList = {256, 698, 451, 12, 1023, 46465};

        media(arrayList, 0, 0);
    }
}
