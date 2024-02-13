import java.util.Scanner;

public class P1_PraktikumPemilihan {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean valid = false;
    double hitungRata;
    System.out.println("==============================");
    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("==============================");
    System.out.print("Masukkan Nilai Tugas: ");
    double nilaiTugas = input.nextDouble();
    if (nilaiTugas >= 0 && nilaiTugas <= 100) {
      valid = true;
    }
    System.out.print("Masukkan Nilai Kuis: ");
    double nilaiKuis = input.nextDouble();
    if (nilaiTugas >= 0 && nilaiTugas <= 100) {
      valid = true;
    }
    System.out.print("Masukkan Nilai UTS: ");
    double nilaiUTS = input.nextDouble();
    if (nilaiTugas >= 0 && nilaiTugas <= 100) {
      valid = true;
    }
    System.out.print("Masukkan Nilai UAS: ");
    double nilaiUAS = input.nextDouble();
    if (nilaiTugas >= 0 && nilaiTugas <= 100) {
      valid = true;
    }
    System.out.println("==============================");
    System.out.println("==============================");

    if (valid) {
      hitungRata = (nilaiKuis*0.2)+ (nilaiTugas*0.2) + (nilaiUAS*0.3) + (nilaiUTS*0.3);
      if (hitungRata > 80 && hitungRata <= 100) {
        System.out.println("Nilai Akhir: " + hitungRata);
        String nilaiAbjad = "A";
        System.out.println("Nilai Huruf: " + nilaiAbjad);
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        System.out.println("==============================");
      } else if (hitungRata > 73 && hitungRata <= 80) {
        System.out.println("Nilai Akhir: " + hitungRata);
        String nilaiAbjad = "B+";
        System.out.println("Nilai Huruf: " + nilaiAbjad);
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        System.out.println("==============================");
      } else if (hitungRata > 73 && hitungRata <= 80) {
        System.out.println("Nilai Akhir: " + hitungRata);
        String nilaiAbjad = "B";
        System.out.println("Nilai Huruf: " + nilaiAbjad);
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        System.out.println("==============================");
      } else if (hitungRata > 73 && hitungRata <= 80) {
        System.out.println("Nilai Akhir: " + hitungRata);
        String nilaiAbjad = "C+";
        System.out.println("Nilai Huruf: " + nilaiAbjad);
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        System.out.println("==============================");
      } else if (hitungRata > 73 && hitungRata <= 80) {
        System.out.println("Nilai Akhir: " + hitungRata);
        String nilaiAbjad = "C";
        System.out.println("Nilai Huruf: " + nilaiAbjad);
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        System.out.println("==============================");
      } else if (hitungRata > 73 && hitungRata <= 80) {
        System.out.println("Nilai Akhir: " + hitungRata);
        String nilaiAbjad = "D";
        System.out.println("Nilai Huruf: " + nilaiAbjad);
      } else if (hitungRata > 73 && hitungRata <= 80) {
        System.out.println("Nilai Akhir: " + hitungRata);
        String nilaiAbjad = "E";
        System.out.println("Nilai Huruf: " + nilaiAbjad);
      }
    } if (valid == false) {
        System.out.println("Nilai Invalid!");
        System.out.println("==============================");
    }
    input.close();
  }
}
