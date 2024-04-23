package UTS;

public class PencarianSiswaLeon {
    SiswaLeon listsiswaLeon[] = new SiswaLeon[6];
    int keyLeon;

    public void tambahLeon (SiswaLeon mhs){
            if (keyLeon < listsiswaLeon.length) {
                listsiswaLeon[keyLeon]=mhs;
                keyLeon++;  
            }else{ 
                System.out.println("Data Sudah Penuh!");
        }
    }
    void tampilLeon(){
        for (SiswaLeon m : listsiswaLeon) {
            m.tampilDataLeon();
        }
    }
    public void TampilDataSiswaLeon(long x, int pos){
        if (pos!= -1) {
            System.out.println("NISN   : "+listsiswaLeon[pos].nisnLeon);
            System.out.println("NAMA   : "+listsiswaLeon[pos].namaLeon);
            System.out.println("ALAMAT : "+listsiswaLeon[pos].alamatLeon);
            System.out.println("TAHUN  : "+listsiswaLeon[pos].tahunLeon);
            System.out.println("NILAI  : "+listsiswaLeon[pos].nilaiLeon);
        }else{
            System.out.println("Data : "+x+" tidak ditemukan  ");
        }
    }
    public int SearchLeon(long cari){
        int posisi = -1;
        for (int i = 0; i < listsiswaLeon.length; i++) {
            if (listsiswaLeon[i].nisnLeon==cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    void sortLeon(){
        for (int i = 0; i < listsiswaLeon.length-1; i++) {
            for (int j = 1; j < listsiswaLeon.length-i; j++) {
                if (listsiswaLeon[j].nilaiLeon > listsiswaLeon[j-1].nilaiLeon) {
                    SiswaLeon temp = listsiswaLeon[j];
                    listsiswaLeon[j] = listsiswaLeon[j-1];
                    listsiswaLeon[j-1] = temp;
                }
            }
        }
    }
}
