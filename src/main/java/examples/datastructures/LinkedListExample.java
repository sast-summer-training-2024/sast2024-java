package examples.datastructures;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a new LinkedList instance
        List<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Print the LinkedList
        System.out.println("Initial LinkedList: " + linkedList);

        // Access the first element
        String firstElement = linkedList.get(0);
        System.out.println("First Element: " + firstElement);

        // Access the last element
        String lastElement = linkedList.get(linkedList.size() - 1);
        System.out.println("Last Element: " + lastElement);

        // Remove the first occurrence of an element
        linkedList.remove("Element 2");
        System.out.println("LinkedList after removing 'Element 2': " + linkedList);

        // Add an element at the beginning
        linkedList.addFirst("New First Element");
        System.out.println("LinkedList after adding new first element: " + linkedList);

        // Add an element at the end
        linkedList.addLast("New Last Element");
        System.out.println("LinkedList after adding new last element: " + linkedList);

        // Remove the first element
        linkedList.removeFirst();
        System.out.println("LinkedList after removing the first element: " + linkedList);

        // Remove the last element
        linkedList.removeLast();
        System.out.println("LinkedList after removing the last element: " + linkedList);

        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        // Check if the LinkedList is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is the LinkedList empty? " + isEmpty);

        // Clear all elements from the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clear(): " + linkedList);

        // Demonstrate iteration over LinkedList elements
        System.out.println("Iterating over LinkedList elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
