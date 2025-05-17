// 1. Print the fields/instance members of the current class using this and without using object
public class ThisWithoutObject {
    // Instance variable
    int number = 10;

    // Method to print instance variable
    public void display() {
        System.out.println("Number: " + this.number); // Using 'this' keyword
        System.out.println("Number: " + number);      // Without using 'this'
    }

    public static void main(String[] args) {
        ThisWithoutObject obj = new ThisWithoutObject();
        obj.display(); // Call the method to display the number
    }
}
