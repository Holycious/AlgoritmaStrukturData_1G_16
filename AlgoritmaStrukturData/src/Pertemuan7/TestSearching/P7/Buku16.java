package Pertemuan7.TestSearching.P7;

public class Buku16 {
    public int kodeBuku;
    public String judulBuku;
    public int tahunTerbit;
    public String pengarang;
    public int stok;

    public Buku16(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stok){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public Buku16(){}
    public void tampilDataBuku(){
        System.out.println("===========================");
        System.out.println("Kode Buku    : "+this.kodeBuku);
        System.out.println("Judul Buku   : "+this.judulBuku);
        System.out.println("Tahun Terbit : "+this.tahunTerbit);
        System.out.println("Pengarang    : "+this.pengarang);
        System.out.println("Stok    :  "+this.stok);
    }

    // public int FindBuku(int search){
    //     int posisi = -1;
    //     for (int i = 0; i < dataBuku.length; i++) {
    //         if (dataBuku[i].kodeBuku==search) {
    //             posisi = i;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }
}

