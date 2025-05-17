// 5. Call static methods in instance methods

public class CallStaticInIns {
    static void staticMethod() {
        System.out.println("Static method called from instance method");
    }
    void instanceMethod() {
        staticMethod();
    }
    public static void main(String args[]){
        CallStaticInIns obj = new CallStaticInIns();
        obj.instanceMethod();
    }
}
