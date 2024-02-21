import java.util.Scanner;

public class tugas107 {
    static String[] Kode = {
            "A", "B", "D", "E", "F", "G", "H", "L", "N", "T"
    };

    static String[][] Kota = {
            { "BANTEN", "BANTEN" },
            { "DKI JAKARTA", "JAKARTA" },
            { "JAWA BARAT", "BANDUNG" },
            { "JAWA TENGAH", "CIREBON" },
            { "JAWA BARAT", "BOGOR" },
            { "JAWA TENGAH", "PEKALONGAN" },
            { "JAWA TENGAH", "SEMARANG" },
            { "JAWA TIMUR", "SURABAYA" },
            { "JAWA TIMUR", "MALANG" },
            { "JAWA TENGAH", "TEGAL" }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode plat mobil: ");
        String kodePlat = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < Kode.length; i++) {
            if (Kode[i].equals(kodePlat)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Kode plat mobil tidak ditemukan!");
        } else {
            System.out.println("Kota: " + Kota[index][1]);
        }
    }
}
