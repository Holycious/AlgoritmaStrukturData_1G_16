package Kuis2;

import java.util.Scanner;

public class Antrian16 {
     Node16 head;
     Node16 tail;
     int size;

    public Antrian16() {
        head = null;
        tail = null;
        size = 0;
    }

    public void tambahPembeli(Pembeli16 pembeli) {
        Node16 newNode = new Node16(pembeli);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void hapusPembeli(int noAntrian) {
        if (head == null) {
            System.out.println("Antrian kosong");
            return;
        }

        Node16 current = head;
        int counter = 1;
        while (current!= null) {
            if (counter == noAntrian) {
                Pembeli16 pembeli = current.getData();
                System.out.println("Pembeli16 " + pembeli.getNama() + " telah menuju kasir untuk pesan makanan.");
                System.out.print("Masukkan makanan yang dipesan: ");
                Scanner scanner = new Scanner(System.in);
                String makanan = scanner.nextLine();
                System.out.println("Pembeli16 " + pembeli.getNama() + " memesan " + makanan);
                break;
            }
            current = current.getNext();
            counter++;
        }

        if (current == null) {
            System.out.println("No antrian tidak ditemukan");
        } else {
            if (current == head) {
                head = current.getNext();
            } else {
                current.getPrev().setNext(current.getNext());
            }

            if (current == tail) {
                tail = current.getPrev();
            } else {
                current.getNext().setPrev(current.getPrev());
            }

            size--;
        }
    }


}
