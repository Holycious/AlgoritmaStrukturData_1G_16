package Pertemuan3_ArrayOfObjects.Latihan.Soal2_3;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = input.nextInt();
        Mahasiswa mhsJml = new Mahasiswa();
        mhsJml.jumlah = jmlMhs;
        Mahasiswa[] mhsArray = new Mahasiswa[jmlMhs]; 
        Mahasiswa mhs = new Mahasiswa(); 
        for (int i = 0; i < mhsArray.length; i++) {
            mhsArray[i] = new Mahasiswa();
        }
        for (int i = 0; i < mhsArray.length; i++) {
            mhsArray[i] = new Mahasiswa();
            System.out.print("Masukkan data Mahasiswa ke-"+(i+1));
            System.out.println();
            System.out.print("Masukkan Nama   : ");
            mhsArray[i].Nama = input.next();
            System.out.print("Masukkan NIM    : ");
            mhsArray[i].nim =  input.nextLong();
            System.out.print("Masukkan Gender : ");
            mhsArray[i].gender = input.next();
            System.out.print("Masukkan IPK    : ");
            mhsArray[i].ipk = input.nextDouble();
        }
        System.out.println(mhsJml.jumlah);
        for (int i = 0; i < mhsArray.length; i++) {
            System.out.print("Data Mahasiswa ke-"+(i+1));
            mhsArray[i].tampilInformasi();
        }
        mhsJml.ratarata(mhsArray);
        System.out.println();
        mhsJml.topIPK(mhsArray);
        
        
        input.close();
    }
}
