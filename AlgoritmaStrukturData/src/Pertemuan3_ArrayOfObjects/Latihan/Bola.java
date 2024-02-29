package Pertemuan3_ArrayOfObjects.Latihan;


public class Bola {
    public double jarijari;
    
    double hitungLuasPermukaan(double j){
        return 4 * Math.PI * (this.jarijari * this.jarijari);
    }

    double hitungVolume(double j){
        return 4.0/3.0 * Math.PI * (this.jarijari * this.jarijari * this.jarijari);
    }
}