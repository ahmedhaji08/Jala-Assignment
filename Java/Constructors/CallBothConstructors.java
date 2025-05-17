// 2. Call the constructors(both default and argument constructors) of super class from a child class
class SuperClass {
    // Default constructor
    public SuperClass() {
        System.out.println("SuperClass Default Constructor Called");
    }

    // One argument constructor
    public SuperClass(int a) {
        System.out.println("SuperClass One Argument Constructor Called with value: " + a);
    }
}

// Subclass
class SubClass extends SuperClass {
    // Subclass constructor
    public SubClass() {
        super(); // Calls the default constructor of SuperClass
        System.out.println("SubClass Default Constructor Called");
    }

    public SubClass(int a) {
        super(a); // Calls the one argument constructor of SuperClass
        System.out.println("SubClass One Argument Constructor Called");
    }
}

// Main class to test the constructors
public class CallBothConstructors {
    public static void main(String[] args) {
        SubClass obj1 = new SubClass(); // Calls SuperClass default constructor
        SubClass obj2 = new SubClass(10); // Calls SuperClass one argument constructor
        System.out.println(obj1); // Use obj1 to avoid the unused variable warning
        System.out.println(obj2); // Use obj2 to avoid the unused variable warning
    }
}
