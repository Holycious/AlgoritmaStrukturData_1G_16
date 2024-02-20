import java.util.Scanner;

/**
 * P1_PraktikumArray_16
 */
public class P1_PraktikumArray_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mapel[] = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Kesehatan Keselamatan Kerja",
            "Bahasa Inggris",
            "Critical Think Problem Solving",
            "Matematika Dasar"
        };
        double nilai[] = new double[8];
        String abjad[] = new String[8];
        double setara[] =new double[8];
        int bobot[] = {2,2,2,3,2,2,2,3};
        System.out.println("=============================");
        System.out.println("Program Mengitung IP SEMESTER");
        System.out.println("=============================");
        System.out.println();
        System.out.println("=============================");
        System.out.println("        Input Nilai");
        System.out.println("=============================");
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("Masukkan Nilai %s: ", mapel[i]);
            nilai[i] = input.nextDouble();
        }
        for (int i = 0; i < abjad.length; i++) {
            if (nilai[i] > 80 && nilai[i] <= 100) {
                abjad[i] = "A";
                setara[i] = 4.00;
            }
            else if (nilai[i] > 73 && nilai[i] <= 80) {
                abjad[i] = "B+";
                setara[i] = 3.50;
            }
            else if (nilai[i] > 65 && nilai[i] <= 73) {
                abjad[i] = "B";
                setara[i] = 3.00;
            }
            else if (nilai[i] > 60 && nilai[i] <= 65) {
                abjad[i] = "C+";
                setara[i] = 2.50;
            }
            else if (nilai[i] > 50 && nilai[i] <= 60) {
                abjad[i] = "C";
                setara[i] = 2.00;
            }
            else if (nilai[i] > 39 && nilai[i] <= 50) {
                abjad[i] = "D";
                setara[i] = 1.00;
            }
            else if (nilai[i]  <= 39) {
                abjad[i] = "E";
                setara[i] = 0.00;
            }

        }
        System.out.println("==================================================================================");
        System.out.println("Mata Kuliah\t\t\tNilai Angka\tNilai Huruf\t Nilai Setara");
        System.out.println("==================================================================================");
        for (int i = 0; i < mapel.length; i++) {
            System.out.println();
            System.out.printf("%-4s",mapel[i]);
            for (int j = 0; j < 1; j++) {
                if (i == 0 || i == 5 || i == 7) {
                    System.out.print("               ");    
                    System.out.print("\t"+nilai[i]);
                    System.out.print("\t\t "+abjad[i]);
                    System.out.print("\t\t  "+setara[i]);
                }
                else if (i == 2) {
                    System.out.print("          ");
                    System.out.print("\t"+nilai[i]);
                    System.out.print("\t\t "+abjad[i]);
                    System.out.print("\t\t  "+setara[i]);
                }else{
                System.out.print("\t"+nilai[i]);
                System.out.print("\t\t "+abjad[i]);
                System.out.print("\t\t  "+setara[i]);
            }
            }
        }
        System.out.println();
        System.out.println("==================================================================================");
        double totalNilai = 0;
        for (int i = 0; i < bobot.length; i++) {
            totalNilai += setara[i] * bobot[i];
        }
        totalNilai = totalNilai / 18;
        System.out.println("IP: "+totalNilai);
        input.close();
        
}
}