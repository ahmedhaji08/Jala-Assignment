class MethodOverloading {
    // Method returning an integer
    public int calculate(int a) {
        return a * 2;
    }

    // Method returning a String
    public String calculate(String str) {
        return str + " World!";
    }
}

// Main class to test the methods
public class NameNumberPara {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        int result = obj.calculate(5); // Calls the method returning int
        String message = obj.calculate("Hello"); // Calls the method returning String

        System.out.println("Result: " + result);
        System.out.println("Message: " + message);
    }
}
