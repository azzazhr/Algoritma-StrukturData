package minggu05;

public class Latihan07mobil {
    String merk, tipe;
    int tahun;
    double topAcceleration, topPower;

    public Latihan07mobil(String merk, String tipe, int tahun, double topAcceleration, double topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    public static double cariAkselerasiMax(Latihan07mobil[] data, int low, int high) {
        if (low == high) {
            return data[low].topAcceleration;
        } else {
            int mid = (low + high) / 2;
            double leftMax = cariAkselerasiMax(data, low, mid);
            double rightMax = cariAkselerasiMax(data, mid + 1, high);
            return Math.max(leftMax, rightMax);
        }
    }

    public static double cariAkselerasiMin(Latihan07mobil[] data, int low, int high) {
        if (low == high) {
            return data[low].topAcceleration;
        } else {
            int mid = (low + high) / 2;
            double leftMin = cariAkselerasiMin(data, low, mid);
            double rightMin = cariAkselerasiMin(data, mid + 1, high);
            return Math.min(leftMin, rightMin);
        }
    }

    public static double hitungRataRataTopPower(Latihan07mobil[] data) {
        double totalPower = 0;
        for (Latihan07mobil mobil : data) {
            totalPower += mobil.topPower;
        }
        return totalPower / data.length;
    }
}
