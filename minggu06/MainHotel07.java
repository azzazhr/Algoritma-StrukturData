package minggu06;

import java.util.Scanner;

public class MainHotel07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelService07 list = new HotelService07();
        Hotel07 h1 = new Hotel07("Grand Mercure", "Malang", 1123000, (byte) 5);
        Hotel07 h2 = new Hotel07("Ibis", "Surabaya", 552000, (byte) 3);
        Hotel07 h3 = new Hotel07("Pullman Jakarta Central Park", "Jakarta", 2296000, (byte) 4);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);

        list.tampil();
        System.out.println("=============================");
        System.out.println("            MENU             ");
        System.out.println("=============================");
        System.out.println("1. Harga Hotel ");
        System.out.println("2. Rating Bintang Hotel ");
        System.out.println("Pilih Menu : ");
        int pilih = sc.nextInt();

        if (pilih == 1) {
            list.bubbleSort();
            list.tampil();
        } else if (pilih == 2) {
            list.selectionSort();
            list.tampil();
        } else {
            System.out.println("Pilihan tidak valid!");
        }

    }
}
