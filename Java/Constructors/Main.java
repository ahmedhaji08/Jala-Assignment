// 3. Apply private, public, protected and default access modifiers to the constructor
class AccessModifierClass {
    // Public constructor
    public AccessModifierClass() {
        System.out.println("Public Constructor Called");
    }

    // Protected constructor
    protected AccessModifierClass(int a) {
        System.out.println("Protected Constructor Called with value: " + a);
    }

    // Default (package-private) constructor
    AccessModifierClass(String str) {
        System.out.println("Default Constructor Called with value: " + str);
    }

    // Private constructor
    private AccessModifierClass(double d) {
        System.out.println("Private Constructor Called with value: " + d);
    }

    // Method to demonstrate calling the private constructor
    public static AccessModifierClass createInstance(double d) {
        return new AccessModifierClass(d);
    }
}

// Main class to test the constructors
public class Main {
    public static void main(String[] args) {
        AccessModifierClass obj1 = new AccessModifierClass(); // Public constructor
        System.out.println(obj1); // Use the variable to avoid unused warning
        AccessModifierClass obj2 = new AccessModifierClass(10); // Protected constructor
        System.out.println(obj2); // Use the variable to avoid unused warning
        AccessModifierClass obj3 = new AccessModifierClass("Hello"); // Default constructor
        System.out.println(obj3); // Use the variable to avoid unused warning
        AccessModifierClass obj4 = AccessModifierClass.createInstance(5.5); // Private constructor via static method
        System.out.println(obj4); // Use the variable to avoid unused warning
    }
}
