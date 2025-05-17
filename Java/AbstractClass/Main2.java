/**2. Create a sub class for an abstract class. Create an object in the child class for the
abstract class and access the non-abstract methods */

// Abstract superclass with non-abstract and abstract methods
abstract class Animal {
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract void makeSound();
}

// Subclass that extends the abstract class and implements abstract methods
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Create object of the subclass
        Dog dog = new Dog();

        // Access non-abstract methods from abstract class
        dog.sleep();
        dog.eat();

        // Access abstract method implementation
        dog.makeSound();
    }
}
