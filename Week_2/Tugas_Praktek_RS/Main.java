public class Main {
    public static void main(String[] args){
        // set pasien
        Pasien pasien1 = new Pasien("tomi", "Demam");

        // Buat obat
        Obat paracetamol = new Obat("Paracetamol", 3);

        // Buat dokter
        Dokter drBudi = new Dokter("Budi", "Umum");

        // Proses pemeriksaan
        drBudi.periksaPasien(pasien1, paracetamol);

        // Lihat sisa stok
        System.out.println("Sisa stok " + paracetamol.getNama() + ": " + paracetamol.getStock());
    }
}
