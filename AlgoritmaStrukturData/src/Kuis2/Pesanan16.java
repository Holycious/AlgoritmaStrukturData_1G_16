package Kuis2;

public class Pesanan16 {
    int KodePesanan16;
    String NamaPesanan16;
    int harga16;

    Pesanan16(int a, String b, int d){
        KodePesanan16 = a;
        NamaPesanan16 = b;
        harga16 = d;
    }

    public int getKodePesanan() {
        return KodePesanan16;
    }

    public void setKodePesanan(int kodePesanan) {
        this.KodePesanan16 = kodePesanan;
    }

    public String getNamaPesanan() {
        return NamaPesanan16;
    }

    public void setNamaPesanan(String namaPesanan) {
        this.NamaPesanan16 = namaPesanan;
    }

    public int getHarga() {
        return harga16;
    }

    public void setHarga(int harga) {
        this.harga16 = harga;
    }
}
