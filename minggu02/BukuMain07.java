package minggu02;

public class BukuMain07 {
    public static void main(String[] args) {

        Buku07 bk1 = new Buku07();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.hitungDiskon();
        bk1.tampilInformasi();

        Buku07 bk2 = new Buku07("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk1.hitungDiskon();
        bk2.tampilInformasi();

        Buku07 Azza = new Buku07("Laskar Pelangi", "Andrea Hirata", 259, 30, 80000);
        Azza.terjual(15);
        Azza.hitungDiskon();
        Azza.tampilInformasi();

        Buku07 bk3 = new Buku07("Daun Yang Jatuh", "Tere Liye", 547, 53, 183000);
        bk3.terjual(12);
        bk3.hitungDiskon();
        bk3.tampilInformasi();

    }
}
