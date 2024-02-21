import java.util.Scanner;

public class fungsi07 {
    static int[][] stock = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };
    static String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static int[] harga = { 75000, 50000, 60000, 10000 };
    static int[] penguranganStockCabang4 = { 1, 2, 0, 5 };

    public static void main(String[] args) {

        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp" + totalPendapatan);
        }

        System.out.println();

        System.out.println("Stock Awal Cabang 4:");
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.println(namaBunga[i] + ": " + stock[3][i]);
        }

        for (int i = 0; i < namaBunga.length; i++) {
            stock[3][i] -= penguranganStockCabang4[i];
        }

        System.out.println("\nStock Setelah Pengurangan Cabang 4:");
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.println(namaBunga[i] + ": " + stock[3][i]);
        }
    }
}
