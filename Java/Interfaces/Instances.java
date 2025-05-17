// 3. Use Interface instances to call the implemented method in the implemented class
interface Vehicle {
    void startEngine();
    int getMaxSpeed();
}

// Implement the interface in a class
class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started!");
    }

    @Override
    public int getMaxSpeed() {
        return 180;
    }
}

// Main class to test the implementation
public class Instances {
    public static void main(String[] args) {
        // Create an instance of Car using the Vehicle interface reference
        Vehicle myVehicle = new Car();

        // Call the implemented method using the interface instance
        myVehicle.startEngine(); // This will print "Car engine started!"

        // Call the getMaxSpeed method
        int speed = myVehicle.getMaxSpeed();
        System.out.println("The maximum speed is: " + speed + " km/h");
    }
}

