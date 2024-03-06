package minggu03;

import java.util.Scanner;

public class IpkMahasiswa07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IpkMahasiswa[] ip = new IpkMahasiswa[3];
        for (int i = 0; i < ip.length; i++) {
            ip[i] = new IpkMahasiswa();
        }
        for (int i = 0; i < ip.length; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + " :");
            System.out.print("Masukkan nama :");
            ip[i].namaMhs = input.nextLine();
            System.out.print("Masukkan nim :");
            ip[i].nim = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan jenis kelamin(L/P) :");
            ip[i].jenisKelamin = input.nextLine();
            System.out.print("Masukkan IPK :");
            ip[i].ipk = input.nextDouble();
            input.nextLine();
        }
        System.out.println();
        for (int i = 0; i < ip.length; i++) {
            System.out.println("Data Mahasiswa ke - " + (i + 1) + " : ");
            ip[i].tampilInformasi();
        }
    }

}
