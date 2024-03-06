package minggu03;

import java.util.Scanner;

public class BangunRuang07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan bangun ruang yang ingin dihitung: ");
        int jumlahBangunRuang = scanner.nextInt();
        BangunRuang07[] bangunRuangArray = new BangunRuang07[jumlahBangunRuang];

        Kerucut[] ktArray = new Kerucut[jumlahBangunRuang];
        LimasSegiEmpatSamaSisi[] lmArray = new LimasSegiEmpatSamaSisi[jumlahBangunRuang];
        Bola[] blArray = new Bola[jumlahBangunRuang];

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("Bangun Ruang ke-" + (i + 1) + ":");
            System.out.println("Pilih jenis bangun ruang:");
            System.out.println("1. Kerucut");
            System.out.println("2. Limas Segi Empat Sama Sisi");
            System.out.println("3. Bola");
            System.out.println("Masukkan angka yang anda pilih: ");
            int jenisBangunRuang = scanner.nextInt();

            switch (jenisBangunRuang) {
                case 1:
                    System.out.println("Masukkan jari-jari kerucut:");
                    double jariJariKerucut = scanner.nextDouble();
                    if (jariJariKerucut <= 0) {
                        System.out.println("Jari-jari kerucut harus positif!");
                        continue;
                    }

                    System.out.println("Masukkan sisi miring kerucut:");
                    double sisiMiringKerucut = scanner.nextDouble();
                    if (sisiMiringKerucut <= 0) {
                        System.out.println("Sisi miring kerucut harus positif!");
                        continue;
                    }

                    ktArray[i] = new Kerucut(jariJariKerucut, sisiMiringKerucut);
                    break;
                case 2:
                    System.out.println("Masukkan panjang sisi alas limas:");
                    double sisiAlasLimas = scanner.nextDouble();
                    if (sisiAlasLimas <= 0) {
                        System.out.println("Sisi alas limas harus positif!");
                        continue;
                    }

                    System.out.println("Masukkan tinggi limas:");
                    double tinggiLimas = scanner.nextDouble();
                    if (tinggiLimas <= 0) {
                        System.out.println("Tinggi limas harus positif!");
                        continue;
                    }

                    lmArray[i] = new LimasSegiEmpatSamaSisi(sisiAlasLimas, tinggiLimas);
                    break;
                case 3:
                    System.out.println("Masukkan jari-jari bola:");
                    double jariJariBola = scanner.nextDouble();
                    if (jariJariBola <= 0) {
                        System.out.println("Jari-jari bola harus positif!");
                        continue;
                    }

                    blArray[i] = new Bola(jariJariBola);
                    break;
                default:
                    System.out.println("Jenis bangun ruang tidak valid.");
                    i--;
                    break;
            }
        }

        System.out.println("Hasil Perhitungan:");

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("Bangun Ruang ke-" + (i + 1) + ":");
            if (ktArray[i] != null) {
                System.out.println("Luas Permukaan: " + ktArray[i].hitungLuasPermukaanKerucut());
                System.out.println("Volume: " + ktArray[i].hitungVolumeKerucut());
            } else if (lmArray[i] != null) {
                System.out.println("Luas Permukaan: " + lmArray[i].hitungluasPermukaanLimas());
                System.out.println("Volume: " + lmArray[i].hitungVolumeLimas());
            } else if (blArray[i] != null) {
                System.out.println("Luas Permukaan: " + blArray[i].hitungLuasPermukaanBola());
                System.out.println("Volume: " + blArray[i].hitungVolumeBola());
            }
        }
    }
}
