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
  
  
    void remove(int index) throws Exception{
        if (isEmpty() || index >= size)  {
            throw new Exception("Nilai indeks di luar batas");
        }
      Node16 current = head;
      for (int i = 0; i < index; i++) {
        current = current.next;
      }
      if (current.prev != null) {
        current.prev.next = current.next;
      } else {
        head = current.next;
      }
      if (current.next != null) {
        current.next.prev = current.prev;
      }
      size--;
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