import java.util.Scanner;

public class RekapPenjualanCafe01 {
  static String[] menu;
  static int[][] penjualan;

  // Input jumlah menu, nama menu, dan data penjualan
  public static void inputData() {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah menu: ");
    int jumlahMenu = input.nextInt();
    input.nextLine(); // buang newline

    System.out.print("Masukkan jumlah hari penjualan: ");
    int jumlahHari = input.nextInt();
    input.nextLine();

    menu = new String[jumlahMenu];
    penjualan = new int[jumlahMenu][jumlahHari];

    for (int i = 0; i < jumlahMenu; i++) {
      System.out.print("Nama menu ke-" + (i + 1) + ": ");
      menu[i] = input.nextLine();

      for (int j = 0; j < jumlahHari; j++) {
        System.out.print("Penjualan " + menu[i] + " pada hari ke-" + (j + 1) + ": ");
        penjualan[i][j] = input.nextInt();
      }
      input.nextLine(); // buang newline
    }
  }

  // Tampilkan tabel penjualan
  public static void tampilData() {
    System.out.printf("%-16s", "Menu");
    for (int j = 0; j < penjualan[0].length; j++) {
      System.out.printf("Hari%-6d", j + 1);
    }
    System.out.println();

    for (int i = 0; i < menu.length; i++) {
      System.out.printf("%-16s", menu[i]);
      for (int j = 0; j < penjualan[i].length; j++) {
        System.out.printf("%-8d", penjualan[i][j]);
      }
      System.out.println();
    }
  }

  // Menu dengan total penjualan tertinggi
  public static void tampilMenuTerlaris() {
    int maxTotal = 0;
    String menuTerlaris = "";

    for (int i = 0; i < menu.length; i++) {
      int total = 0;
      for (int j = 0; j < penjualan[i].length; j++) {
        total += penjualan[i][j];
      }
      if (total > maxTotal) {
        maxTotal = total;
        menuTerlaris = menu[i];
      }
    }

    System.out.println("Menu terlaris: " + menuTerlaris + " dengan total penjualan " + maxTotal);
  }

  // Rata-rata penjualan tiap menu
  public static void tampilRataRata() {
    System.out.println("Rata-rata penjualan per menu:");
    for (int i = 0; i < menu.length; i++) {
      int total = 0;
      for (int j = 0; j < penjualan[i].length; j++) {
        total += penjualan[i][j];
      }
      double rata = total / (double) penjualan[i].length;
      System.out.println(menu[i] + ": " + rata);
    }
  }

  public static void main(String[] args) {
    inputData();
    System.out.println("\n=== TABEL PENJUALAN ===");
    tampilData();
    System.out.println("\n=== MENU TERLARIS ===");
    tampilMenuTerlaris();
    System.out.println("\n=== RATA-RATA PENJUALAN ===");
    tampilRataRata();
  }
}