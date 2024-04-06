package Pertemuan7.TestSearching.P7;

import java.util.Scanner;

public class BukuMain16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku16 data = new PencarianBuku16();
        int jumBuku = 5;    

        System.out.println("==================================================");
        System.out.println("Masukkan data secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("====================");
            System.out.println("Kode Buku \t");
            int kodeBuku = s.nextInt();
            System.out.println("Judul Buku \t");
            String judulBuku = s1.nextLine();
            System.out.println("Tahun Terbit \t");
            int tahunTerbit = s.nextInt();
            System.out.println("Pengarang \t");
            String pengarang = s1.nextLine();
            System.out.println("Stok \t");
            int Stok = s.nextInt();

            Buku16 m = new Buku16(kodeBuku,judulBuku,tahunTerbit,pengarang,Stok);
            data.tambah(m);
        }
        System.out.println("====================================================");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();
        System.out.println("====================================================");
        System.out.println("====================================================");
        System.out.println("Pencarian Data");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode Buku: ");
        int cari = s.nextInt();
        System.out.println("Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("====================================================");
        System.out.println("Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku-1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("");

    }
    

}
