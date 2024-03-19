package minggu04;

import java.util.Scanner;

public class Kuis1MainLaptop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data laptop
        System.out.println("=======================================");
        System.out.println("MASUKKAN DATA LAPTOP YANG INGIN DI SEWA");
        System.out.println("=======================================");
        System.out.print("Merek: ");
        String merek = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Tahun Produksi: ");
        int tahunProduksi = scanner.nextInt();
        System.out.print("Harga Sewa Per Hari: ");
        int hargaSewaPerHari = scanner.nextInt();

        // Buat objek Laptop
        Kuis1Laptop07 laptop = new Kuis1Laptop07(merek, model, tahunProduksi, hargaSewaPerHari);

        // Hitung total sewa
        System.out.println("\nMasukkan Lama Sewa (hari): ");
        int lamaSewa = scanner.nextInt();
        int totalSewa = laptop.hitungTotalSewa(lamaSewa);

        // Tampilkan detail laptop
        System.out.println("=======================================");
        System.out.println("DETAIL LAPTOP YANG DI SEWA");
        System.out.println("=======================================");
        laptop.displayDetailLaptop();

        // Tampilkan hasil perhitungan
        System.out.println("------------------------");
        System.out.println("Total Sewa: Rp" + totalSewa);
        System.out.println("------------------------");
        System.out.println("=======================================");
    }
}
