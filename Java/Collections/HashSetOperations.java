import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create a HashSet with at least 10 elements of type String
        HashSet<String> stringSet = new HashSet<>();

        // Add elements to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Elderberry");
        stringSet.add("Fig");
        stringSet.add("Grape");
        stringSet.add("Honeydew");
        stringSet.add("Indian Fig");
        stringSet.add("Jackfruit");

        System.out.println("Initial HashSet: " + stringSet);

        // Add a duplicate element (will not add as HashSet doesn't allow duplicates)
        boolean isAdded = stringSet.add("Apple");
        System.out.println("Trying to add duplicate 'Apple': " + (isAdded ? "Added" : "Not Added"));

        // Check if an element is present
        boolean containsCherry = stringSet.contains("Cherry");
        System.out.println("Contains 'Cherry'? " + containsCherry);

        // Remove an element
        boolean isRemoved = stringSet.remove("Date");
        System.out.println("Removed 'Date'? " + isRemoved);

        // Attempt to remove an element not present
        boolean removedMango = stringSet.remove("Mango");
        System.out.println("Removed 'Mango'? " + removedMango);

        // Iterate through the HashSet using Iterator
        System.out.println("Iterating over HashSet:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Size of the HashSet
        int size = stringSet.size();
        System.out.println("Size of HashSet: " + size);

        // Clear all elements of the HashSet
        stringSet.clear();
        System.out.println("HashSet after clear(): " + stringSet);

        // Check if HashSet is empty
        boolean isEmpty = stringSet.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);

        // Add all elements from another collection (using addAll)
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Kiwi");
        anotherSet.add("Lemon");
        anotherSet.add("Mango");

        stringSet.addAll(anotherSet);
        System.out.println("HashSet after addAll(anotherSet): " + stringSet);

        // Remove all elements present in anotherSet from stringSet
        stringSet.removeAll(anotherSet);
        System.out.println("HashSet after removeAll(anotherSet): " + stringSet);

        // Retain all elements present in another set (intersection)
        stringSet.add("Kiwi");
        stringSet.add("Lemon");
        stringSet.add("Mango");
        stringSet.add("Nectarine");
        System.out.println("HashSet before retainAll(anotherSet): " + stringSet);
        stringSet.retainAll(anotherSet);
        System.out.println("HashSet after retainAll(anotherSet): " + stringSet);

        // Convert HashSet to array
        Object[] array = stringSet.toArray();
        System.out.println("HashSet to Array:");
        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}

