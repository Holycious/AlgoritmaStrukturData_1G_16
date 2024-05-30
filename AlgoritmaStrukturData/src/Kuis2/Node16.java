package Kuis2;

public class Node16 {
    Pembeli16 data;
    Node16 prev,next;

    public Node16(Pembeli16 data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Pembeli16 getData() {
        return data;
    }

    public void setData(Pembeli16 data) {
        this.data = data;
    }

    public Node16 getNext() {
        return next;
    }

    public void setNext(Node16 next) {
        this.next = next;
    }

    public Node16 getPrev() {
        return prev;
    }

    public void setPrev(Node16 prev) {
        this.prev = prev;
    }
}
