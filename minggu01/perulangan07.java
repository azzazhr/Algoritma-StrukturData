import java.util.Scanner;

public class perulangan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai n
        System.out.println("Masukkan Nim: ");
        String nim = scanner.nextLine();

        System.out.print("n: ");
        int n = scanner.nextInt();

        // Validasi nilai n
        if (n < 10) {
            n += 10;
        }

        // Cetak deretan bilangan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        System.out.println();

    }
}
