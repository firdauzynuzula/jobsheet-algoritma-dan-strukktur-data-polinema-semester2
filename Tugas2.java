import java.util.Scanner;

public class Tugas2 {
    static Scanner input = new Scanner(System.in);

    // a. Fungsi untuk menginput data jadwal kuliah ke dalam array 2 dimensi
    static void inputJadwal(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\n--- Jadwal ke-" + (i + 1) + " ---");

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = input.nextLine();

            System.out.println("Jadwal ke-" + (i + 1) + " berhasil disimpan!");
        }
    }

    // b. Fungsi untuk menampilkan seluruh jadwal kuliah dalam bentuk tabel
    static void tampilkanSemuaJadwal(String[][] jadwal) {
        System.out.println("\n===========================================================================");
        System.out.printf("| %-3s | %-25s | %-15s | %-8s | %-12s |\n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("===========================================================================");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("| %-3d | %-25s | %-15s | %-8s | %-12s |\n",
                    (i + 1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("===========================================================================");
    }

    // c. Fungsi untuk menampilkan jadwal kuliah berdasarkan hari tertentu
    static void cariByHari(String[][] jadwal, String hari) {
        boolean ditemukan = false;
        System.out.println("\n--- Jadwal Kuliah Hari " + hari + " ---");
        System.out.println("===========================================================================");
        System.out.printf("| %-3s | %-25s | %-15s | %-8s | %-12s |\n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("===========================================================================");
        int no = 1;
        for (String[] j : jadwal) {
            if (j[2].equalsIgnoreCase(hari)) {
                System.out.printf("| %-3d | %-25s | %-15s | %-8s | %-12s |\n",
                        no++, j[0], j[1], j[2], j[3]);
                ditemukan = true;
            }
        }
        System.out.println("===========================================================================");
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari + ".");
        }
    }

    // d. Fungsi untuk menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu
    static void cariByMataKuliah(String[][] jadwal, String namaMK) {
        boolean ditemukan = false;
        System.out.println("\n--- Hasil Pencarian Mata Kuliah: \"" + namaMK + "\" ---");
        System.out.println("===========================================================================");
        System.out.printf("| %-3s | %-25s | %-15s | %-8s | %-12s |\n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("===========================================================================");
        int no = 1;
        for (String[] j : jadwal) {
            if (j[0].equalsIgnoreCase(namaMK)) {
                System.out.printf("| %-3d | %-25s | %-15s | %-8s | %-12s |\n",
                        no++, j[0], j[1], j[2], j[3]);
                ditemukan = true;
            }
        }
        System.out.println("===========================================================================");
        if (!ditemukan) {
            System.out.println("Mata kuliah \"" + namaMK + "\" tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[][] jadwal = new String[jumlah][4];

        int pilihan;
        do {
            System.out.println("\n============ MENU JADWAL KULIAH ============");
            System.out.println("1. Input Jadwal Kuliah");
            System.out.println("2. Tampilkan Semua Jadwal");
            System.out.println("3. Cari Jadwal Berdasarkan Hari");
            System.out.println("4. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.println("=============================================");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    inputJadwal(jadwal);
                    break;
                case 2:
                    tampilkanSemuaJadwal(jadwal);
                    break;
                case 3:
                    System.out.print("Masukkan nama hari: ");
                    String hari = input.nextLine();
                    cariByHari(jadwal, hari);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String namaMK = input.nextLine();
                    cariByMataKuliah(jadwal, namaMK);
                    break;
                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        input.close();
    }
}
