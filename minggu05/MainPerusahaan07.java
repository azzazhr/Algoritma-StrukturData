package minggu05;

import java.util.Scanner;

public class MainPerusahaan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Total Beberapa Perusahaan (Satuan Juta. Misal 5.9)");
        System.out.println("Masukkan Jumlah Perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();

        Perusahaan07[] perusahaan = new Perusahaan07[jumlahPerusahaan];
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("================================================================");
            System.out.println("Data Perusahaan " + (i + 1));

            System.out.println("Masukkan Jumlah Bulan: ");
            int jumlahBulan = sc.nextInt();

            perusahaan[i] = new Perusahaan07(jumlahBulan);

            for (int j = 0; j < jumlahBulan; j++) {
                System.out.println("Masukkan Untung Bulan ke - " + (j + 1) + " = ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("================================================================");
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("Total Keuntungan = " + perusahaan[i].totalBF());
            System.out.println("================================================================");
        }
    }
}
