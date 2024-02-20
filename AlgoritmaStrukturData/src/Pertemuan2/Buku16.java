package Pertemuan2;

public class Buku16 {
    String judul,pengarang;
    int halaman,stok,harga,terjual,diskon;

    void tampilInformasi(){
        System.out.println( "Judul        : "+judul);
        System.out.println( "Pengarang    : "+pengarang);
        System.out.println( "Halaman      : "+halaman+" Hal");
        System.out.println( "Stok         : "+stok+" buah");
        System.out.println( "Harga        : Rp."+harga);
        System.out.println( "Terjual      : "+terjual);
        System.out.println( "Harga Total  : "+hitungHargaTotal());
        System.out.println( "Harga Diskon : "+ hitungDiskon());
        System.out.println( "Harga Bayar  : "+hitungHargaBayar());
        
    }

    void terjual(int jml){
        if (stok > 0) {
         terjual = jml;
        }
        else {
            System.out.println("Buku yang dimaksud tidak ada atau sudah habis.");
        }
    }

    void restock(int jml){
        stok += jml;    
    }

    int gantiHarga(int hrg){
        harga = hrg;
        return harga;
    }
    int hitungHargaTotal(){
        harga = harga * (terjual);
        return harga;
    }
    int hitungDiskon(){
        if (harga > 150000) {
            diskon = (int) (harga * 0.12);
        }
        else if (harga >= 75000 && harga <= 150000){
            diskon = (int) (harga * 0.05);
        }
        else {
        }
        return diskon;
    }
    int hitungHargaBayar(){
        return harga - diskon;
    }
    public Buku16() {
    
    }
    public Buku16(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman= hal;
        this.stok = stok;
        harga = har;

    }

}

