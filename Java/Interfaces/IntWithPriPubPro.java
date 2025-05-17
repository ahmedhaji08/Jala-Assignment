//10. Create an interface with private, public and protected fields.
interface MyInterface {
    // Public field (implicitly public, static, and final)
    int PUBLIC_FIELD = 100;

    // Method to display the public field
    void displayPublicField();
}

// Class implementing the interface
class MyClass implements MyInterface {
    // Protected field
    protected int protectedField = 200;

    // Private field
    private int privateField = 300;

    @Override
    public void displayPublicField() {
        System.out.println("Public Field: " + PUBLIC_FIELD);
        System.out.println("Protected Field: " + protectedField);
        System.out.println("Private Field: " + privateField);
    }
}

// Main class to test the implementation
public class IntWithPriPubPro {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayPublicField(); // Prints the values of the fields
    }
}
