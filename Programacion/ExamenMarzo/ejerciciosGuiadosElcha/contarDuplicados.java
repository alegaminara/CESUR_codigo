import java.util.HashMap;

public class contarDuplicados {
    public static HashMap<Integer, Integer> contar(int[] numeros) {
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        
        for (int num : numeros) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }
        
        return frecuencia;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        HashMap<Integer, Integer> resultado = contar(nums); // {1=1, 2=2, 3=3, 4=1, 5=2}

        System.out.println("Frecuencia de los números:" + resultado);
    }
}
