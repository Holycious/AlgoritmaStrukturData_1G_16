package UTS;

import java.util.Scanner;

public class SiswaLeonMain {
    public static void main(String[] args) {
        Scanner inputLeon = new Scanner(System.in);
        PencarianSiswaLeon ListSiswaLeon = new PencarianSiswaLeon();
        int jmlSiswaLeon = 6;
        int menuLeon;

            for (int j = 0; j < jmlSiswaLeon; j++) {
                System.out.println("======================");
                System.out.println("Siswa ke-" + (j+1));
                System.out.println("======================");
                System.out.print("Masukkan NISN   : ");
                long nisnLeon = inputLeon.nextLong();
                System.out.print("Masukkan NAMA   : ");
                String namaLeon = inputLeon.next();
                System.out.print("Masukkan ALAMAT : ");
                String alamatLeon = inputLeon.next();
                System.out.print("Masukkan TAHUN  : ");
                int tahunLeon = inputLeon.nextInt();
                System.out.print("Masukkan NILAI  : ");
                double nilaiLeon = inputLeon.nextDouble();

                SiswaLeon mhs = new SiswaLeon(nisnLeon,namaLeon,alamatLeon,tahunLeon,nilaiLeon);
                ListSiswaLeon.tambahLeon(mhs);
            }
        do {
            System.out.println("========================================");
            System.out.println("      SISTEM INFORMASI AKADEMIK");
            System.out.println("========================================");
            System.out.println("(1) Tampilkan Data Siswa");
            System.out.println("(2) Pencarian Elemen Berdasarkan NISN");
            System.out.println("(3) Urutan Nilai"); 
            System.out.println("(4) Exit..."); 
            System.out.println("========================================");
            System.out.print("Menu: ");
            menuLeon = inputLeon.nextInt();
            
            switch (menuLeon){
                case 1 : 
                System.out.println("===========================");
                System.out.println("     List Data Siswa");
                System.out.println("===========================");
                ListSiswaLeon.tampilLeon();
                 break;
             
                case 2 : 
                System.out.println("===========================");
                System.out.println("     Pencarian Siswa");
                System.out.println("===========================");
                System.out.print("Masukkan NISN: ");
                long cariLeon = inputLeon.nextLong();
                int posisi = ListSiswaLeon.SearchLeon(cariLeon);
                ListSiswaLeon.TampilDataSiswaLeon(cariLeon, posisi);
                break;

                case 3:
                System.out.println("===========================");
                System.out.println("     Urutan Nilai");
                System.out.println("===========================");
                ListSiswaLeon.sortLeon();
                ListSiswaLeon.tampilLeon();
                default:
                break;
    } 
}while (menuLeon != 4);
System.out.println("Terima Kasih....");
inputLeon.close();
}
}
