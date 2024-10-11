import java.util.Scanner;

public class nombre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indique cual es su nombre");
        String nombre = input.nextLine();

        System.out.println("¡Hola! Mi nombre es " + nombre);

        input.close();
    }
}
