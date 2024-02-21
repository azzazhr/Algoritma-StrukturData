import java.util.Scanner;

public class array07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=========================");

        String[] namaMatkul = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking & Problem Solving",
                "Matermatika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };
        int[] nilaiAngka = new int[namaMatkul.length];

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("Masukkan nilai angka untuk MK %s: ", namaMatkul[i]);
            nilaiAngka[i] = scanner.nextInt();
        }

        String[] nilaiHuruf = new String[namaMatkul.length];
        double[] bobotNilai = new double[namaMatkul.length];
        for (int i = 0; i < namaMatkul.length; i++) {
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            bobotNilai[i] = getBobotNilai(nilaiHuruf[i]);
        }

        double ipSemester = 0.0;
        for (int i = 0; i < namaMatkul.length; i++) {
            ipSemester += bobotNilai[i];
        }
        ipSemester /= namaMatkul.length;

        System.out.println("=========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=========================");
        System.out.printf(" %-30s %-10s %-10s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf(" %-30s %-10d %-10s %-10.2f \n", namaMatkul[i], nilaiAngka[i], nilaiHuruf[i],
                    bobotNilai[i]);
        }
        System.out.println("=========================");
        System.out.printf("IP: %.2f\n", ipSemester);
    }

    private static String konversiNilaiHuruf(int nilaiAngka) {
        if (nilaiAngka >= 80.00) {
            return "A";
        } else if (nilaiAngka >= 73.00) {
            return "B+";
        } else if (nilaiAngka >= 65.00) {
            return "B";
        } else if (nilaiAngka >= 60.00) {
            return "C+";
        } else if (nilaiAngka >= 50.00) {
            return "C";
        } else if (nilaiAngka >= 39.00) {
            return "D";
        } else {
            return "E";
        }
    }

    private static double getBobotNilai(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return 4.0;
            case "B+":
                return 3.50;
            case "B":
                return 3.0;
            case "C+":
                return 2.50;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }
}