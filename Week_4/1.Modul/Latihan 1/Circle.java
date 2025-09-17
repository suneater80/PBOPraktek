//The Circle class models a circle with a radius and color.

public class Circle {
    // Variabel instance private
    private double radius;
    private String color;

    // Constructors
    //1. Constructor default
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    //2. Constructor dengan radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    //3. Constructor dengan radius dan color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter dan Setter
    // Mengembalikan radius
    public double getRadius() {
        return radius;
    }

    // Mengatur radius baru
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Mengembalikan color
    public String getColor() {
        return color;
    }

    // Mengatur color baru
    public void setColor(String color) {
        this.color = color;
    }

    // Mengembalikan luas lingkaran
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Mengembalikan deskripsi string dari instance ini
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}