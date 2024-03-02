package Pertemuan3_ArrayOfObjects.Latihan.Soal2_3;

public class Mahasiswa {
    public int jumlah;
    public String Nama;
    public long nim;
    public String gender;
    public double ipk;
    public double rata;

    public void tampilInformasi (){
        System.out.println();
            System.out.println("Nama   : "+ this.Nama);
            System.out.println("NIM    : "+ this.nim);
            System.out.println("Gender : "+ this.gender);
            System.out.println("IPK    : "+ this.ipk);
            
    }
    

    public void ratarata (Mahasiswa[] listMhs){
        double totalIPK = 0;
        for (int i = 0; i < listMhs.length; i++) {
            totalIPK +=  listMhs[i].ipk;
        }
        rata = totalIPK / listMhs.length;
        System.out.printf("Rata-rata IPK: %.2f ",rata);
    }

    public void topIPK (Mahasiswa[] daftarMhs){
        double max = 4;
        String top = "";
        for (int i = 0; i < daftarMhs.length; i++) {
            if (max <= daftarMhs[i].ipk) {
                max = daftarMhs[i].ipk;
                top = daftarMhs[i].Nama;
            }
        }
        System.out.printf("Mahasiswa bernama %s memiliki IPK tertinggi senilai %.2f", top,max);
        
    }

}
