// 6. Write a function to print your name and call the function from main method.
public class CallingFunction {
    // Method to print name
    // This method is declared as static so that it can be called from the static main method
    public static void myName() {
        String name = "Mohd Ahmed Haji"; //String variablle name is declared and initialized
        System.out.println("My name is " + name);
    }
    // Main method
    // The entry point of the program
    public static void main(String[] args) {
        myName(); // Called the myName method to print the name
    }
}
