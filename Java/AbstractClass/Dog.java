/*2. Create a sub class for an abstract class. Create an object in the child class for the
abstract class and access the non-abstract methods */

public class Dog extends Animal {

    // Implementation of abstract method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // You can also define extra methods if needed
}
