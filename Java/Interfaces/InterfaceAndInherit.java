// 7. Create an interface and inherit it from the other interface.
interface BaseInterface {
    void baseMethod();
}

// Define the derived interface that inherits from BaseInterface
interface DerivedInterface extends BaseInterface {
    void derivedMethod();
}

// Implement the derived interface in a class
class InheritedClass implements DerivedInterface {
    @Override
    public void baseMethod() {
        System.out.println("Base method implemented");
    }

    @Override
    public void derivedMethod() {
        System.out.println("Derived method implemented");
    }
}

// Main class to test the implementation
public class InterfaceAndInherit {
    public static void main(String[] args) {
        InheritedClass obj = new InheritedClass();
        obj.baseMethod();
        obj.derivedMethod();
    }
}
