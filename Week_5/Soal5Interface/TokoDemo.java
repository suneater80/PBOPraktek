public class TokoDemo {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan berbagai jenis barang (Goods).
        // menunjukkan polimorfisme, di mana kita bisa menyimpan objek Food, Toy, dan Book
        // dalam sebuah array bertipe Goods.
        Goods[] daftarBarang = new Goods[3];
        
        // Membuat objek dari setiap kelas anak dan menyimpannya di array.
        daftarBarang[0] = new Food("Roti Tawar", 15000, 250);
        daftarBarang[1] = new Toy("Lego City", 350000, 5);
        daftarBarang[2] = new Book("PBO dengan Java", 120000, "Ahmad Susanto");

        System.out.println("===== DAFTAR BARANG DI TOKO =====");
        
        // Melakukan iterasi pada setiap barang di dalam array dan memanggil method display().
        for (Goods barang : daftarBarang) {
            System.out.println("---------------------------------");
            barang.display(); // Java akan secara otomatis memanggil display() yang sesuai (Food, Toy, atau Book).
        }
        System.out.println("---------------------------------");
    }
}