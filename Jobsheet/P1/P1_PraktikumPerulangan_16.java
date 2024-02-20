import java.util.Scanner;

/**
 * P1_PraktikumPerulangan_16
 */
public class P1_PraktikumPerulangan_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        Long nim = input.nextLong();

        int n = (int) (nim % 100);
        if (n < 10) {
            n+= 10;
        }
        System.out.print("Nilai N: "+n);
        System.out.println();
        System.out.print("Deret Bilangan: ");
        for (int i = 1; i <= n;i++) {
            if (i % 2 != 0) {
                System.out.print("*");
                i+=1;
            }
            if (i != 6 && i != 10) {
                System.out.print(i);
            }
            System.out.print("");
        }
        input.close();
    }
}