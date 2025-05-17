// 5. Create two interfaces with the same method (same signature) in both the interfaces. Implement these two interfaces in one class. Call the method.
interface InterfaceX {
    void commonMethod();
}

// Define the second interface
interface InterfaceY {
    void commonMethod();
}

// Implement both interfaces in a class
class ImplementingClass implements InterfaceX, InterfaceY {
    @Override
    public void commonMethod() {
        System.out.println("Common method implemented in ImplementingClass");
    }
}

// Main class to test the implementation
public class TwoInterfacesWithSameMethod {
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.commonMethod(); // Calls the common method
    }
}
