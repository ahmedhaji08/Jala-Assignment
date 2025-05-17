// 11. Splitting strings with split()


public class SplitString {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String delimiter = ",";
        
        // Splitting the string using the specified delimiter
        String[] parts = str.split(delimiter);
        
        // Printing the split parts
        System.out.println("Original string: " + str);
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
    
}
