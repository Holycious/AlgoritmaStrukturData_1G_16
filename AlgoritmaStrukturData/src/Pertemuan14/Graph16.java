package Pertemuan14;
import java.util.*;
public class Graph16 {
    int vertex;
    DoubleLinkedLists16[] list;

    public Graph16(int v) {
        vertex = v;
        list = new DoubleLinkedLists16[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists16();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k; 
        int totalIn = 0; 
        int totalOut = 0;
        for (int i = 0; i < vertex; i++) {
                //inDegree
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == asal) {
                        ++totalIn;
                    }
                }
                for (k = 0; k < list[asal].size(); k++) {
                    list[asal].get(k);
                }
                totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": "+ totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": "+ totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": "+ (totalIn + totalOut));
        
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].remove(i);
                break;
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil di kosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " +  (char) ('A' + i) + " terhubung dengan");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }   
}
