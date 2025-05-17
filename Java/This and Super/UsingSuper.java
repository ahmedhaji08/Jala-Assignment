// 2. Print the fields/instance members of the parent class using super
class Parent {
    int number = 20; // Instance variable of the parent class
}

public class UsingSuper extends Parent {
    int number2 = 30; // Instance variable of the child class
    // Method to print instance variable of the parent class
    public void display() {
        System.out.println("Number from parent class: " + super.number); // Using 'super' keyword
        System.out.println("Number from child class: " + number2); // Without using 'super'
    }
    public static void main(String[] args) {
        UsingSuper obj = new UsingSuper();
        obj.display(); // Call the method to display the numbers
    }
}
