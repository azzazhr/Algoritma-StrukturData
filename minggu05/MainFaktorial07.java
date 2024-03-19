package minggu05;

import java.util.Scanner;

public class MainFaktorial07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Masukkan Jumlah Elemen: ");
        int iJml = sc.nextInt();

        Faktorial07[] fk = new Faktorial07[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial07();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + ":");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil Perhitungan Faktorial Menggunakan Brute Force Adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil Perhitungan Faktorial Menggunakan Divide and Conquer Adalah "
                            + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
