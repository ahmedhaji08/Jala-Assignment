
public class Student extends Person {

    // Constructor of child class
    public Student() {
        super(); // Calls the no-arg constructor of Person
        System.out.println("Student constructor called.");
    }

    // Overloaded constructor
    public Student(String name) {
        super(name); // Calls the overloaded constructor of Person
        System.out.println("Student name: " + name);
    }

    public static void main(String[] args) {
        System.out.println("Creating student with no name:");
        Student s1 = new Student();
        System.out.println("s1 object: " + s1);

        System.out.println("\nCreating student with name:");
        Student s2 = new Student("Ahmed");
        System.out.println("s2 object: " + s2);
    }
}
