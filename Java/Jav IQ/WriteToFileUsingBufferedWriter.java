import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileUsingBufferedWriter {
    public static void main(String[] args) {
        String text = "Hello, BufferedWriter!";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("outputBufferedWriter.txt"))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}