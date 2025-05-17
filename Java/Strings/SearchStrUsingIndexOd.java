// 5. Searching in strings using indexOf()

public class SearchStrUsingIndexOd {
    public static void main(String[] args) {
        String str = "Information Technology";
        int index = str.indexOf("Tech"); // Finding the index of substring "Tech"
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found");
        }
    }
    
}
