import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileUsingBufferedOutputStream {
    public static void main(String[] args) {
        String text = "Hello, Buffered World!";
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("outputBuffered.txt"))) {
            bufferedOutputStream.write(text.getBytes());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
