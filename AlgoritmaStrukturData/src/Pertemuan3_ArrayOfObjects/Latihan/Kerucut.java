package Pertemuan3_ArrayOfObjects.Latihan;

public class Kerucut {
    public double jari;
    public double sisiMiring;

    double hitungLuasPermukaan(double j, double sm){
        return  (Math.PI * this.jari) * (this.jari + this.sisiMiring);
    }
    
    double hitungVolume(double j , double sm){
        return 1.0/3.0 * Math.PI * (this.jari * this.jari) *  Math.sqrt(this.sisiMiring*this.sisiMiring - this.jari * this.jari);
    }   
}

