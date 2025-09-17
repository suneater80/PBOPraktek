package id.ac.polban.model;

// Dokter sekarang adalah SUBCLASS dari Orang
public class Dokter extends Orang {
    private String spesialis;
    // variabel 'nama' sudah tidak ada di sini, karena diwarisi dari Orang

    // Constructor
    public Dokter(String nama, String spesialis) {
        // 'super(nama)' WAJIB dipanggil pertama kali.
        // Ini untuk memanggil constructor dari superclass (Orang) untuk mengisi 'nama'.
        super(nama); 
        this.spesialis = spesialis;
    }
    
    // Getter untuk spesialis
    public String getSpesialis() {
        return spesialis;
    }

    // Method getNama() tidak perlu ditulis lagi, karena sudah diwarisi dari Orang.
    
    // Method memeriksa pasien
    public void periksaPasien(Pasien pasien, Obat obat) {
        // Kita bisa panggil getNama() seolah-olah method itu ada di class ini.
        System.out.println("Dokter " + getNama() + " (spesialis " + spesialis + ") memeriksa " + pasien.getNama() + " yang sakit " + pasien.getPenyakit());
        obat.kurangiStock(1);
        System.out.println("Obat " + obat.getNama() + " diberikan kepada " + pasien.getNama());
    }
    
    // @Override menandakan bahwa method ini menimpa method dari superclass.
    @Override
    public void displayInfo() {
        // Memanggil displayInfo() dari superclass untuk menampilkan nama, lalu menambahkan info spesialis.
        super.displayInfo(); 
        System.out.println("Profesi: Dokter, Spesialis: " + this.spesialis);
    }
}