public class GenerateNullPointerException {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // This will generate NullPointerException
    }
}
