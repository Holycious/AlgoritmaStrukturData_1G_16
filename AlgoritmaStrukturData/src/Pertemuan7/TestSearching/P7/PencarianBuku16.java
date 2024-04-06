package Pertemuan7.TestSearching.P7;

public class PencarianBuku16 {
    Buku16 listbk[] = new Buku16[5];
    int idx;

    void tambah(Buku16 m){
        if (idx < listbk.length) {
            listbk[idx]=m;
            idx++;  
        }else{ 
            System.out.println("Data Sudah Penuh!");
        }
    }
    void tampil(){
        for (Buku16 m : listbk) {
            m.tampilDataBuku();
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int i = 0; i < listbk.length; i++) {
            if (listbk[i].kodeBuku==cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    public void TampilPosisi(int x, int pos){
        if (pos!=-1) {
            System.out.println("Data : "+ x+" ditemukan pada indeks "+ pos);
        }else{
            System.out.println("Data : "+x+" tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if (pos!= -1) {
            System.out.println("Kode Buku\t    : "+x);
            System.out.println("Judul Buku\t   : "+listbk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : "+listbk[pos].tahunTerbit);
            System.out.println("Pengarang\t    : "+listbk[pos].pengarang);
            System.out.println("Stok\t         :  "+listbk[pos].stok);
        }else{
            System.out.println("Data : "+x+" tidak ditemukan  ");
        }
    }
}
