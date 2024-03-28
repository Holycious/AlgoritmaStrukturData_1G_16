package Pertemuan4.BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainPangkat {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("==========================================");
    System.out.println("Pilih menu yang ingin dijalankan:");
    System.out.println("1. Menampilkan nilai pangkat dengan metode BRUTE FORCE");
    System.out.println("2. Menampilkan nilai pangkat dengan metode DIVIDE CONQUER");
    System.out.print("Masukkan pilihan anda: ");
    int choice = sc.nextInt();
    System.out.println("==========================================");
    switch (choice) {
      case 1:
        System.out.println("==========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemenBF = sc.nextInt();
        Pangkat[] pngBF = new Pangkat[elemenBF];
        for (int i = 0; i < elemenBF; i++) {
          // pngDQ[i] = new Pangkat(nilai,pangkat);
          System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
          int nilai = sc.nextInt();
          // pngDQ[i].nilai = nilai;
          System.out.print("Masukkkan nilai pemangkat: ");
          int pangkat = sc.nextInt();
          // pngDQ[i].pangkat = pngkat;
          pngBF[i] = new Pangkat(nilai, pangkat);
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemenBF; i++) System.out.println(
          "Hasil Dari: " +
          pngBF[i].nilai +
          " pangkat " +
          pngBF[i].pangkat +
          " adalah " +
          pngBF[i].pangkatBF(pngBF[i].nilai, pngBF[i].pangkat)
        );
        {}
        break;
      case 2:
        System.out.println("==========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();
        Pangkat[] pngDQ = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
          // pngDQ[i] = new Pangkat(nilai,pangkat);
          System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
          int nilai = sc.nextInt();
          // pngDQ[i].nilai = nilai;
          System.out.print("Masukkkan nilai pemangkat: ");
          int pangkat = sc.nextInt();
          // pngDQ[i].pangkat = pngkat;
          pngDQ[i] = new Pangkat(nilai, pangkat);
        }
        System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
        for (int i = 0; i < elemen; i++) System.out.println(
          "Hasil Dari: " +
          pngDQ[i].nilai +
          " pangkat " +
          pngDQ[i].pangkat +
          " adalah " +
          pngDQ[i].pangkatDC(pngDQ[i].nilai, pngDQ[i].pangkat)
        );
        {}
        break;
      default:
      System.out.println("Pilihan Tidak Valid");
        break;
    }
  }
}
