import java.util.Scanner;;

public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        for (int i = 1; i <= 10;  i++) {
            int res;
            res = numero*i;
            System.out.println(res);
        }

        input.close();
    }
}
