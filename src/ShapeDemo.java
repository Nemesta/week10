public class ShapeDemo {
    public static Shape findLargest(Shape[] shapes) {
        Shape largest = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].getArea() > largest.getArea()) {
                largest = shapes[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle("Red", 3);
        shapes[1] = new Rectangle("Blue", 4, 5);
        shapes[2] = new Triangle("Green", 3, 4, 5);
        shapes[3] = new Circle("Yellow", 2.5);
        shapes[4] = new Rectangle("Black", 6, 2);
        shapes[5] = new Triangle("White", 5, 5, 6);
        double totalArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].displayInfo();
            totalArea = totalArea + shapes[i].getArea();
        }
        Shape largest = findLargest(shapes);
        System.out.println("Largest area shape:");
        largest.displayInfo();
        System.out.println("Total combined area: " + totalArea);
    }
}