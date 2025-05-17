// 12. Converting Numbers to Strings with valueOf()

public class ConvertNumToString {
    public static void main(String[] args) {
        int num = 123;
        double decimalNum = 45.67;
        
        // Converting int to String
        String strNum = String.valueOf(num);
        System.out.println("Integer to String: " + strNum);
        
        // Converting double to String
        String strDecimalNum = String.valueOf(decimalNum);
        System.out.println("Double to String: " + strDecimalNum);
    }
    
}
