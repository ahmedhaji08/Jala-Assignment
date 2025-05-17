import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileUsingFileWriter {
    public static void main(String[] args) {
        String text = "Hello, FileWriter!";
        try (FileWriter fileWriter = new FileWriter("outputFileWriter.txt")) {
            fileWriter.write(text);
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
