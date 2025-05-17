class BaseClass {
    // Method in the base class
    public void display(int a) {
        System.out.println("BaseClass display method: " + a);
    }
}

class DerivedClass extends BaseClass {
    // Method in the derived class with the same name and parameters
    public void display(int a) {
        System.out.println("DerivedClass display method: " + a);
    }
}

// Main class to test the methods
public class SameNameSameNumber {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.display(10); // Calls the display method in DerivedClass
    }
}
