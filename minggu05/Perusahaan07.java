package minggu05;

public class Perusahaan07 {
    String nama;
    int jumlahBulan;
    double[] keuntungan;
    double total;

    public Perusahaan07(int jumlahBulan) {
        this.jumlahBulan = jumlahBulan;
        this.keuntungan = new double[jumlahBulan];
        this.total = 0;
    }

    public double totalBF() {
        for (int i = 0; i < jumlahBulan; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }
}
