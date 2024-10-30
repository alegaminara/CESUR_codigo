import java.util.Scanner;

public class esPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero = input.nextInt();

        while (numero >= 2) {
            if (numero % 2 == 0) {
                System.out.println("Este número no es primo");
            } else {
                System.out.println("Este número es primo");
            }
        }

        input.close();
    }
}