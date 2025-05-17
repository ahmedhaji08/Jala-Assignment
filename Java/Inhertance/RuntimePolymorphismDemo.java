/*A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B.
Create three methods in each class, 2 methods are specific to each class and third method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects
Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data members */



public class RuntimePolymorphismDemo {

    // Class A - Superclass
    static class A {
        // Data members
        String name = "Class A";
        int value = 10;

        // Specific method 1
        void methodA1() {
            System.out.println("A: methodA1 - Specific to class A");
        }

        // Specific method 2
        void methodA2() {
            System.out.println("A: methodA2 - Specific to class A");
        }

        // Overridden method
        void overriddenMethod() {
            System.out.println("A: overriddenMethod - from class A");
        }

        // Method to print data members
        void printDataMembers() {
            System.out.println("A: name = " + name + ", value = " + value);
        }
    }

    // Class B - Subclass of A
    static class B extends A {
        // Data members
        String name = "Class B";
        int value = 20;

        // Specific method 1
        void methodB1() {
            System.out.println("B: methodB1 - Specific to class B");
        }

        // Specific method 2
        void methodB2() {
            System.out.println("B: methodB2 - Specific to class B");
        }

        // Overridden method
        @Override
        void overriddenMethod() {
            System.out.println("B: overriddenMethod - from class B");
        }

        // Method to print data members
        @Override
        void printDataMembers() {
            System.out.println("B: name = " + name + ", value = " + value);
        }
    }

    // Class C - Subclass of B
    static class C extends B {
        // Data members
        String name = "Class C";
        int value = 30;

        // Specific method 1
        void methodC1() {
            System.out.println("C: methodC1 - Specific to class C");
        }

        // Specific method 2
        void methodC2() {
            System.out.println("C: methodC2 - Specific to class C");
        }

        // Overridden method
        @Override
        void overriddenMethod() {
            System.out.println("C: overriddenMethod - from class C");
        }

        // Method to print data members
        @Override
        void printDataMembers() {
            System.out.println("C: name = " + name + ", value = " + value);
        }
    }

    // Main method to test all
    public static void main(String[] args) {
        System.out.println("=== Method calls using each class's own object ===");
        System.out.println();

        // Object of A
        A a = new A();
        System.out.println("Object of class A:");
        a.methodA1();
        a.methodA2();
        a.overriddenMethod();
        a.printDataMembers();
        System.out.println();

        // Object of B
        B b = new B();
        System.out.println("Object of class B:");
        b.methodB1();
        b.methodB2();
        b.overriddenMethod();
        b.printDataMembers();
        System.out.println();

        // Object of C
        C c = new C();
        System.out.println("Object of class C:");
        c.methodC1();
        c.methodC2();
        c.overriddenMethod();
        c.printDataMembers();
        System.out.println();

        System.out.println("=== Overridden method called with superclass reference to subclass objects ===");
        System.out.println();

        A ref;

        // Reference of type A to object of B
        ref = b;
        System.out.println("Superclass reference of type A pointing to object of B:");
        ref.overriddenMethod();  // Calls B's overridden method
        System.out.println();

        // Reference of type A to object of C
        ref = c;
        System.out.println("Superclass reference of type A pointing to object of C:");
        ref.overriddenMethod();  // Calls C's overridden method
        System.out.println();

        // Reference of type B to object of C
        B refB = c;
        System.out.println("Superclass reference of type B pointing to object of C:");
        refB.overriddenMethod();  // Calls C's overridden method
        System.out.println();

        System.out.println("=== Runtime polymorphism demonstration with Data Members ===");
        System.out.println();

        // Accessing data members using references and objects

        System.out.println("Direct access with objects:");
        System.out.println("a.name = " + a.name + ", a.value = " + a.value);
        System.out.println("b.name = " + b.name + ", b.value = " + b.value);
        System.out.println("c.name = " + c.name + ", c.value = " + c.value);
        System.out.println();

        System.out.println("Accessing data members with superclass reference pointing to subclass objects:");
        
        System.out.println("ref = b (type A referencing B object):");
        System.out.println("ref.name = " + ref.name + ", ref.value = " + ref.value);
        // Note: Data member access is based on reference variable's declared type, no polymorphism here

        ref = c;
        System.out.println("ref = c (type A referencing C object):");
        System.out.println("ref.name = " + ref.name + ", ref.value = " + ref.value);

        refB = c;
        System.out.println("refB = c (type B referencing C object):");
        System.out.println("refB.name = " + refB.name + ", refB.value = " + refB.value);

        System.out.println();
        System.out.println("Accessing data members via overridden method printDataMembers():");
        System.out.println("ref.printDataMembers() calls overridden versions:");

        ref.printDataMembers();  // calls C's overridden method

        refB.printDataMembers();  // calls C's overridden method

        a.printDataMembers(); // A's data members
        b.printDataMembers(); // B's data members
        c.printDataMembers(); // C's data members
    }
}

