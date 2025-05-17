// 3. Create an instance for the child class in child class and call abstract methods

public abstract class Vehicle {

    // Abstract method
    public abstract void start();

    // Non-abstract method (optional)
    public void fuelType() {
        System.out.println("Uses fuel");
    }
}
