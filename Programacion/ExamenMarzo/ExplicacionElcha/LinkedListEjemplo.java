class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class LinkedListEjemplo {
    Nodo cabeza;

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListEjemplo lista = new LinkedListEjemplo();
        lista.agregar(5);
        lista.agregar(10);
        lista.agregar(15);
        
        lista.mostrar();
    }
}


// class Nodo { int dato; Nodo siguiente; } define un nodo con un valor y una referencia al siguiente.
// class LinkedListEjemplo { Nodo cabeza; } almacena la referencia al primer nodo.
// agregar(int dato) crea un nuevo nodo y lo añade al final.
// mostrar() recorre la lista e imprime cada valor.
// main() crea una lista y agrega nodos con valores 5, 10 y 15.