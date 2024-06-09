package Pertemuan14;

import java.util.Scanner;

public class GraphMain16 {
    public static void main(String[] args) throws Exception{
        Graph16 gedung = new Graph16(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();
        Scanner leon = new Scanner(System.in);
        System.out.print("Masukkan asal gedung: ");
        int asal = leon.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = leon.nextInt();

        if (asal < 0 || asal > 5 || tujuan < 0 || tujuan > 5) {
            System.out.println("Gedung yang dimasukkan tidak valid");
        } else {
            if (gedung.adjacency(asal,tujuan)) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
            }
        }
        
        
    }
}
