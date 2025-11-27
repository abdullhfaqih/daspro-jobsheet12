import java.util.Scanner;

public class Kafe01 {
  public static void Menu() {
    // System.out.println("Selamat datang " + namaPelanggan + "!");

    // if (isMember) {
    //   System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    // }
    // if (kodePromo.equals("DISKON50")) {
    //   System.out.println("Kode promo valid: diskon 50% diberikan");
    // } else if (kodePromo.equals("DISKON30")) {
    //   System.out.println("kode promo valid: dispok 30% diberikan");
    // } else {
    //   System.out.println("Kode promo tidak valid");
    // }
    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam   - Rp 15.000");
    System.out.println("2. Cappucino    - Rp 20.000");
    System.out.println("3. Latte        - Rp 22.000");
    System.out.println("4. Teh Tarik    - Rp 10.000");
    System.out.println("5. Roti Bakar   - Rp 12.000");
    System.out.println("6. Mie Goreng   - Rp 18.000");
    System.out.println("================================");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
  }

  public static int hitungTotalHarga01(int pilihanMenu, int banyakItem, String kodePromo) {
    int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

    int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
    if (kodePromo.equals("DISKON50")) {
      System.out.println("Diskon 50% diberikan.");
      totalHarga = totalHarga / 2;
    } else if (kodePromo.equals("DISKON30")) {
      System.out.println("Diskon 30% diberikan.");
      totalHarga = totalHarga * 70 / 100;
    } else {
      System.out.println("Kode promo tidak valid.");
    }

    return totalHarga;
  }

  public static void main(String[] args) {
    // Menu("Andi", true, "DISKON50");
    // Scanner input = new Scanner(System.in);

    // System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
    // int pilihanMenu = input.nextInt();
    // System.out.print("Masukkan jumlah item yang ingin dipesan: ");
    // int banyaItem = input.nextInt();
    // System.out.print("Masukkan kode promo: ");
    // String kodePromo = input.next();

    // int totalHarga = hitungTotalHarga01(pilihanMenu, banyaItem, kodePromo);

    // System.out.println("Total harga untuk pesanan Anda: Rp. " + totalHarga);
    Scanner input = new Scanner(System.in);
    Menu();
    int totalKeseluruhan = 0;

    System.out.print("Berapa jenis menu yang ingin dipesan? ");
    int jumlahJenis = input.nextInt();

    for (int i = 0; i < jumlahJenis; i++) {
      System.out.print("Masukkan nomor menu ke-" + (i + 1) + ": ");
      int pilihanMenu = input.nextInt();
      System.out.print("Masukkan jumlah item untuk menu ke-" + (i + 1) + ": ");
      int jumlahPesanan = input.nextInt();

      totalKeseluruhan += hitungTotalHarga01(pilihanMenu, jumlahPesanan, "DISKON50");
    }

    System.out.println("Total keseluruhan pesanan: Rp." + totalKeseluruhan);

    input.close();
  }

}