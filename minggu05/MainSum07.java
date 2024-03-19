package minggu05;

import java.util.Scanner;

public class MainSum07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.println("Masukkan Jumlah Bulan: ");
        int elm = sc.nextInt();

        Sum07 sm = new Sum07(elm);
        System.out.println("================================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.println("Masukkan Untung Bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("================================================================");
        System.out.println("AlGORITMA BRUCE FORCE");
        System.out.println(
                "Total Keuntungan Perusahaan Selama " + sm.elemen + " Bulan Adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("================================================================");
        System.out.println("ALGORITMA DIVIDE CONQUER");
        System.out.println("Total Keuntungan Perusahaan Selama " + sm.elemen + " Bulan Adalah = "
                + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

    }
}