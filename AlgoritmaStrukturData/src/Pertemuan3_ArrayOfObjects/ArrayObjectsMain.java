package Pertemuan3_ArrayOfObjects;

import java.util.Scanner;

public class ArrayObjectsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPP = 0;
        System.out.print("Masukkan jumlah persegi panjang: ");
        jumlahPP = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[jumlahPP];
        
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke- " + (i + 1));
            
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
            
            System.out.println("");
        }
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" +(i+1));
                System.out.println("Panjang: "+ ppArray[i].panjang + " ,Lebar: "+ppArray[i].lebar);
            
        }
        sc.close();



    }
}
