public class Main {
    public static void main(String[] args){
        // Buat barang
        NamaBarang proyektor = new NamaBarang("Proyektor", 4);
        NamaBarang colokan = new NamaBarang("Colokan", 5);

        // Buat peminjam
        Peminjam hakim = new Peminjam("Hakim", "241511044");

        // Buat petugas
        Petugas budi = new Petugas("Budi");

        // Proses peminjaman
        budi.layaniPeminjaman(hakim, proyektor, 1);
        budi.layaniPeminjaman(hakim, colokan, 1);

        // Cek sisa stok
        System.out.println("Sisa stok " + proyektor.getNama() + ": " + proyektor.getStock());
        System.out.println("Sisa stok " + colokan.getNama() + ": " + colokan.getStock());
    }
}
