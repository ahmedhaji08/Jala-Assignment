// 4. Call argument constructor of current class using this()
public class CallArgumentConstructor {
    public CallArgumentConstructor(int number) {
        this(); // Call the default constructor
        System.out.println("Constructor with parameter called: " + number); // Print message with parameter
    }
    public CallArgumentConstructor() {
        System.out.println("Default constructor called"); // Print message when default constructor is called
    }
    public static void main(String[] args) {
        CallArgumentConstructor obj = new CallArgumentConstructor(10); // Create an object of the class with parameter
        System.out.println(obj); // Use the variable to avoid the warning
    }
    
    
}
