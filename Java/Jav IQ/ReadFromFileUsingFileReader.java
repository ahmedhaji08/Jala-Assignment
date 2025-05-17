import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileUsingFileReader {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("example.txt")) {
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
