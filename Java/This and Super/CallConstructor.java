// 3. Call constructor of the current class using this()
public class CallConstructor {
    public CallConstructor() {
        System.out.println("Constructor called"); // Print message when constructor is called
    }
    public CallConstructor(int number) {
        this(); // Call the default constructor
        System.out.println("Constructor with parameter called: " + number); // Print message with parameter
    }
    public static void main(String[] args) {
        CallConstructor obj = new CallConstructor(10); // Create an object of the class with parameter
        System.out.println(obj); // Use the variable to avoid the warning
    }
}
