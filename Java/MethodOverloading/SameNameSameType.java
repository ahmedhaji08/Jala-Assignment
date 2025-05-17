// 1. Write two methods with the same name but different number of parameters of same type and call the methods from main method

class MethodOverloading {
    // Method with one parameter
    public void display(int a) {
        System.out.println("Display method with one parameter: " + a);
    }

    // Method with two parameters
    public void display(int a, int b) {
        System.out.println("Display method with two parameters: " + a + ", " + b);
    }
}

// Main class to test the methods
public class SameNameSameType {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(5);          // Calls the method with one parameter
        obj.display(10, 20);    // Calls the method with two parameters
    }
}
