package minggu08;

import java.util.Scanner;

public class Utama07 {
    public static void main(String[] args) {
        Gudang07 gudang = new Gudang07(7);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Nama Barang: ");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan Nama Kategori: ");
                    String kategori = sc.nextLine();
                    Barang07 barangBaru = new Barang07(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }

        }

    }

}
