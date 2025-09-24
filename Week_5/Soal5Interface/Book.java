// Book adalah turunan dari Goods dan mengimplementasikan kontrak Taxable.
public class Book extends Goods implements Taxable {
    private String author;

    public Book(String description, double price, String author) {
        super(description, price);
        this.author = author;
    }

    // Implementasi method calculateTax
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    // Override method display() untuk menambahkan info penulis dan pajak.
    @Override
    public void display() {
        super.display();
        System.out.println("Penulis  : " + author);
        System.out.println("Pajak    : " + calculateTax());
    }
}