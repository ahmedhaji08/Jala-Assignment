//4. Call instance methods in static methods

public class CallInsInStatic {
    static void staticMethod() {
        CallInsInStatic obj = new CallInsInStatic();
        obj.instanceMethod();
    }
    void instanceMethod() {
        System.out.println("Instance method called from static method");
    }
    public static void main(String[] args) {
        staticMethod();
    }
}
