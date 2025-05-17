// 2. Create an interface with two methods, but implement only one in a class. Call the method implemented.
interface MyInterface {
    void displayMessage();
    int calculateSum(int a, int b);
}

// Implement the interface in a class
class MyClass implements MyInterface {
    @Override
    public void displayMessage() {
        System.out.println("Java is a versatile programming language!");
    }

    @Override
    public int calculateSum(int a, int b) {
        return a + b;
    }
}

// Main class to test the implementation
public class InterfaceWithTwoMethods {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.displayMessage(); // Call the method implemented

        // Uncommenting the following line will cause a compile-time error
        // int sum = myClass.calculateSum(5, 10); // This will not work since calculateSum is not implemented
    }
}
