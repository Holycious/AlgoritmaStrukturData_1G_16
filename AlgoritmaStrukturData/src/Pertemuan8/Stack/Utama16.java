package Pertemuan8.Stack;

import java.util.Scanner;

public class Utama16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Gudang: ");
        int size = scanner.nextInt();
        Gudang16 gudang = new Gudang16(size);
        boolean isMenu = false;

        while (!isMenu) {
                System.out.println("\nMenu");
                System.out.println("1. Tambah Barang");
                System.out.println("2. Ambil Barang");
                System.out.println("3. Tampilkan tumpukan Barang");
                System.out.println("4. Tampilkan Barang Teratas");
                System.out.println("5. Keluar");
                System.out.print("Pilih Opsi: ");
                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan kode Barang     : ");
                        int kode = scanner.nextInt();
                        System.out.print("Masukkan nama Barang     : ");
                        String nama = scanner.next();
                        System.out.print("Masukkan kategori Barang : ");
                        String kategori= scanner.next();
                        Barang16 barangBaru = new Barang16(kode, nama, kategori);
                        gudang.tambahBarang(barangBaru);
                        break;
                    case 2:
                        gudang.ambilBarang();
                        break;
                    case 3:
                        gudang.tampilkanBarang();
                        break;
                    case 4:
                        gudang.liatBarangTeratas();
                        break;
                    case 5:
                        isMenu = true;
                        System.out.println("Terima Kasih!");
                        break;                   
                    default:
                        System.out.println("Pilihan tidak valid silahkan coba lagi!");
                }


        }
    }
}
