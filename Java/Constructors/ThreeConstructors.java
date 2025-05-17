// 1. Write a class with a default constructor, one argument constructor and two argument constructors. Instantiate the class to call all the constructors of that class from a main class
class MyClass {
    // Default constructor
    public MyClass() {
        System.out.println("Default Constructor Called");
    }

    // One argument constructor
    public MyClass(int a) {
        System.out.println("One Argument Constructor Called with value: " + a);
    }

    // Two argument constructor
    public MyClass(int a, int b) {
        System.out.println("Two Argument Constructor Called with values: " + a + " and " + b);
    }
}

// Main class to test the constructors
public class ThreeConstructors {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(); // Calls default constructor
        System.out.println(obj1); // Use obj1 to avoid unused variable warning
        MyClass obj2 = new MyClass(10); // Calls one argument constructor
        System.out.println(obj2); // Use obj2 to avoid unused variable warning
        MyClass obj3 = new MyClass(20, 30); // Calls two argument constructor
        System.out.println(obj3); // Use obj3 to avoid unused variable warning
    }
}
