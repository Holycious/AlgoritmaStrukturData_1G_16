package Pertemuan13;

public class BinaryTreeArray16 {
    int[] data;
    int idxlast;

    public BinaryTreeArray16(int size){
        data = new int[size];
        idxlast = -1;
    }
    void populateData(int[] nilai, int idxlast){
        for (int i = 0; i < nilai.length; i++) {
            if (i < data.length) {
                data[i] = nilai[i];
            } else {
                System.out.println("Array Penuh");
                break;
            }
    } this.idxlast = idxlast;
}
    void traverseInOrder(int idxStart){
        if (idxStart<=idxlast && data[idxStart] != 0) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
}

