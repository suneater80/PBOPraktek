// Toy adalah turunan dari Goods dan mengimplementasikan kontrak Taxable.
public class Toy extends Goods implements Taxable {
    private int minimumAge;

    public Toy(String description, double price, int minimumAge) {
        super(description, price);
        this.minimumAge = minimumAge;
    }

    // Implementasi method calculateTax() yang diwajibkan oleh interface Taxable.
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
    
    // Override method display() untuk menambahkan info usia minimum dan pajak.
    @Override
    public void display() {
        super.display();
        System.out.println("Min. Usia: " + minimumAge + " tahun");
        System.out.println("Pajak    : " + calculateTax());
    }
}