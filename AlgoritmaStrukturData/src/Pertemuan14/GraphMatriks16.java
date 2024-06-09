package Pertemuan14;

public class GraphMatriks16 {
    int vertex;
    int[][] matriks;

    public GraphMatriks16(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != 1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + "m), ");
 
                }
            }
            System.out.println("");
        }
    }
    public int OutDegree(int gedung) {
        int OutDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[gedung][i] != 0) {
                OutDegree++;
            }
        }
        return OutDegree;
    }
    
    public int InDegree(int gedung) {
        int InDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][gedung] != 0) {
                InDegree++;
            }
        }
        return InDegree;
    }

    public int Degree(int gedung){
        return InDegree(gedung) + OutDegree(gedung);
        //
    }
}
