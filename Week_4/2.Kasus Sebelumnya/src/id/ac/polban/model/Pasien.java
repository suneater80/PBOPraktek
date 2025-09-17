package id.ac.polban.model;

// SUBCLASS dari Orang
public class Pasien extends Orang {
    private String penyakit;
    // variabel 'nama' dihapus
    private static int jumlahPasien = 0;

    // Constructor
    public Pasien(String nama, String penyakit) {
        super(nama); // Memanggil constructor Orang untuk mengisi 'nama'
        this.penyakit = penyakit;
        jumlahPasien++;
    }

    // Getter untuk penyakit
    public String getPenyakit() {
        return penyakit;
    }

    // Method getNama() dihapus, karena sudah diwarisi

    // method static untuk mendapatkan jumlah total pasien
    public static int getJumlahPasien() {
        return jumlahPasien;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Status: Pasien, Keluhan: " + this.penyakit);
    }
}