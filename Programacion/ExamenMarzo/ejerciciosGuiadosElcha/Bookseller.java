import java.util.HashMap;

public class Bookseller {
    HashMap<String, Integer> stock;

    public Bookseller() {
        stock = new HashMap<>();
    }

    public void agregarLibro(String titulo, int cantidad) {
        stock.put(titulo, stock.getOrDefault(titulo, 0) + cantidad);
    }

    public int consultarStock(String titulo) {
        return stock.getOrDefault(titulo, -1); // Si no existe, retorna -1
    }

    public static void main(String[] args) {
        Bookseller libreria = new Bookseller();
        libreria.agregarLibro("1984", 10);
        libreria.agregarLibro("El Hobbit", 5);
        libreria.agregarLibro("1984", 3); // Agregamos más stock

        int stock1984 = libreria.consultarStock("1984"); // Debe devolver 13
        int stockHobbit = libreria.consultarStock("El Hobbit"); // Debe devolver 5

        System.out.println("Stock de 1984: " + stock1984);
        System.out.println("Stock de El Hobbit: " + stockHobbit);
    }
}
