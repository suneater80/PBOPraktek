import id.ac.polban.service.*;
import id.ac.polban.model.*;

public class Runner{
    public static void main(String[] args){
        System.out.println("--- untuk ujicoba file jar berjalan pada dir lain ---");

        //membuat objek dari class yang ada di dalam JAR
        RS_Service RSBaru = new RS_Service("RS alay");

        Dokter drTirta = new Dokter("Tirta", "psikologi");
        Pasien pasienpsikis = new Pasien("syahruni", "gangguan mental");

        //menggunakan method dari objek tersebut
        RSBaru.tambahDokter(drTirta);
        RSBaru.tambahPasien(pasienpsikis);

        RSBaru.tampilkanInfo();

        System.out.println("\n--- ujicoba selesai ---");
    }
}