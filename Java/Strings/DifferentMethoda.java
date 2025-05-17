// 8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

public class DifferentMethoda {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        
        // Using equalsIgnoreCase() method
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("str1 and str2 are equal (ignoring case)");
        } else {
            System.out.println("str1 and str2 are not equal (ignoring case)");
        }
        
        // Using startsWith() method
        if (str1.startsWith("Hello")) {
            System.out.println("str1 starts with 'Hello'");
        } else {
            System.out.println("str1 does not start with 'Hello'");
        }
        
        // Using endsWith() method
        if (str1.endsWith("World")) {
            System.out.println("str1 ends with 'World'");
        } else {
            System.out.println("str1 does not end with 'World'");
        }
        
        // Using compareTo() method
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("str1 and str2 are equal");
        } else if (result < 0) {
            System.out.println("str1 is less than str2");
        } else {
            System.out.println("str1 is greater than str2");
        }
    }
}
