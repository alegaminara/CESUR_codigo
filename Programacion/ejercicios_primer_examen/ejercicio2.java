import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num > 1) {
            if (num % 2 != 0 || num == 2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            } 
        } else {
            System.out.println("false");
        }

        input.close();
    }    
}
