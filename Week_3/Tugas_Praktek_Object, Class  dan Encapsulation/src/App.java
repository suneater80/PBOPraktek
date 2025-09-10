import id.ac.polban.model.Dokter;
import id.ac.polban.model.Pasien;
import id.ac.polban.model.Obat;
import id.ac.polban.service.RS_Service;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //disini ada AGREGASI : Objek RS_Service "memiliki" daftar Dokter dan Pasien.
        RS_Service rsPolban = new RS_Service("RS Polban Sehat Interaktif");
        
        // Buat stok obat awal
        Obat paracetamol = new Obat("Paracetamol", 50);

        System.out.println("--- Selamat Datang di " + rsPolban.getNamaRS() + " ---");

        //loop agar program terus berjalan
        boolean isRunning = true;
        while (isRunning) {
            // menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Tambah Pasien Baru");
            System.out.println("2. Tambah Dokter Baru");
            System.out.println("3. Lakukan Pemeriksaan");
            System.out.println("4. Tampilkan Info Rumah Sakit");
            System.out.println("0. Keluar dari Aplikasi");
            System.out.print("Pilih menu (0-4): ");

            // ambil input dari user
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan sisa baris baru setelah nextInt()

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String namaPasien = scanner.nextLine();
                    System.out.print("Masukkan Keluhan Penyakit: ");
                    String penyakit = scanner.nextLine();
                    
                    Pasien pasienBaru = new Pasien(namaPasien, penyakit);
                    rsPolban.tambahPasien(pasienBaru);
                    break;
                case 2:
                    System.out.print("Masukkan Nama Dokter: ");
                    String namaDokter = scanner.nextLine();
                    System.out.print("Masukkan Spesialisasi: ");
                    String spesialis = scanner.nextLine();

                    Dokter dokterBaru = new Dokter(namaDokter, spesialis);
                    rsPolban.tambahDokter(dokterBaru);
                    break;
                case 3:
                    // Logika untuk melakukan pemeriksaan
                    if (rsPolban.getJumlahDokter() == 0 || rsPolban.getJumlahPasien() == 0) {
                        System.out.println("Tidak ada cukup dokter atau pasien untuk melakukan pemeriksaan.");
                        break;
                    }
                    System.out.println("Pilih Pasien yang akan diperiksa:");
                    rsPolban.tampilkanDaftarPasien();
                    System.out.print("Masukkan nomor pasien: ");
                    int noPasien = scanner.nextInt();

                    System.out.println("Pilih Dokter yang akan memeriksa:");
                    rsPolban.tampilkanDaftarDokter();
                    System.out.print("Masukkan nomor dokter: ");
                    int noDokter = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline

                    Dokter dokterPilihan = rsPolban.getDokter(noDokter - 1);
                    Pasien pasienPilihan = rsPolban.getPasien(noPasien - 1);

                    //disini ada DEPENDENSI: Metode periksaPasien menggunakan objek Pasien dan Obat
                    // untuk menyelesaikan tugasnya tanpa harus memiliki pasien dan obat secara permanen.
                    dokterPilihan.periksaPasien(pasienPilihan, paracetamol);
                    System.out.println("Sisa stok " + paracetamol.getNama() + ": " + paracetamol.getStock());
                    break;
                case 4:
                    rsPolban.tampilkanInfo();
                    System.out.println("Total pasien yang pernah dibuat (static): " + Pasien.getJumlahPasien());
                    break;
                case 0:
                    isRunning = false; // keluar dari looping
                    System.out.println("Terima kasih telah menggunakan aplikasi. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
        
        //tutup scanner
        scanner.close();
    }
}