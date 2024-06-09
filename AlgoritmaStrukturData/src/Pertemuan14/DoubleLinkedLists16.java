package Pertemuan14;

public class DoubleLinkedLists16 {
    Node16 head;
    int size;
  
    DoubleLinkedLists16(){
        head = null;
        size = 0;
    }
  
    boolean isEmpty() {
      return head == null;
    }
  
    void addFirst(int item, int jarak) {
      if (isEmpty()) {
        head = new Node16(null, item, jarak, null);
      } else {
        Node16 newNode = new Node16(null, item, jarak, head);
        head.prev = newNode;
        head = newNode;
      }
      size++;
    }
  
    int size() {
      return size;
    }
  
    void clear() {
      head = null;
      size = 0;
    }
  
    void print() {
      if (!isEmpty()) {
        Node16 tmp = head;
        while (tmp != null) {
          System.out.print(tmp.data + "\t");
          tmp = tmp.next;
        }
        System.out.println("\nberhasil diisi");
      } else {
        System.out.println("Linked list kosong");
      }
    }
  
    void removeFirst() throws Exception {
      if (isEmpty()) {
        throw new Exception("Linked list masih kosong, tidak dapat dihapus");
      } else if (size == 1) {
        removeLast();
      } else {
        head = head.next;
        head.prev = null;
        size--;
      }
    }
  
    void removeLast() throws Exception {
      if (isEmpty()) {
        throw new Exception("Linked list masih kosong, tidak dapat dihapus");
      } else if (head.next == null) {
        head = null;
        size--;
        return;
      }
      Node16 current = head;
      while (current.next.next != null) {
        current = current.next;
      }
      current.next = null;
      size--;
    }
  
    void remove(int index) throws Exception{
      Node16 current = head;
      while (current != null) {
        if (current.data == index) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            break;
        }
        current = current.next;
      }
    }
  
    int getFirst() throws Exception{
      if (isEmpty()) {
        throw new Exception("Linked List Kosong");
      }
      return head.data;
    }
  
    int getLast() throws Exception{
      if (isEmpty()) {
        throw new Exception("Linked List Kosong");
      }
      Node16 tmp = head;
      while (tmp.next != null) {
        tmp = tmp.next;
      }
      return tmp.data;
    }
  
    int get(int index) throws Exception {
      if (isEmpty() || index >= size) {
        throw new Exception("Nilai indeks di luar batas");
    }
    Node16 tmp = head;
    for (int i = 0; i < index; i++) {
      tmp = tmp.next;
    }
    return tmp.data;
    }

    int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
          throw new Exception("Nilai indeks di luar batas");
      }
      Node16 tmp = head;
      for (int i = 0; i < index; i++) {
        tmp = tmp.next;
      }
      return tmp.jarak;
      }
}