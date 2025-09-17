public class Square extends Rectangle { // Simpan sebagai "Square.java"

    // Constructors
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side); // Memanggil constructor Rectangle(width, length)
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // Memanggil constructor Rectangle dengan lengkap
    }
    
    // Getter dan Setter untuk 'side'
    public double getSide() {
        // Karena tidak ada variabel 'side', kita kembalikan saja width (atau length)
        return getWidth(); 
    }

    public void setSide(double side) {
        // Panggil setter dari parent untuk menjaga konsistensi
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setWidth dan setLength untuk menjaga bentuk persegi
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    // Override method toString
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}