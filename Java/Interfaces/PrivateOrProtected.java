// 9. Create a PRIVATE or PROTECTED interface and print the values as above scenario

class OuterClass {
    // Define a protected interface
    protected interface ProtectedInterface {
        int VALUE = 20; // Field with value
        void displayValue();
    }

    // Implement the interface in a nested class
    class InnerClass implements ProtectedInterface {
        @Override
        public void displayValue() {
            System.out.println("Value from protected interface: " + VALUE);
        }
    }
}

// Main class to test the implementation
public class PrivateOrProtected {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayValue(); // Prints the value from the protected interface
    }
}
