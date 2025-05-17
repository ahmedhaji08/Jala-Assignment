// 7. Call static methods and instance methods in main method

public class CallStaticInsMethods {
    static void staticMethod() {
        System.out.println("Static method called");
    }

    void instanceMethod() {
        System.out.println("Instance method called");
    }
    public static void main(String args[]){
        CallStaticInsMethods obj = new CallStaticInsMethods();
        obj.instanceMethod();
        staticMethod();

    }
}
