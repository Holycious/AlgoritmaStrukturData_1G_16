package Pertemuan10.Queue;

public class Queue16 {
        Nasabah16[] data;
        int front;
        int rear;
        int size;
        int max;
    
        public Queue16(int n) {
            max = n;
            data = new Nasabah16[max];
            size = 0;
            front = rear = -1;
    
        }
    
        public boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }
    
        public boolean isFull() {
            if (size == max) {
                return true;
            } else {
                return false;
            }
        }
    
        public void peek() {
            if (!isEmpty()) {
                System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
            } else {
                System.out.println("Queue masih kosong ");
            }
        }

        public void peekRear() {
            if (!isEmpty()) {
                System.out.println("Elemen terdepan: " + data[rear].norek + " " + data[rear].nama + " "
                        + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
            } else {
                System.out.println("Queue masih kosong ");
            }
            }
    
        public void print() {
            if (isEmpty()) {
                System.out.println("Queue masih kosong");
            } else {
                int i = front;
                while (i != rear) {
                    System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                            + data[i].saldo);
                    i = (i + 1) % max;
                }
    
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                        + data[i].saldo);
                System.out.println("jumlah elemen = " + size);
            }
        }
    
        public void clear() {
            if (!isEmpty()) {
                front = rear = -1;
                size = 0;
                System.out.println("Queue berhasil dikosongkan");
            } else {
                System.out.println("Queue masih kosong");
            }
        }
    
        public void Enqueue(Nasabah16 dt) {
            if (isFull()) {
                System.out.println("Queue sudah penuh");
                System.exit(0);
            } else {
                if (isEmpty()) {
                    front = rear = 0;
                } else {
                    if (rear == max - 1) {
                        rear = 0;
                    } else {
                        rear++;
                    }
                }
                data[rear] = dt;
                size++;
            }
        }
    
        public Nasabah16 Dequeue() {
            Nasabah16 dt = new Nasabah16();
            if (isEmpty()) {
                System.out.println("Queue masih kosong ");
                System.exit(0);
            } else {
                dt = data[front];
                size--;
                if (isEmpty()) {
                    front = rear = -1;
    
                } else {
                    if (front == max - 1) {
                        front = 0;
    
                    } else {
                        front++;
                    }
                }
            }
            return dt;
        }
    }

