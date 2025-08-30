public class Petugas {
    private String nama;

    //Constructor
    public Petugas(String nama){
        this.nama = nama;
    }

    //Getter
    public String getNama(){
        return nama;
    }

    //Method
    public void layaniPeminjaman(Peminjam peminjam, NamaBarang barang, int jumlah) {
    barang.kurangiStock(jumlah);
    System.out.println("Petugas " + nama + " melayani " + peminjam.getNama() + " meminjam " + jumlah + " " + barang.getNama());
}
}
