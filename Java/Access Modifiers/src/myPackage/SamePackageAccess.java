package src.myPackage;

public class SamePackageAccess {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        System.out.println("Accessing public members from same package:");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        obj.showDetails();
    }
}
