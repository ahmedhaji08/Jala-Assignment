// 6. Create an interface with a default method and implement it in a class. Do not provide implementation to the default method and call the method.
interface DefaultMethodInterface {
    default void defaultMethod() {
        System.out.println("Default method from interface");
    }
}

// Implement the interface in a class
class DefaultMethodClass implements DefaultMethodInterface {
    // No need to override the default method
}

// Main class to test the implementation
public class InterfaceWithDefaultMethod {
    public static void main(String[] args) {
        DefaultMethodClass obj = new DefaultMethodClass();
        obj.defaultMethod(); // Calls the default method
    }
}
