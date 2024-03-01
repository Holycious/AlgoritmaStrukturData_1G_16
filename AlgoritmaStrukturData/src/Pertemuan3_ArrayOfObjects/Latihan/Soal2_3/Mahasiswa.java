package Pertemuan3_ArrayOfObjects.Latihan.Soal2_3;

public class Mahasiswa {
    public int jumlah;
    public String Nama;
    public long nim;
    public String gender;
    public double ipk;

    public void tampilInformasi (){
        System.out.println();
            System.out.println("Nama   : "+ this.Nama);
            System.out.println("NIM    : "+ this.nim);
            System.out.println("Gender : "+ this.gender);
            System.out.println("IPK    : "+ this.ipk);
            
    }

}
