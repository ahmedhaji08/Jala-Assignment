import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiesFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
            String value = properties.getProperty("key"); // Replace "key" with your actual key
            System.out.println("Value: " + value);
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
