public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will generate ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
