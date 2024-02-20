public class P1_PraktikumFungsi_16 {
    public static void main(String[] args) {
        String[] toko = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
        int[][] bungatoko = {{10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}};
        double[]harga = {75000,50000,60000,10000};
        int[] pengurangan = {1,2,0,5};
        printPattern(toko, bungatoko);
        pendapatanHabis(harga, bungatoko);
        stokRoyal4(bungatoko);
        penguranganStok(bungatoko,pengurangan);
        
    }
    public static void printPattern(String[] toko, int bungatoko[][]) {
        System.out.println("===============================================");
        System.out.println("Toko\t\tAglonema Keladi\tAlocasla Mawar");
        System.out.println("===============================================");
        for (int i = 0; i < toko.length; i++) {
            System.out.print(toko[i] + "\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(bungatoko[i][j] + "\t ");
            }
            System.out.println();
        }
    }
    public static void pendapatanHabis (double[] harga, int[][] bungatoko){
        System.out.println("===============================================");
        System.out.println("Pendapatan");
        System.out.println("===============================================");
        int totalPendapatan = 0;
        for (int i = 0; i < bungatoko.length; i++) {
            int kolomPendapatan = 0;
            for (int j = 0; j < bungatoko[i].length; j++) {
                kolomPendapatan += bungatoko[i][j];
            }
            totalPendapatan += kolomPendapatan * harga[i];
            System.out.println("Pendapatan RoyalGarden " + (i+1) + " : " + kolomPendapatan * harga[i]);
        }
        System.out.println("Total Pendapatan    : " + totalPendapatan);
    }
    public static void stokRoyal4 (int[][] bungatoko){
        System.out.println("==================================");
        System.out.println("      Royal Garden 4 (STOK)");
        System.out.println("==================================");
        System.out.println("Aglonema Keladi  Alocasla Mawar");
        System.out.println("==================================");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < bungatoko.length; j++) {
                System.out.print(bungatoko[3][j]+"\t");
            }
        }System.out.println();
        System.out.println("==================================");
    }
    public static void penguranganStok (int[][] bungatoko, int[]penguragan){
        for (int i = 0; i < bungatoko.length; i++) {
            System.out.print("-"+penguragan[i]+"\t");
        }
        System.out.println();
        System.out.println("==================================");
        System.out.println("     Royal Garden 4 (UPDATE)");
        System.out.println("==================================");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < penguragan.length; j++) {
                System.out.print(bungatoko[3][j]-penguragan[j]+"\t");
            }
        }
    }
}
