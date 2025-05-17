import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GenerateIOException {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("nonexistentfile.txt")) {
            // FileInputStream opened successfully (not expected in this example)
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}
