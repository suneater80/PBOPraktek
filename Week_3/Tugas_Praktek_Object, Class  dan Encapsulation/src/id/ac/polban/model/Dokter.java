package id.ac.polban.model;

// import class yang dibutuhkan
import id.ac.polban.model.Pasien;
import id.ac.polban.model.Obat;

public class Dokter {
    private String nama;
    private String spesialis;

    //Constructor
    public Dokter(String nama, String spesialis){
        this.nama = nama;
        this.spesialis = spesialis;
    }

    //Getter
    public String getNama(){
        return nama;
    }

    public String getSpesialis(){
        return spesialis;
    }

    //Method memeriksa pasien dan memberi obat
    // ini adalah contoh relasi Depedency
    public void periksaPasien(Pasien pasien, Obat obat) {
        System.out.println("Dokter " + nama +" (spesialis "+ spesialis +") memeriksa " +pasien.getNama() + " yang sakit " + pasien.getPenyakit());
        obat.kurangiStock(1);
        System.out.println("Obat " + obat.getNama() + " diberikan kepada " + pasien.getNama());
   }
}
