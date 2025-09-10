package id.ac.polban.model;

public class Pasien{
    private String nama;
    private String penyakit;
    private static int jumlahPasien = 0;

    //Constructor
    public Pasien(String nama, String penyakit){
        this.nama = nama;
        this.penyakit = penyakit;
        jumlahPasien++;
    }

    //Getter and Setter
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getPenyakit(){
        return penyakit;
    }

    public void setPenyakit(String penyakit){
        this.penyakit = penyakit;
    }
    
    //method static untuk mendapatkan jumlah total pasien
    public static int getJumlahPasien(){
        return jumlahPasien;
    }
}