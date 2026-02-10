import java.util.Scanner;

public class Tugas_pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Nilai Akhir ===");

        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = input.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("nilai tidak valid");
            input.close();
        }

        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = input.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("nilai tidak valid");
            input.close();
        }

        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = input.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("nilai tidak valid");
            input.close();
        }

        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = input.nextInt();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
            input.close();
        }

        double nilaiAkhir = (nilaiTugas * 0.20) + (nilaiKuis * 0.20) + (nilaiUTS * 0.30) + (nilaiUAS * 0.40);

        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 75) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 55) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 40) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        String keterangan;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "SELAMAT ANDA LULUS";
        } else {
            keterangan = "MOHON MAAF ANDA TIDAK LULUS";
        }

        System.out.println("=========================");
        System.out.print("Nilai Akhir  : " + nilaiAkhir);
        System.out.println("\n");
        System.out.println("Nilai Huruf  : " + nilaiHuruf);
        System.out.println(keterangan);
        input.close();
    }
}
