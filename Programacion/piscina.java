public class piscina {
    public static void main(String[] args) {
        
        int llarg, ample1, ample2, profunditat1, profunditat2;
        int area1, area2, vol1, vol2, nouProfunditat1, nouProfunditat2, nouVol1, nouVol2;
        llarg = 300;
        ample1 = 150;
        profunditat1 = 20;
        ample2 = 80;
        profunditat2 = 35;

        area1 = llarg*ample1;
        area2 = llarg*ample2;
        vol1 = area1*profunditat1;
        vol2 = area2*profunditat2;
        int ampleTot = ample1+ample2;
        int llargTot = llarg;
        int areaTot = area1+area2;
        int volTot = vol1+vol2;
        nouProfunditat1 = profunditat2;
        nouProfunditat2 = profunditat1;
        nouVol1 = area1*nouProfunditat1;
        nouVol2 = area2*nouProfunditat2;

        System.out.println("Área 1 = " + area1 + ", área 2 = " + area2);
        System.out.println("Área tot = " + areaTot);
        System.out.println("Volumen 1 = " + vol1 + ", volumen 2 = " + vol2);
        System.out.println("Volumen tot = " + volTot);
        System.out.println("Largo piscinas juntas = " + llargTot);
        System.out.println("Amplio piscinas juntas = " + ampleTot);
        System.out.println("Volumen nuevo piscina 2 = " + nouVol1);
        System.out.println("Volumen nuevo piscina 1 = " + nouVol2);

    }
}
