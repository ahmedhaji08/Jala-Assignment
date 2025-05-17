// 2. Print instance variables in static methods

public class PrintInsInStatic {
    int a = 10;
    static void staticMethod() {
        PrintInsInStatic obj = new PrintInsInStatic();
        System.out.println("Instance variable: " + obj.a);
    }
    public static void main(String[] args) {
        staticMethod();
    }
}
