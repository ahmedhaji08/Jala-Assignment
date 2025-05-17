// 9. Trimming strings with trim()

public class TrimmingString {
    public static void main(String[] args) {
        String str = "   Hello World   ";
        System.out.println("Original string: '" + str + "'");
        
        // Trimming the string
        String trimmedStr = str.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");
    }
    
}
