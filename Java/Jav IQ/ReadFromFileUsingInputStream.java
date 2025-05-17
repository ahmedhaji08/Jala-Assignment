import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromFileUsingInputStream {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("example.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
