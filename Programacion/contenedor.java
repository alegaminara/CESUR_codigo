import java.util.Scanner;

public class contenedor {
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You're not old enough!");
        } else {
            System.out.println("Access granted - You're old enough");
        } Scanner input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        checkAge(20);
    }

}
