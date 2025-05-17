// 4. Create an instance for the child class in child class and call non-abstract methods

public class WashingMachine extends Machine {

    // Method inside the child class to create an instance and call non-abstract methods
    public void runMachine() {
        // Create instance of child class
        WashingMachine wm = new WashingMachine();

        // Call non-abstract methods from abstract parent
        wm.operate();
        wm.shutDown();
    }

    public static void main(String[] args) {
        WashingMachine obj = new WashingMachine();
        obj.runMachine();
    }
}
