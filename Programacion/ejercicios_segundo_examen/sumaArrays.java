package ejercicios_segundo_examen;

public class sumaArrays {
    // public static void main(String[] args) {
    //     int [] array = {10, 20, 50, 100};

    //     int suma = 0;

    //     for (int i = 0; i < array.length; i++) {
    //         suma += array[i];
    //     }
    //     System.out.println("La suma es " + suma);
    // }
    
    public static int sumaCifras(int[] array, int suma){
        
        suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            System.out.println(suma);
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] arrayList = {10, 20, 50, 100};
        
        sumaCifras(arrayList, 0);
    }
}
