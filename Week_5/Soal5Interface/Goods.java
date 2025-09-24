public class Goods {
    // Atribut dibuat private untuk enkapsulasi.
    private String description;
    private double price;

    // Constructor untuk menginisialisasi atribut saat objek dibuat.
    public Goods(String description, double price) {
        this.description = description;
        this.price = price;
    }

    // Method untuk menampilkan informasi dasar barang.
    public void display() {
        System.out.println("Deskripsi: " + description);
        System.out.println("Harga    : " + price);
    }

    // Getter untuk mendapatkan harga (dibutuhkan untuk menghitung pajak).
    public double getPrice() {
        return price;
    }

    // Setter jika ingin mengubah harga.
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter untuk deskripsi.
    public String getDescription() {
        return description;
    }

    // Setter untuk deskripsi.
    public void setDescription(String description) {
        this.description = description;
    }
}