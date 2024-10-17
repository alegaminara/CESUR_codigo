import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero, numero_cifras;

        System.out.println("Escriba un número ");
        numero = input.nextInt();
        numero = numero / 10;
        numero_cifras = 1;

        while (numero != 0) {
            numero = numero / 10;
            numero_cifras = numero_cifras +1; 
        }

        System.out.println("Número de cifras " + numero_cifras);

        input.close();
    }
}
