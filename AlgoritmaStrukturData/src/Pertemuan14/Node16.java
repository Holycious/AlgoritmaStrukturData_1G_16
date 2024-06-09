package Pertemuan14;

public class Node16 {
    int data;
    Node16 prev, next;
    int jarak; // additional attribute for the distance

    public Node16(Node16 prev, int data, int jarak, Node16 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
