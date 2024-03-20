package minggu05;

public class MainLatihan07 {
    public static void main(String[] args) {

        Latihan07mobil[] dataMobil = {
                new Latihan07mobil("BMW", "M2 Coupe", 2016, 6816, 728),
                new Latihan07mobil("Ford", "Fiesta ST", 2014, 3921, 575),
                new Latihan07mobil("Nissan", "370Z", 2009, 4360, 657),
                new Latihan07mobil("Subaru", "BRZ", 2014, 4058, 609),
                new Latihan07mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Latihan07mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Latihan07mobil("Toyota", "86/GT86", 2014, 4180, 609),
                new Latihan07mobil("Volkswagen", "Golf GTI", 2014, 4108, 631)
        };

        System.out.println("_______________________________________________________________________");
        System.out.println("|Merk        | Tipe            | Tahun | top_acceleration | top_power |");
        System.out.println("_______________________________________________________________________");
        System.out.println("|BMW         | M2 Coupe        | 2016  | 6816             | 728       |");
        System.out.println("|Ford        | Fiesta ST       | 2014  | 3921             | 575       |");
        System.out.println("|Nissan      | 370Z            | 2009  | 4360             | 657       |");
        System.out.println("|Subaru      | BRZ             | 2014  | 4058             | 609       |");
        System.out.println("|Subaru      | Impreza WRX STI | 2013  | 6255             | 703       |");
        System.out.println("|Toyota      | AE86 Trueno     | 1986  | 3700             | 553       |");
        System.out.println("|Toyota      | 86/GT86         | 2014  | 4180             | 609       |");
        System.out.println("|Volkswagen  | Golf GTI        | 2014  | 4180             | 631       |");
        System.out.println("=======================================================================");

        System.out.println();

        double akselerasiMax = Latihan07mobil.cariAkselerasiMax(dataMobil, 0, dataMobil.length - 1);
        System.out.println("a) Top Acceleration Tertinggi menggunakan Divide and Conquer: " + akselerasiMax);

        double akselerasimin = Latihan07mobil.cariAkselerasiMin(dataMobil, 0, dataMobil.length - 1);
        System.out.println("b) Top Acceleration Terendah menggunakan Divide and Conquer: " + akselerasimin);

        double rataRataPower = Latihan07mobil.hitungRataRataTopPower(dataMobil);
        System.out.println("c) Rata-rata Top Power dari seluruh mobil menggunakan Brute Force: " + rataRataPower);
    }
}
