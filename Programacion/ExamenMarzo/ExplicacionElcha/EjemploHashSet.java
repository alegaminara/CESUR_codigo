import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();  // Creamos un HashSet de Strings
        
        nombres.add("Juan");  // Agregamos "Juan" al conjunto
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Juan");  // No se añadirá porque HashSet no permite duplicados

        System.out.println(nombres);  // Imprimimos el conjunto
    }
}
