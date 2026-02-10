import java.util.Scanner;

public class Tugas_perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();

        // Ambil 2 digit terakhir NIM
        int n = (int)(nim % 100);

        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n);
        System.out.print("Output: ");

        for (int i = 1; i <= n; i++) {
            // Bilangan 10 dan 15 tidak dicetak
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                // Kelipatan 3 dicetak dengan simbol #
                System.out.print("# ");
            } else if (i % 2 == 0) {
                // Bilangan genap selain kelipatan 3 dicetak sesuai angkanya
                System.out.print(i + " ");
            } else {
                // Bilangan ganjil dicetak dengan simbol *
                System.out.print("* ");
            }
        }

        System.out.println();
        sc.close();
    }
}
