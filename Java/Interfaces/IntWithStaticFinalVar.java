// 11. Create an interface with static final variable
interface Constants {
    // Static final variable
    int MAX_VALUE = 1000;
    String MESSAGE = "Hello, World!";
}

// Class implementing the interface
class ConstantsClass implements Constants {
    // Method to display the constants
    void displayConstants() {
        System.out.println("Max Value: " + MAX_VALUE);
        System.out.println("Message: " + MESSAGE);
    }
}

// Main class to test the implementation
public class IntWithStaticFinalVar {
    public static void main(String[] args) {
        ConstantsClass obj = new ConstantsClass();
        obj.displayConstants(); // Prints the values of the static final variables
    }
}
