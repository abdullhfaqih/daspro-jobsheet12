import java.util.Scanner;

public class NilaiMahasiswa01 {

  // a. Fungsi untuk mengisi array nilai mahasiswa
  public static void isianArray(int[] nilai) {
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < nilai.length; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
      nilai[i] = input.nextInt();
    }
    input.close();
  }

  // b. Fungsi untuk menampilkan isi array
  public static void tampilArray(int[] nilai) {
    System.out.println("Daftar nilai mahasiswa:");
    for (int i = 0; i < nilai.length; i++) {
      System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
    }
  }

  // c. Fungsi untuk menghitung total nilai
  public static int hitTot(int[] nilai) {
    int total = 0;
    for (int n : nilai) {
      total += n;
    }
    return total;
  }

  // d. Fungsi main
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah mahasiswa: ");
    int N = input.nextInt();

    int[] nilaiMahasiswa = new int[N];

    isianArray(nilaiMahasiswa);
    tampilArray(nilaiMahasiswa);
    int totalNilai = hitTot(nilaiMahasiswa);

    System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
    input.close();
  }
}