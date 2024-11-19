import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Inserte el número de números que insertará para calcular la media");
        int inputNumero = input.nextInt();

        int numeros[] = new int[inputNumero];

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Inserte el número " + (i+1));
            numeros[i] = input.nextInt();
            suma += numeros[i];
        } System.out.print("Para los números " + Arrays.toString(numeros));
        
        double media = (double) suma / inputNumero;
        System.out.print(" la media es de " + media);

        input.close();
    }
}
