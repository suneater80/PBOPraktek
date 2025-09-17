public class Circle extends Shape { 
    private double radius;

    // Constructors
    public Circle() {
        super(); // Memanggil constructor Shape()
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super(); // Memanggil constructor Shape()
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Memanggil constructor Shape(color, filled)
        this.radius = radius;
    }

    // Getter dan Setter untuk radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method spesifik Circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override method toString
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}