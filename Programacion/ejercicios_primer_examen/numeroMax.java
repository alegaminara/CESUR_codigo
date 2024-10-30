import java.util.Scanner;;

public class numeroMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        int numero3 = input.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1 + " es el número más grande de los tres");
        }
        if (numero3 > numero3 && numero2 > numero1) {
            System.out.println(numero2 + " es el número más grande de los tres");
        }
        if (numero3 > numero1 && numero3 > numero2) {
            System.out.println(numero3 + " es el número más grande de los tres");
        }

        input.close();
    }
}
