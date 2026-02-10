import java.util.Scanner;

public class Tugas_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMK = 8;

        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = { 2, 2, 2, 3, 2, 3, 2, 2 };

        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        System.out.println("=================================");
        System.out.println("  Program Menghitung IP Semester  ");
        // Input nilai angka mata kuliah
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("=================================");
            System.out.println("Mata Kuliah " + (i + 1) + ": " + namaMK[i]);
            System.out.print("Masukkan nilai angka (0-100) : ");
            nilaiAngka[i] = scanner.nextDouble();

            while (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("Nilai tidak valid! Masukkan angka 0-100.");
                System.out.print("Masukkan nilai angka (0-100) : ");
                nilaiAngka[i] = scanner.nextDouble();
            }

            // Konversi nilai angka ke huruf dan nilai setara
            if (nilaiAngka[i] >= 85)      { nilaiHuruf[i] = "A";  nilaiSetara[i] = 4.0; }
            else if (nilaiAngka[i] >= 80) { nilaiHuruf[i] = "A-"; nilaiSetara[i] = 3.75; }
            else if (nilaiAngka[i] >= 75) { nilaiHuruf[i] = "B+"; nilaiSetara[i] = 3.5; }
            else if (nilaiAngka[i] >= 70) { nilaiHuruf[i] = "B";  nilaiSetara[i] = 3.0; }
            else if (nilaiAngka[i] >= 65) { nilaiHuruf[i] = "B-"; nilaiSetara[i] = 2.75; }
            else if (nilaiAngka[i] >= 60) { nilaiHuruf[i] = "C+"; nilaiSetara[i] = 2.5; }
            else if (nilaiAngka[i] >= 55) { nilaiHuruf[i] = "C";  nilaiSetara[i] = 2.0; }
            else if (nilaiAngka[i] >= 50) { nilaiHuruf[i] = "C-"; nilaiSetara[i] = 1.75; }
            else if (nilaiAngka[i] >= 45) { nilaiHuruf[i] = "D+"; nilaiSetara[i] = 1.5; }
            else if (nilaiAngka[i] >= 40) { nilaiHuruf[i] = "D";  nilaiSetara[i] = 1.0; }
            else                          { nilaiHuruf[i] = "E";  nilaiSetara[i] = 0.0; }
        }

        // Hitung IP Semester
        double totalNilai = 0;
        int totalSKS = 0;
        for (int i = 0; i < jumlahMK; i++) {
            totalNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }
        double ipSemester = totalNilai / totalSKS;

        // Tampilkan hasil
        System.out.println("\n=====================================================================");
        System.out.println("                   HASIL KONVERSI NILAI                      ");
        System.out.println("=====================================================================");
        System.out.println(String.format("%-40s %-7s %-6s %-6s", "Mata Kuliah", "Angka", "Huruf", "Bobot Nilai"));
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(String.format("%-40s %-7.1f %-6s %-6.2f", namaMK[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]));
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println(String.format("%-40s %-5.2f", "IP Semester", ipSemester));
        System.out.println("=====================================================================");

        scanner.close();
    }
}
