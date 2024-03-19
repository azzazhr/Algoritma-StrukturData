package minggu05;

import java.util.Scanner;

public class MainPangkat07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Masukkan Jumlah Elemen Yang Dihitung: ");
        int elemen = sc.nextInt();

        Pangkat07[] png = new Pangkat07[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan Nilai Yang Hendak Dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan Nilai Pemangkat ke-" + (i + 1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat07(nilai, pangkat);
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.print("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            System.out.println();
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.print("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            System.out.println();
        }

    }
}
