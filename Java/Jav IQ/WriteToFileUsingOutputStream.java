import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToFileUsingOutputStream {
    public static void main(String[] args) {
        String text = "Hello, World!";
        try (OutputStream outputStream = new FileOutputStream("output.txt")) {
            outputStream.write(text.getBytes());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
