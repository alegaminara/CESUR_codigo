package Programacion;

import java.util.Scanner;

public class segToMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entra un valor en segundos");
        int inputNumero = input.nextInt();
        
        int minutos = inputNumero / 60;
        int residuoSegundos = inputNumero % 60;
        
        System.out.println(inputNumero + " segundos = " + minutos + "," + residuoSegundos +" minutos");
    
        input.close();    
    }
}
