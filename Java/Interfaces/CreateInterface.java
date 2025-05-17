// 1. Create an interface with only one method and implement it in a class. Call the method implemented.

interface MyInterface {
    void displayMessage();
}

// Implement the interface in a class
class MyClass implements MyInterface {
    @Override
    public void displayMessage() {
        System.out.println("Hello, this is a message from MyClass!");
    }
}

// Main class to test the implementation
public class CreateInterface {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage(); // Call the method implemented
    }
}
