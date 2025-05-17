public class AccessProtected {
    public static void main(String[] args) {
        ProtectedFieldsMethods obj = new ProtectedFieldsMethods();

        // Accessing protected fields
        System.out.println("Accessing protected fields from AccessProtected:");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);

        // Accessing protected method
        System.out.println("\nCalling protected showDetails method:");
        obj.showDetails();
    }
}

