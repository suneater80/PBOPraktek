// Food adalah turunan dari Goods.
public class Food extends Goods {
    private int calories;

    // Constructor untuk Food.
    public Food(String description, double price, int calories) {
        // Memanggil constructor dari kelas induk (Goods) untuk mengisi description dan price.
        super(description, price);
        this.calories = calories;
    }

    // Meng-override method display() dari kelas Goods untuk menambahkan info kalori.
    @Override
    public void display() {
        super.display(); // Memanggil display() milik Goods terlebih dahulu.
        System.out.println("Kalori   : " + calories + " kcal");
    }
}