package minggu07;

import java.util.Scanner;

public class BukuMain07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku07 data = new PencarianBuku07();
        int JumlahBuku = 5;

        System.out.println("--------------------------------------------------------");
        System.out.println("Masukkan Data Buku Secara Urut Dari KodeBuku Terkecil : ");
        for (int i = 0; i < JumlahBuku; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t        : ");
            int stock = s.nextInt();

            Buku07 m = new Buku07(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();
        System.out.println("--------------------------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("________________________________________________________");
        System.out.println("________________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku Yang Dicari: ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

    }
}
