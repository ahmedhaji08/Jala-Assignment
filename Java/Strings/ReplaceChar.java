// 10. Replacing characters in strings with replace()

public class ReplaceChar {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original string: " + str);
        
        // Replacing 'o' with 'a'
        String replacedStr = str.replace('o', 'a');
        System.out.println("String after replacing 'o' with 'a': " + replacedStr);
        
        // Replacing "World" with "Java"
        String replacedStr2 = str.replace("World", "Java");
        System.out.println("String after replacing 'World' with 'Java': " + replacedStr2);
    }
    
}
