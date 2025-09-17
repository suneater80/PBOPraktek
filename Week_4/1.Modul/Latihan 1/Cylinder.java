public class Cylinder extends Circle {
    private double height; // variabel private

    // Constructors
    public Cylinder() {
        super(); // Memanggil constructor default Circle() -> radius=1.0, color="red"
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super(); // Memanggil constructor default Circle()
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius); // Memanggil constructor Circle(radius)
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Memanggil constructor Circle(radius, color)
        this.height = height;
    }

    // Getter dan Setter untuk height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Override method getArea() untuk menghitung luas permukaan silinder
    @Override
    public double getArea() {
        // Luas permukaan silinder = 2 * PI * r * h + 2 * luas alas
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Method untuk menghitung volume
    public double getVolume() {
        return super.getArea() * height;
    }

    // Override method toString()
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}