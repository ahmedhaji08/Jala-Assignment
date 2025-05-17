// 2. Create a class with DEFAULT fields and methods. Access these fields and methods from any other class in the same package
public class DefaultFieldsMethods {
    // Default (package-private) fields
    String name = "Ahmed";
    int age = 21;

    // Default (package-private) method
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

