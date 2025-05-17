// 4. Write two methods with the same name and same number of parameters of different type and call from main method

class MethodOverloading {
    // Method with integer parameter
    public void display(int a) {
        System.out.println("Display method with integer parameter: " + a);
    }

    // Method with String parameter
    public void display(String str) {
        System.out.println("Display method with String parameter: " + str);
    }
}

// Main class to test the methods
public class TwoMethods {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(5);          // Calls the method with integer parameter
        obj.display("Hello");    // Calls the method with String parameter
    }
}
