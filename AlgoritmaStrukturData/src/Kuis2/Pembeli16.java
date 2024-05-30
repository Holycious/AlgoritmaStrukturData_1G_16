package Kuis2;

public class Pembeli16 {
    String namaPembeli16;
    String NoHp16;

    Pembeli16 (String b, String c){
        namaPembeli16 = b;
        NoHp16 = c;
    }

    public String getNama() {
        return namaPembeli16;
    }

    public void setNama(String nama) {
        this.namaPembeli16 = nama;
    }

    public String getNoHp() {
        return NoHp16;
    }

    public void setNoHp(String noHp) {
        this.NoHp16 = noHp;
    }
}
