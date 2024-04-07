package minggu08;

public class Gudang07 {
    Barang07[] tumpukan;
    int size;
    int top;

    public Gudang07(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang07[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang07 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang07 ambilBarang() {
        if (!cekKosong()) {
            Barang07 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public Barang07 lihatBarangTeratas() {
        if (!isEmpty()) {
            Barang07 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang:");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public Barang07 lihatBarangTerbawah() {
        if (!isEmpty()) {
            Barang07 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah : " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang07 cariBarang(int kodeBarang) {
        if (!cekKosong()) {
            for (int i = top; i >= 0; i--) {
                if (tumpukan[i].kode == kodeBarang) {
                    System.out.println("Barang dengan kode " + kodeBarang + " ditemukan.");
                    System.out.println("Informasi barang");
                    System.out.println("Kode barang : " + tumpukan[i].kode);
                    System.out.println("Nama barang : " + tumpukan[i].nama);
                    System.out.println("Kategori    : " + tumpukan[i].kategori);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang tidak ditemukan.");
            return null;
        } else {
            System.out.println("tumpukan barang kosong.");
            return null;
        }

    }

}
