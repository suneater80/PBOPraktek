public class TestShape { 
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println("Shape 1: " + shape1);

        Circle circle1 = new Circle(5.5, "blue", true);
        System.out.println("Circle 1: " + circle1);
        System.out.println("Area: " + String.format("%.2f", circle1.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", circle1.getPerimeter()));
        
        System.out.println();

        Rectangle rect1 = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        
        System.out.println();

        Square square1 = new Square(5.0, "yellow", true);
        System.out.println("Square 1: " + square1);
        System.out.println("Area: " + square1.getArea());
        
        // Coba ubah panjang sisinya
        square1.setLength(8.0);
        System.out.println("After setLength(8.0), side is now: " + square1.getSide());
        System.out.println("New Area: " + square1.getArea());
    }
}