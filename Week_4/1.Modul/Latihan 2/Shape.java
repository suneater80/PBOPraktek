public class Shape { 
    private String color;
    private boolean filled;

    // Constructor 1: tanpa argumen
    public Shape() {
        this.color = "green"; 
        this.filled = true;   
    }

    // Constructor 2: dengan argumen
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter dan Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter untuk boolean biasanya menggunakan format "is"
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Method toString
    @Override
    public String toString() {
        // Menggunakan ternary operator untuk output yang lebih rapi
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "not filled");
    }
}