package Pertemuan3_ArrayOfObjects.ArrayBalok;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(){

    }
    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    public Balok(int p, int l){
        this.panjang = p;
        this.lebar = l;
    }


    public int hitungVolume(){
        return  panjang * lebar * tinggi;
    }
    
}
