public class CustomExceptionMessage {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception message.");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
