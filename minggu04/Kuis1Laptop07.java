package minggu04;

public class Kuis1Laptop07 {
    private String merek;
    private String model;
    private int tahunProduksi;
    private int hargaSewaPerHari;

    public Kuis1Laptop07(String merek, String model, int tahunProduksi, int hargaSewaPerHari) {
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public String getDetailLaptop() {
        return "Merek: " + merek + "\n" +
                "Model: " + model + "\n" +
                "Tahun Produksi: " + tahunProduksi + "\n" +
                "Harga Sewa Per Hari: Rp" + hargaSewaPerHari;
    }

    public int hitungTotalSewa(int lamaSewa) {
        return lamaSewa * hargaSewaPerHari;
    }

    public void displayDetailLaptop() {
        System.out.println(getDetailLaptop());
    }
}
