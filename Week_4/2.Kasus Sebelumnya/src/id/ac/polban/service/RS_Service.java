package id.ac.polban.service;

import id.ac.polban.model.Dokter;
import id.ac.polban.model.Pasien;
import java.util.ArrayList;
import java.util.List;

//ini adalah contoh relasi AGGregation
//RS_Service memiliki daftar Dokter dan Pasien
public class RS_Service{
    private String namaRS;
    private List<Dokter> daftarDokter;
    private List<Pasien> daftarAntrianPasien;

    public RS_Service(String namaRS){
        this.namaRS = namaRS;
        this.daftarDokter = new ArrayList<>();
        this.daftarAntrianPasien = new ArrayList<>();
    }

    public void tambahDokter(Dokter dokter){
        this.daftarDokter.add(dokter);
        System.out.println("Dokter " + dokter.getNama() + " join the squad " + this.namaRS);
    }

    public void tambahPasien(Pasien pasien){
        this.daftarAntrianPasien.add(pasien);
        System.out.println("Pasien " + pasien.getNama() + " join the antrian");
    }

    public void tampilkanInfo(){
        System.out.println("\n--- Info " + this.namaRS + " ---");
        System.out.println("Jumlah Dokter : " + daftarDokter.size());
        System.out.println("Jumlah Pasien yang Ngantri : " + daftarAntrianPasien.size());
        System.out.println("---------------------------------");
    }

    public String getNamaRS() {
        return this.namaRS;
    }

    public int getJumlahDokter() {
        return this.daftarDokter.size();
    }

    public int getJumlahPasien() {
        return this.daftarAntrianPasien.size();
    }

    public void tampilkanDaftarDokter() {
        for (int i = 0; i < daftarDokter.size(); i++) {
            System.out.println((i + 1) + ". " + daftarDokter.get(i).getNama() + " (" + daftarDokter.get(i).getSpesialis() + ")");
        }
    }

    public void tampilkanDaftarPasien() {
        for (int i = 0; i < daftarAntrianPasien.size(); i++) {
            System.out.println((i + 1) + ". " + daftarAntrianPasien.get(i).getNama() + " (" + daftarAntrianPasien.get(i).getPenyakit() + ")");
        }
    }

    public Dokter getDokter(int index) {
        return this.daftarDokter.get(index);
    }

    public Pasien getPasien(int index) {
        return this.daftarAntrianPasien.get(index);
    }

}