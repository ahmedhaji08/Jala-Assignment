// 1. Create an abstract class with abstract and non-abstract methods. 

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        // Call non-abstract method from abstract class
        circle.displayShapeType();

        // Call implemented abstract method
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
