package src.otherPackage;

import src.myPackage.PublicClass;

public class DifferentPackageAccess {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        System.out.println("Accessing public members from different package:");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        obj.showDetails();
    }
}
