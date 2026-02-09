public class Rectangle implements Shape {

    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Area = length × width
    @Override
    public double getArea() {
        return length * width;
    }

    // Perimeter = 2(length + width)
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle (length=" + length + ", width=" + width + ")";
    }
}
