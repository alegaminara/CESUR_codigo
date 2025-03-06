public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int inicio = 0, fin = arr.length - 1;  // Definimos los límites de la búsqueda

        while (inicio <= fin) {  // Mientras la búsqueda sea válida
            int medio = (inicio + fin) / 2;  // Calculamos el punto medio

            if (arr[medio] == target) return medio;  // Si encontramos el valor, retornamos la posición
            else if (arr[medio] < target) inicio = medio + 1;  // Si target es mayor, ignoramos la mitad izquierda
            else fin = medio - 1;  // Si target es menor, ignoramos la mitad derecha
        }

        return -1;  // Retornamos -1 si no encontramos el valor
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};  // Array ordenado
        int target = 12;
        
        int resultado = binarySearch(arr, target);
        System.out.println("El elemento está en la posición: " + resultado);
    }
}
