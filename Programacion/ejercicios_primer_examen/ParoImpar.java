import java.util.Scanner;;

public class ParoImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par");
        } else {
            System.out.println(numero + " es un número impar");
        }

        input.close();
    }
}