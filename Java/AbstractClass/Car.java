// 3. Create an instance for the child class in child class and call abstract methods

public class Car extends Vehicle {

    // Implement abstract method
    @Override
    public void start() {
        System.out.println("Car is starting with key ignition.");
    }

    // Create instance of child class and call abstract method
    public void demo() {
        Car carObj = new Car();
        carObj.start();      // Abstract method implemented in child
        carObj.fuelType();   // Non-abstract method from abstract class
    }

    public static void main(String[] args) {
        Car carInstance = new Car();
        carInstance.demo();
    }
}
