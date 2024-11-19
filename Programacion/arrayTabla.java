public class arrayTabla {
    public static void main(String[] args) throws InterruptedException{
            
            int[][] n = new int[3][2];
            n[0][0] = 20;
            n[1][0] = 67;
            n[1][1] = 33;
            n[2][1] = 7;
            
            int i, j;
    
            for (i = 0; i < 3; i++) {
                System.out.println("Fila: " + i);
    
                for (j = 0; j < 2; j++) {
                    System.out.printf("%10d ", n[i][j]);
                    Thread.sleep(1000);
                }
                System.out.println();
            }
        }
}