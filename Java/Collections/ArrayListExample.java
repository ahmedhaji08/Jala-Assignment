import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> stringList = new ArrayList<>();

        // Add 10 string elements to ArrayList
        for (int i = 1; i <= 10; i++) {
            stringList.add("String " + i);
        }

        // Add an element to the ArrayList
        stringList.add("String 11");

        // Iterate through the ArrayList using Iterator
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add an element at a specific index
        stringList.add(5, "Inserted String");

        // Remove an element from the ArrayList at an index
        stringList.remove(2);

        // Update the element at a specific index
        stringList.set(3, "Updated String");

        // Check if an element is present at a particular index
        boolean isPresent = stringList.size() > 4 && stringList.get(4) != null;

        // Get an element at a particular index
        String elementAtIndex = stringList.get(4);

        // Find out the size of the ArrayList
        int size = stringList.size();

        // Check if a given element is present in the ArrayList
        boolean containsElement = stringList.contains("String 1");

        // Remove all elements of the ArrayList
        stringList.clear();

        // Output results
        System.out.println("Is present at index 4: " + isPresent);
        System.out.println("Element at index 4: " + elementAtIndex);
        System.out.println("Size of ArrayList: " + size);
        System.out.println("Contains 'String 1': " + containsElement);
    }
}
