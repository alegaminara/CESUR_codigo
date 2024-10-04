package Programacion;

import java.util.Scanner;

public class segToMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entra un valor en segundos");
        float inputNumero = input.nextFloat();
        
        float minutos = inputNumero / 60;
    
        System.out.println(inputNumero + " segundos = " + minutos +" minutos");
    
        input.close();    
    }
}
