public class TestCylinder {
    public static void main(String[] args) {
        // c1: Cylinder dengan nilai default
        Cylinder c1 = new Cylinder();
        System.out.println("--- Cylinder 1 (default) ---");
        System.out.println(c1.toString());
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Height: " + c1.getHeight());
        System.out.println("Base Area (dari superclass): " + String.format("%.2f", c1.getArea())); // Ini akan memanggil getArea() yang di-override
        System.out.println("Volume: " + String.format("%.2f", c1.getVolume()));
        System.out.println();

        // c2: Cylinder dengan tinggi 10.0
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("--- Cylinder 2 (tinggi 10.0) ---");
        System.out.println(c2.toString());
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Height: " + c2.getHeight());
        System.out.println("Surface Area: " + String.format("%.2f", c2.getArea()));
        System.out.println("Volume: " + String.format("%.2f", c2.getVolume()));
        System.out.println();

        // c3: Cylinder dengan radius 2.0 dan tinggi 10.0
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("--- Cylinder 3 (radius 2.0, tinggi 10.0) ---");
        System.out.println(c3.toString());
        System.out.println("Radius: " + c3.getRadius());
        System.out.println("Height: " + c3.getHeight());
        System.out.println("Surface Area: " + String.format("%.2f", c3.getArea()));
        System.out.println("Volume: " + String.format("%.2f", c3.getVolume()));
        System.out.println();
    }
}