// 4. Create two interfaces with one method each. Implement these two interfaces in one class.
interface InterfaceA {
    void methodA();
}

// Define the second interface
interface InterfaceB {
    void methodB();
}

// Implement both interfaces in a class
class CombinedClass implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Method A from Interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from Interface B");
    }
}

// Main class to test the implementation
public class TwoInterfaces {
    public static void main(String[] args) {
        CombinedClass obj = new CombinedClass();
        obj.methodA();
        obj.methodB();
    }
}
