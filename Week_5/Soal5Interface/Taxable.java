public interface Taxable {
    // Variabel di interface secara otomatis bersifat public, static, dan final.
    // Ini adalah konstanta untuk tarif pajak.
    double taxRate = 0.06;

    // Method di interface secara otomatis bersifat public dan abstract.
    // Setiap kelas yang mengimplementasikan Taxable WAJIB membuat method ini.
    double calculateTax();
}