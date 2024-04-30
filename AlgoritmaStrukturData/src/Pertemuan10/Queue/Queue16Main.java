package Pertemuan10.Queue;

import java.util.Scanner;

public class Queue16Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int capacity = sc.nextInt();
        Queue16 line = new Queue16(capacity);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    sc.nextLine();
                    System.out.print("Masukkan No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Masukkan saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah16 nb = new Nasabah16(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    line.Enqueue(nb);
                    break;
                case 2:
                Nasabah16 data = line.Dequeue();
                if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                        && data.saldo != 0) {
                    System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat
                            + " " + data.umur + " " + data.saldo);
                }
                case 3:
                    line.peek();
                    break;
                case 4:
                    line.print();
                    break;
                
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("(1.) Antrian Baru");
        System.out.println("(2.) Antrian Keluar");
        System.out.println("(3.) Cek Antrian Terdepan");
        System.out.println("(4.) Cek Semua Antrian");
        System.out.println("=================================");
    }
}
