package Pertemuan8.Stack;

public class Gudang16 {
    public Barang16[] tumpukan;
    public int size;
    public int top;

    public Gudang16 (int kapasitas){
        size = kapasitas;
        tumpukan = new Barang16[size];
        top = -1;
    }

    public boolean cekKosong(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh(){
        if (size == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang16 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang penuh!");
        }
    }

    public Barang16 ambilBarang(){
    if (!cekKosong()) {
        Barang16 delete = tumpukan[top];
        top--;
        System.out.println("Barang " + delete.nama + " diambil dari Gudang");
        System.out.println("Kode unik dalam biner: "+ KonversiDesimalKeBiner(delete.kode));
        return delete;    
        }else{
            System.out.println("Tumpukan barang kosong!");
            return null;
        }
    }

    public Barang16 liatBarangTeratas(){
        if (!cekKosong()) {
            Barang16 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: "+ barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong!");
        }
    }

    public String KonversiDesimalKeBiner (int kode){
        StackKonversi16 stack = new StackKonversi16();
        while (kode != 0) {
                int sisa = kode % 2;
                stack.push(sisa);
                kode = kode /2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;

    }

}
