// 4. Write constructors with return type int and String

// Define the ReturnTypeClass
class ReturnTypeClass {
    // Constructor
    public ReturnTypeClass() {
        System.out.println("Constructor Called");
    }

    // Method returning int
    public int getIntValue() {
        return 42;
    }

    // Method returning String
    public String getStringValue() {
        return "Hello, World!";
    }
}

// Main class to test the methods
public class ReturnIntAndString {
    public static void main(String[] args) {
        ReturnTypeClass obj = new ReturnTypeClass(); // Calls constructor
        System.out.println("Int Value: " + obj.getIntValue()); // Calls method returning int
        System.out.println("String Value: " + obj.getStringValue()); // Calls method returning String
    }
}
