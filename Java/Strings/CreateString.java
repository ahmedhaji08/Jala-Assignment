// 1. Different ways creating a string
public class CreateString {
    public static void main(String[] args) {
        // 1. Using string literal
        String str1 = "Hello, World!";
        System.out.println("String using literal: " + str1);

        // 2. Using new keyword
        String str2 = new String("Hello, Java!");
        System.out.println("String using new keyword: " + str2);

        // 3. Using char array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println("String using char array: " + str3);

        // 4. Using byte array
        byte[] byteArray = {72, 101, 108, 108, 111};
        String str4 = new String(byteArray);
        System.out.println("String using byte array: " + str4);
    }
}
