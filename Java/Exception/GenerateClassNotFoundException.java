public class GenerateClassNotFoundException {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistentClass"); // This will generate ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception: " + e.getMessage());
        }
    }
}
