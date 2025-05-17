// 8. Create a PUBLIC interface with fields and methods, fields should have values assigned. Implement this interface to some class and print the values of the interface fields and call the interface methods
interface PublicInterface {
    int VALUE = 10; // Field with value
    void displayValue();
}

// Implement the interface in a class
class PublicClass implements PublicInterface {
    @Override
    public void displayValue() {
        System.out.println("Value from interface: " + VALUE);
    }
}

// Main class to test the implementation
public class PublicInterfaceWithFM {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        obj.displayValue(); // Prints the value from the interface
    }
}
