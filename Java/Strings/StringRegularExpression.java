// 6. Matching a String Against a Regular Expression With matches()

public class StringRegularExpression {
    public static void main(String[] args) {
        String str = "Hello World";
        String regex = ".*World*"; // Regular expression to match any string containing "World"
        
        if (str.matches(regex)) {
            System.out.println("String matches the regular expression");
        } else {
            System.out.println("String does not match the regular expression");
        }
    }
}