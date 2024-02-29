package Pertemuan3_ArrayOfObjects;

import java.util.Scanner;

public class ArrayObjectsMain {
    public static void main(String[] args) {
        
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("");
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-"+ (i+1));
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" +(i+1));
            System.out.println("Panjang: "+ ppArray[i].panjang + " ,Lebar: "+ppArray[i].lebar);
        }
        sc.close();


    }
}
