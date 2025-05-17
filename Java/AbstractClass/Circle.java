// 1. Create an abstract class with abstract and non-abstract methods.

public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
