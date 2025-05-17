/*1. Create a class with PRIVATE fields, private method and a main method. Print the fields in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class. */

public class PrivateFields {
    private String privateField = "Private Field";
    private int privateNumber = 42;
    private void privateMethod() {
        System.out.println("Private Method");
    }
    public static void main(String[] args) {
        PrivateFields obj = new PrivateFields();
        System.out.println(obj.privateField);
        System.out.println(obj.privateNumber);
        obj.privateMethod();
        PrivateFields.SubClass subObj = new PrivateFields.SubClass();
        subObj.accessPrivateMembers();
    }
    // Subclass
    static class SubClass extends PrivateFields {
        void accessPrivateMembers() {
            // Cannot access privateField, privateNumber, or privateMethod here
            // System.out.println(privateField); // Error: privateField has private access in PrivateFields
            // System.out.println(privateNumber); // Error: privateNumber has private access in PrivateFields
            // privateMethod(); // Error: privateMethod() has private access in PrivateFields
             System.out.println("Cannot access private fields or methods from superclass in subclass.");
        }
    }
}
