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
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == listbk[mid].kodeBuku) {
                return mid;
            } else if (listbk[mid].kodeBuku < cari) {
                return FindBinarySearch(cari, left, mid-1);
            } else{
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
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
            System.out.println("Kode Buku    : "+x);
            System.out.println("Judul Buku   : "+listbk[pos].judulBuku);
            System.out.println("Tahun Terbit : "+listbk[pos].tahunTerbit);
            System.out.println("Pengarang    : "+listbk[pos].pengarang);
            System.out.println("Stok         :  "+listbk[pos].stok);
        }else{
            System.out.println("Data : "+x+" tidak ditemukan  ");
        }
    }
    
    public Buku16 FindBuku(int cari){
        for (int i = 0; i < listbk.length; i++) {
            if (listbk[i].kodeBuku==cari) {
                return listbk[1];
            }
        }
        return listbk[-1];
}
}
