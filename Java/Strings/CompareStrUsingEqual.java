public class CompareStrUsingEqual {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = new String("Hello World");
        
        // Using == operator
        if (str1 == str2) {
            System.out.println("str1 and str2 are the same object (==)");
        } else {
            System.out.println("str1 and str2 are different objects (==)");
        }
        
        // Using equals() method
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 have the same content (equals)");
        } else {
            System.out.println("str1 and str2 have different content (equals)");
        }
        
        // Using equals() method with new String object
        if (str1.equals(str3)) {
            System.out.println("str1 and str3 have the same content (equals)");
        } else {
            System.out.println("str1 and str3 have different content (equals)");
        }
    }
    
}
