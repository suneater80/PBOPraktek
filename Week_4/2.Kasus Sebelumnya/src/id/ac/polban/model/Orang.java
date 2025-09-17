package id.ac.polban.model;

// SUPERCLASS
public class Orang {
    // Properti yang sama-sama dimiliki oleh Dokter dan Pasien
    private String nama;

    // Constructor
    public Orang(String nama) {
        this.nama = nama;
    }

    // Getter
    public String getNama() {
        return this.nama;
    }
    
    // Method yang akan di override di subclass
    public void displayInfo() {
        System.out.println("Nama: " + this.nama);
    }
}