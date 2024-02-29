package Pertemuan3_ArrayOfObjects.Latihan;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("         Bangun Ruang");
        System.out.println("================================");
        Kerucut[] kcArray = new Kerucut[1];
        for (int i = 0; i < kcArray.length; i++) {
            kcArray[i] = new Kerucut();
            System.out.println("Kerucut:");
            System.out.print("Masukkan Jari-jari: ");
            kcArray[i].jari = input.nextDouble();
            System.out.print("Masukkan Sisi Miring: ");
            kcArray[i].sisiMiring = input.nextDouble();
        }
        Limas[] lmArray = new Limas[1];
        for (int i = 0; i < lmArray.length; i++) {
            lmArray[i] = new Limas();
            System.out.println("Limas:");
            System.out.print("Masukkan Panjang Sisi: ");
            lmArray[i].panjangSisi = input.nextDouble();
            System.out.print("Masukkan Sisi Miring: ");
            lmArray[i].tinggi = input.nextDouble();
        }
        Bola[] blArray = new Bola[1];
        for (int i = 0; i < blArray.length; i++) {
            blArray[i] = new Bola();
            System.out.println("Bola:");
            System.out.println("Masukkan Jari Jari: ");
            blArray[i].jarijari = input.nextDouble();

        }
        System.out.println("================================");
        System.out.println("             HASIL");
        System.out.println("================================");
        
        for (int i = 0; i < kcArray.length; i++) {
            System.out.println("Kerucut:");
            System.out.printf("Luas Permukaan = %.2f ", kcArray[i].hitungLuasPermukaan(i, i));
            System.out.println();
            System.out.printf("Volume         = %.2f",kcArray[i].hitungVolume(i, i));
            System.out.println();
            System.out.print("================================");
            System.out.println();
            System.out.println("Limas:");
            System.out.printf("Luas Permukaan = %.2f", lmArray[i].hitungLuasPermukaan(i, i));
            System.out.println();
            System.out.printf("Volume         = %.2f ", lmArray[i].hitungVolume(i, i));
            System.out.println();
            System.out.print("================================");
            System.out.println();
            System.out.println("Bola:");
            System.out.printf("Luas Permukaan = %.2f ", blArray[i].hitungLuasPermukaan(i));
            System.out.println();
            System.out.printf("Volume         = %.2f",blArray[i].hitungVolume(i));
            System.out.println();
            System.out.print("================================");
            System.out.println();
        }
        
    }
}
