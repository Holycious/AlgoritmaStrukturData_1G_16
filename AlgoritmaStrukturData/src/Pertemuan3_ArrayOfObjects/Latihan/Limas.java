package Pertemuan3_ArrayOfObjects.Latihan;

public class Limas {
    public double panjangSisi;
    public double tinggi;

    double hitungLuasPermukaan(double ps, double t) {
        return (this.panjangSisi * this.panjangSisi) + ((4.0 *this.panjangSisi*(Math.sqrt(this.tinggi * this.tinggi + (this.panjangSisi/2.0) * (this.panjangSisi/2.0)))) /2.0);
    }

    double hitungVolume(double ps, double t){
        return ((1.0/3.0 * (this.panjangSisi * this.panjangSisi)) * this.tinggi);
    }

}
