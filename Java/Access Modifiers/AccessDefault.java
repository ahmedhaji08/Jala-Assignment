
public class AccessDefault {
    public static void main(String[] args) {
        DefaultFieldsMethods obj = new DefaultFieldsMethods();

        // Accessing default fields
        System.out.println("Accessing fields from AccessDefault:");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);

        // Accessing default method
        System.out.println("\nCalling showDetails method:");
        obj.showDetails();
    }
}

