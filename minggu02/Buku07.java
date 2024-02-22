package minggu02;

public class Buku07 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTot;
    double hargaBayar, diskon = 0.0;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Total Harga Penjualan Rp " + hargaTot);
        System.out.println("Harga bayar setelah diskon: " + hargaBayar);
        System.out.println("========================");

    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println("Terjual: " + jml + "buku");
            hitungHargaTotal(jml);
        } else {
            System.out.println("Tidak ada stok");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal(int jml) {
        hargaTot = harga * jml;
    }

    void hitungDiskon() {
        if (hargaTot > 150000) {
            diskon = 0.12 * hargaTot;
            System.out.println("Anda mendapatkan diskon sebesar 12%");
        } else if (hargaTot >= 75000 && hargaTot <= 150000) {
            diskon = 0.05 * hargaTot;
            System.out.println("Anda mendapatkan diskon sebesar 5%");
        } else {
            System.out.println("Anda tidak mendapatkan diskon");
        }
        hitungHargaBayar(diskon);
    }

    void hitungHargaBayar(double disc) {
        hargaBayar = hargaTot - disc;
    }

    public Buku07() {

    }

    public Buku07(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;

    }

}
