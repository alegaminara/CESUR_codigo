import java.util.HashMap;  // Importamos la clase HashMap

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();  // Creamos un HashMap donde la clave es un String y el valor es un Integer
        
        stock.put("Libro A", 10);  // Agregamos un libro con cantidad 10
        stock.put("Libro B", 5);
        stock.put("Libro C", 7);

        System.out.println("Stock de Libro A: " + stock.get("Libro A"));  // Obtenemos el valor asociado a "Libro A"

        stock.put("Libro A", 8); // Modificamos el stock de "Libro A" a 8
        System.out.println("Nuevo stock de Libro A: " + stock.get("Libro A"));  // Verificamos el nuevo valor
    }
}
