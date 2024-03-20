package minggu05;

import java.util.Scanner;

public class MainPangkat07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String lanjut = "y";

        while (lanjut.equalsIgnoreCase("y")) {
            System.out.println("==============================");
            System.out.println("            MENU              ");
            System.out.println("==============================");
            System.out.println("1. Brute Force");
            System.out.println("2. Divide and Conquer");
            System.out.println("3. Keluar");
            System.out.println("Pilih Menu: ");
            int pilihan = sc.nextInt();

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

            switch (pilihan) {
                case 1:
                    System.out.println("===============================");
                    System.out.println("  HASIL PANGKAT - BRUTE FORCE  ");
                    System.out.println("===============================");
                    for (int i = 0; i < elemen; i++) {
                        System.out.print("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                                + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("======================================");
                    System.out.println("  HASIL PANGKAT - DIVIDE AND CONQUER  ");
                    System.out.println("======================================");
                    for (int i = 0; i < elemen; i++) {
                        System.out.print("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                                + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("=============================");
                    System.out.println("        Terima Kasih!        ");
                    System.out.println("=============================");
                    sc.close();
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println("\nApakah Anda ingin melanjutkan? (y/t)");
            lanjut = sc.nextLine();
            if (!lanjut.equalsIgnoreCase("y") && !lanjut.equalsIgnoreCase("t")) {
                lanjut = sc.nextLine();
            }
        }
    }
}
