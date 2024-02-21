import java.util.Scanner;

public class pemilihan07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=========================");

        // Input nilai tugas, kuis, UTS, dan UAS
        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = scanner.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = scanner.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = scanner.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = scanner.nextInt();

        System.out.println("=========================");
        System.out.println("=========================");

        // Validasi nilai
        if (nilaiTugas < 0 || nilaiTugas > 100 ||
                nilaiKuis < 0 || nilaiKuis > 100 ||
                nilaiUTS < 0 || nilaiUTS > 100 ||
                nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid!");
            System.out.println("========================");
            System.out.println("=========================");
            return;
        }

        // Hitung nilai akhir
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        // Konversi nilai akhir ke nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Keterangan lulus/tidak lulus
        String keterangan;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
                nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "SELAMAT ANDA LULUS";
        } else {
            keterangan = "MAAF ANDA TIDAK LULUS";
        }

        // Output hasil
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("========================");
        System.out.println("=========================");
        System.out.println("Keterangan: " + keterangan);
    }
}
