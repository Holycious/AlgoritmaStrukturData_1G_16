package Pertemuan2;

public class Buku16 {
    String judul,pengarang;
    int halaman,stok,harga;

    void tampilInformasi(){
        System.out.println("Judul      : "+judul);
        System.out.println( "Pengarang : "+pengarang);
        System.out.println( "Halaman   : "+halaman+" Hal");
        System.out.println( "Stok     : "+stok+" buah");
        System.out.println( "Harga    : Rp."+harga);
    }

    void terjual(int jml){
        stok -= jml;
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
}