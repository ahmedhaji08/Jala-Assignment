import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Student ID and Name
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Insert key-value pairs into the map
        for (int i = 1; i <= 10; i++) {
            studentMap.put(i, "Student " + i);
        }

        // Fetch the value of a key
        String studentName = studentMap.get(5);

        // Create a clone/copy of HashMap
        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);

        // Check if a given key is in the map
        boolean hasKey = studentMap.containsKey(3);

        // Check if a value is in the map
        boolean hasValue = studentMap.containsValue("Student 7");

        // Check if the map is empty
        boolean isEmpty = studentMap.isEmpty();

        // Print the size of the map
        int size = studentMap.size();

        // Print all the keys of the map
        System.out.println("Keys: " + studentMap.keySet());

        // Print all the values of the map
        System.out.println("Values: " + studentMap.values());

        // Remove a specific key-value pair
        studentMap.remove(2);

        // Copy all elements of the map to another map
        HashMap<Integer, String> anotherMap = new HashMap<>(studentMap);

        // Output results
        System.out.println("Student Name with ID 5: " + studentName);
        System.out.println("Cloned Map: " + clonedMap);
        System.out.println("Has Key 3: " + hasKey);
        System.out.println("Has Value 'Student 7': " + hasValue);
        System.out.println("Is Map Empty: " + isEmpty);
        System.out.println("Size of Map: " + size);
    }
}
