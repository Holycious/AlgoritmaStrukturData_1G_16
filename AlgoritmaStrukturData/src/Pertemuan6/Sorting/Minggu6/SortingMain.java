package Pertemuan6.Sorting.Minggu6;

public class SortingMain {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1= new Mahasiswa("Dodit", 2004, 20, 3.5);
        Mahasiswa m2= new Mahasiswa("Nisa", 2005, 19, 2.5);
        Mahasiswa m3= new Mahasiswa("Raihan", 2005, 19, 4.0);
        Mahasiswa m4= new Mahasiswa("Ayu", 2004, 20, 3.7);
        Mahasiswa m5= new Mahasiswa("Roni", 2003, 21, 3.9);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        System.out.println("=================================");
        System.out.println(" Data Mahasiswa sebelum sorting  ");
        System.out.println("=================================");
        list.tampil();

        System.out.println(" Data Mahasiswa setelah sorting asc berdasarkan ipk  ");
        System.out.println("=================================");
        list.insertionsort();
        list.tampil();
    }
}
