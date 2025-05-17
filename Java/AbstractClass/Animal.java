/*2. Create a sub class for an abstract class. Create an object in the child class for the
abstract class and access the non-abstract methods */

public abstract class Animal {

    // Abstract method
    public abstract void makeSound();

    // Non-abstract method
    public void sleep() {
        System.out.println("Sleeping...");
    }

    // Another non-abstract method
    public void eat() {
        System.out.println("Eating food...");
    }
}
