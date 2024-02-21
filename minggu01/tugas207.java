import java.util.Scanner;

public class tugas207 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan menu
        int pilihan;
        do {
            System.out.println("Pilih rumus yang ingin dihitung:");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();

            if (pilihan < 0 || pilihan > 3) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            if (pilihan == 0) {
                break;
            }

            // Membaca input
            double jarak, waktu, kecepatan;
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jarak (km): ");
                    jarak = input.nextDouble();
                    System.out.print("Masukkan waktu (jam): ");
                    waktu = input.nextDouble();
                    kecepatan = hitungKecepatan(jarak, waktu);
                    System.out.println("Kecepatan: " + kecepatan + " km/jam");
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan (km/jam): ");
                    kecepatan = input.nextDouble();
                    System.out.print("Masukkan waktu (jam): ");
                    waktu = input.nextDouble();
                    jarak = hitungJarak(kecepatan, waktu);
                    System.out.println("Jarak: " + jarak + " km");
                    break;
                case 3:
                    System.out.print("Masukkan kecepatan (km/jam): ");
                    kecepatan = input.nextDouble();
                    System.out.print("Masukkan jarak (km): ");
                    jarak = input.nextDouble();
                    waktu = hitungWaktu(jarak, kecepatan);
                    System.out.println("Waktu: " + waktu + " jam");
                    break;
            }
        } while (true);
    }

    static double hitungKecepatan(double jarak, double waktu) {
        return jarak / waktu;
    }

    static double hitungJarak(double kecepatan, double waktu) {
        return kecepatan * waktu;
    }

    static double hitungWaktu(double jarak, double kecepatan) {
        return jarak / kecepatan;
    }
}
