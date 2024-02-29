package Pertemuan3_ArrayOfObjects.ArrayBalok;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t){
        this.alas = a;
        this.tinggi = t;
    }

    public int hitungLuas (int a, int t){
        return (this.alas * this.tinggi) /  2;
    }

    public int hitungKeliling (int a, int t){
        return (int) Math.sqrt(this.alas * this.alas + this.tinggi * this.tinggi) + this.alas +this.tinggi; 
    }
}
