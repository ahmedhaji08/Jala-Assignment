import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GenerateFileNotFoundException {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("nonexistentfile.txt")) {
            // Attempt to open the file (no further action needed for this example)
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}