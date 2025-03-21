public class Recursividad {
    public static int sumarDigitos(int num){
        if (num < 10) return num;
        return (num % 10) + sumarDigitos(num/10);
    }
    public static void main(String[] args) {
        System.out.println(sumarDigitos(654321));
    }
}
