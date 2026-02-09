public class Circle implements Shape {

    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Area = πr²
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Perimeter = 2πr
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle (radius=" + radius + ")";
    }
}
