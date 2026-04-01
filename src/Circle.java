public class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}