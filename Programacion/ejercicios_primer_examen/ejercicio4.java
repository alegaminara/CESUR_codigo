public class ejercicio4 {
    public static int costeConsulta(int cita){
        int precio;

        if (cita <= 2) {
            precio = 200;
            System.out.println(precio);
        } else if (cita > 2 && cita <= 5) {
            precio = 150;
            System.out.println(precio);
        } else if (cita > 5) {
            precio = 100;
            System.out.println(precio);
        }else {
            return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        costeConsulta(1);
    }
}
