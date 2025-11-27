public class Kubus01 {

  // Fungsi menghitung volume kubus
  public static int hitungVolume(int sisi) {
    return sisi * sisi * sisi;
  }

  // Fungsi menghitung luas permukaan kubus
  public static int hitungLuasPermukaan(int sisi) {
    return 6 * sisi * sisi;
  }

  public static void main(String[] args) {
    int sisi = 5; // contoh nilai sisi

    int volume = hitungVolume(sisi);
    int luasPermukaan = hitungLuasPermukaan(sisi);

    System.out.println("Volume kubus: " + volume);
    System.out.println("Luas permukaan kubus: " + luasPermukaan);
  }
}
