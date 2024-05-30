package Kuis2;

import java.util.Scanner;

public class RestoMain16 {
    public static void main(String[] args) {
        Scanner leon16 = new Scanner(System.in);
         Antrian16 DoubleLL16 = new Antrian16();
        
        System.out.println("======== QUIZ 2 PRAKTIKUM ASD TI ========");
        System.out.println("Dibuat Oleh: Leon Shan Yoedha Adjie");
        System.out.println("NIM        : 2341720136");
        System.out.println("Absen      : 16");
        System.out.println("========|=======================|========");
        System.out.println("Sistem Antrian Resto");
        int menuLeon;
        int jmlpembeli16 =4;
        Pembeli16 pembeli1 = new Pembeli16("Mamluatul","08224500000");
        Pembeli16 pembeli2 = new Pembeli16("Abyaz A.M","08224511111");
        Pembeli16 pembeli3 = new Pembeli16("Yoshinoya","08224522222");
        Pembeli16 pembeli4 = new Pembeli16("SusiSusanti","081234456");
        do {
            System.out.println("=======|=======================|=======");
            System.out.println("                  MENU");
            System.out.println("=======|=======================|=======");
            System.out.println("(1) Tambah Antrian");
            System.out.println("(2) Cetak Antrian");
            System.out.println("(3) Hapus Antrian"); 
            System.out.println("(4) Laporan Pengurutan Pesanan");
            System.out.println("(5) Hitung Total Pendaatan");
            System.out.println("(6) Keluar..."); 
            System.out.println("========================================");
            System.out.print("Pilih (1-5): ");
            menuLeon = leon16.nextInt();
            
            switch (menuLeon){
                case 1 : 
                System.out.println("========================");
                System.out.println("Masukkan Data Pembeli");
                System.out.println("========================");
                for (int i = 3; i < jmlpembeli16; i++) {
                    System.out.println("Nomor Antrian : "+(i+1));
                    System.out.println("Nama Customer : " + pembeli4.getNama());
                    System.out.println("Nomor HP      : " + pembeli4.getNoHp());
                }
                 break;
             
                case 2 : 
                System.out.println("==================================");
                System.out.println("Daftar Antrian Resto Royal Delish");
                System.out.println("==================================");
                int antrianCounter = 1;

                System.out.println("No.\tNama Customer\tNomor Hp");
                System.out.println("----------------------------------------------------");
        
                System.out.println(antrianCounter + ". \t" + pembeli1.getNama() + "\t" + pembeli1.getNoHp());
                antrianCounter++;
        
                System.out.println(antrianCounter + ". \t" + pembeli2.getNama() + "\t" + pembeli2.getNoHp());
                antrianCounter++;
        
                System.out.println(antrianCounter + ". \t" + pembeli3.getNama() + "\t" + pembeli3.getNoHp());
                antrianCounter++;
        
                System.out.println(antrianCounter + ". \t" + pembeli4.getNama() + "\t" + pembeli4.getNoHp());
            
                 break;

                case 3:
                System.out.println(pembeli1.getNama()+"Telah Memesan Menu");
                System.out.println("=========================");
                System.out.println("Transaksi Input Pesanan");
                System.out.println("=========================");
                int nomorPesanan16 =1;
                System.out.println("Nomor Pesanan     : " + nomorPesanan16);
                System.out.println("Pesanan         : ");
                System.out.println("Harga           : 20000");
                nomorPesanan16++;

                
                case 4 : 
                System.out.println("========================================");
                System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
                System.out.println("========================================");
                 break;
            
                case 5 : 
                System.out.println("=======================");
                System.out.println("Total Pendapatan Resto");
                System.out.println("=======================");
                 break;
                default:
                break;
    } 
}while (menuLeon !=6);
System.out.println("Terima Kasih...");
leon16.close();
    }
}
