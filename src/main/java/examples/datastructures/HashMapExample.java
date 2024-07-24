package examples.datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap instance
        Map<String, Integer> map = new HashMap<>();

        // Put key-value pairs into the HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Print the HashMap
        System.out.println("Initial HashMap: " + map);

        // Get the value associated with a key
        Integer value = map.get("Two");
        System.out.println("Value for key 'Two': " + value);

        // Check if a key exists in the HashMap
        boolean containsKey = map.containsKey("Three");
        System.out.println("Does the key 'Three' exist? " + containsKey);

        // Remove a key-value pair from the HashMap
        map.remove("One");
        System.out.println("HashMap after removing 'One': " + map);

        // Get the size of the HashMap
        int size = map.size();
        System.out.println("Size of the HashMap: " + size);

        // Check if the HashMap is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is the HashMap empty? " + isEmpty);

        // Clear all key-value pairs from the HashMap
        map.clear();
        System.out.println("HashMap after clear(): " + map);

        // Demonstrate iteration over HashMap entries
        System.out.println("Iterating over HashMap entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
