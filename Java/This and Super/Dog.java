public class Dog extends Animal {

    public String type = "Dog";

    // Overriding makeSound()
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    public void showTypes() {
        System.out.println("this.type = " + this.type);   // Dog's own type
        System.out.println("super.type = " + super.type); // Animal's type
    }

    public void demonstrate() {
        this.makeSound();    // Calls Dog's method
        super.makeSound();   // Calls Animal's method
        this.displayInfo();  // Inherited method from Animal
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.showTypes();
        dog.demonstrate();
    }
}
