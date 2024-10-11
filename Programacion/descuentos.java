import java.util.Scanner;

public class descuentos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int Descuento1 = 25;
        final int Descuento2 = 50;

        double importeInicial, importeDescontado, importeFinal;
        
        System.out.println("Importe Inicial");
        importeInicial = input.nextDouble();
        System.out.println("Número de piezas");
        int numPiezas = input.nextInt();

        if ( numPiezas <= 3 ) {
            importeDescontado = importeInicial * (Descuento1/100.0);
        } else {
            importeDescontado = importeInicial * (Descuento2/100.0);
        }importeFinal = importeInicial - importeDescontado;

        System.out.println(String.format("Precio final: %.2f", importeFinal));

        input.close();
    }
}