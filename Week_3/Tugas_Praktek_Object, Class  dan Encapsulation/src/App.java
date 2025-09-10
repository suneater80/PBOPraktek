import id.ac.polban.model.Dokter;
import id.ac.polban.model.Pasien;
import id.ac.polban.model.Obat;
import id.ac.polban.service.RS_Service;


public class App{
    public static void main(String[] args){
        System.out.println("--- Rumah Sakit Simulator Indonesia ---");

        //membuat service Rumah Sakit (Aggregetation)
        RS_Service rsPolban = new RS_Service("RS Polban");

        //menambahkan dokter
        Dokter drcharlotte = new Dokter("charlotte", "gigi");
        rsPolban.tambahDokter(drcharlotte);

        //menambahkan pasien
        Pasien pasien1 = new Pasien("Tomi", "gigi berlubang");
        Pasien pasien2 = new Pasien("Saskee", "nyeri gigi");
        rsPolban.tambahPasien(pasien1);
        rsPolban.tambahPasien(pasien2);

        //menampilkan info service
        rsPolban.tampilkanInfo();

        //menggunakan method static dari kelas pasien
        System.out.println("Total pasien yang pernah di input: " + Pasien.getJumlahPasien());

        System.out.println("\n--- Proses Pemeriksaan ---");
        Obat paracetamol = new Obat("Paracetamol", 10);
        drcharlotte.periksaPasien(pasien1, paracetamol);

        //cek stok obat
        System.out.println("Sisa stok " + paracetamol.getNama() + ": " + paracetamol.getStock()); 
    }
}