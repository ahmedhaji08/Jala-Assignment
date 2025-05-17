// 5. Try to call the constructor multiple times with the same object
class MyClass {
    // Constructor
    public MyClass(int value) {
        System.out.println("Constructor Called with value: " + value);
    }

    // Method to create a new instance
    public void createNewInstance(int value) {
        new MyClass(value); // Calls the constructor again
    }
}

// Main class to test the constructor calls
public class CallConstMultiTimes {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10); // Calls the constructor for the first time

        // Simulate calling the constructor multiple times by creating new instances
        obj.createNewInstance(20); // Calls the constructor for the second time
        obj.createNewInstance(30); // Calls the constructor for the third time
    }
}
