package ejercicios_segundo_examen.examenHecho;

public class ej1 {
    public static boolean tieneFormatoNIF(char[] arr){
        if (arr.length == 8) {
            for (int i = 0; i < arr.length; i++) {
                if (esLetraMayuscola(arr[arr.length - 1]) == true) {
                    if (esDigito(arr[i]) == true) {
                        return true;
                    } else {
                        return false;
                    } 
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        
        return false;
    }

    public static boolean esLetraMayuscola (char caracter){
        return 'A' <= caracter && caracter <= 'Z';
    }
    public static boolean esDigito (char caracter){
        return '0' <= caracter && caracter <= '9';
    }

    public static void main(String[] args) {
        char[] arrayNIF = {'3', '2', '8','3', '2', '8','7', '5', 'A',};
        boolean resultado = tieneFormatoNIF(arrayNIF);
        System.out.println(resultado);
    }
}