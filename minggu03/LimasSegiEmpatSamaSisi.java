package minggu03;

public class LimasSegiEmpatSamaSisi {
    public double sisiAlas;
    public double tinggiLimas;

    public LimasSegiEmpatSamaSisi(double sisiAlas, double tinggiLimas) {
        this.sisiAlas = sisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungluasPermukaanLimas() {
        return 4 * (0.5 * sisiAlas * tinggiLimas) + (sisiAlas * sisiAlas);
    }

    public double hitungVolumeLimas() {
        return (1.0 / 3.0) * (sisiAlas * sisiAlas) * tinggiLimas;
    }
}
