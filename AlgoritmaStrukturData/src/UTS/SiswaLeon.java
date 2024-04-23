package UTS;

public class SiswaLeon {
     public long nisnLeon;
     public String namaLeon;
     public String alamatLeon;
     public int tahunLeon;
     public double nilaiLeon;

     public SiswaLeon(long nisn, String nm, String almt, int thn, double nilai){
        this.nisnLeon = nisn;
        this.namaLeon = nm;
        this.alamatLeon = almt;
        this.tahunLeon = thn;
        this.nilaiLeon = nilai;
    }
    public SiswaLeon(){}

    public void tampilDataLeon(){
        System.out.println("===========================");
        System.out.println("NISN     : "+this.nisnLeon);
        System.out.println("NAMA     : "+this.namaLeon);
        System.out.println("ALAMAT   : "+this.alamatLeon);
        System.out.println("TAHUN    : "+this.tahunLeon);
        System.out.println("NILAI    : "+this.nilaiLeon);
        System.out.println("===========================");
    }
}


