public class Tugas_Fungsi {

    static int[][] stock = {
        {10, 5, 15, 7},   // RoyalGarden 1
        {6, 11, 9, 12},   // RoyalGarden 2
        {2, 10, 10, 5},   // RoyalGarden 3
        {5, 7, 12, 9}     // RoyalGarden 4
    };

    static int[] harga = {75000, 50000, 60000, 10000}; // Aglonema, Keladi, Alocasia, Mawar
    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    // 1. Fungsi menghitung pendapatan setiap cabang
    static int hitungPendapatan(int cabangIndex) {
        int total = 0;
        for (int j = 0; j < stock[cabangIndex].length; j++) {
            total += stock[cabangIndex][j] * harga[j];
        }
        return total;
    }

    // 2. Fungsi menentukan status cabang
    static String getStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("          LAPORAN PENDAPATAN ROYALGARDEN");
        System.out.println("========================================================");

        // Tampilkan stock bunga
        System.out.printf("%-16s", "Cabang");
        for (int b = 0; b < namaBunga.length; b++) {
            System.out.printf("%-12s", namaBunga[b]);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < stock.length; i++) {
            System.out.printf("%-16s", "RoyalGarden " + (i + 1));
            for (int j = 0; j < stock[i].length; j++) {
                System.out.printf("%-12d", stock[i][j]);
            }
            System.out.println();
        }

        System.out.println("========================================================");
        System.out.println("Harga: Aglonema=75.000 | Keladi=50.000 | Alocasia=60.000 | Mawar=10.000");
        System.out.println("========================================================");
        System.out.println();

        // Tampilkan pendapatan dan status setiap cabang
        System.out.printf("%-18s%-20s%-15s%n", "Cabang", "Pendapatan", "Status");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(i);
            String status = getStatus(pendapatan);
            String pendapatanStr = "Rp" + String.format("%,d", pendapatan).replace(',', '.');
            System.out.printf("%-18s%-20s%-15s%n", "RoyalGarden " + (i + 1), pendapatanStr, status);
        }

        System.out.println("========================================================");
    }
}
