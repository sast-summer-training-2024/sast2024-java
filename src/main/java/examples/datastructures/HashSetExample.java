package examples.datastructures;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a new HashSet instance
        Set<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Print the HashSet
        System.out.println("Initial HashSet: " + set);

        // Check if the HashSet contains an element
        boolean contains = set.contains("Banana");
        System.out.println("Does the HashSet contain 'Banana'? " + contains);

        // Remove an element from the HashSet
        set.remove("Apple");
        System.out.println("HashSet after removing 'Apple': " + set);

        // Get the size of the HashSet
        int size = set.size();
        System.out.println("Size of the HashSet: " + size);

        // Check if the HashSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clear(): " + set);

        // Demonstrate iteration over HashSet elements
        System.out.println("Iterating over HashSet elements:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Add elements back to the HashSet and demonstrate uniqueness
        set.add("Apple"); // Duplicate element
        set.add("Apple"); // Attempt to add duplicate
        System.out.println("HashSet with duplicate 'Apple': " + set);
    }
}
