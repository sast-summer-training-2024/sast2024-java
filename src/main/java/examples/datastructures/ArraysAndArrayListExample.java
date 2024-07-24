package examples.datastructures;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndArrayListExample {
    public static void main(String[] args) {
        // Example usage of Arrays
        int[] numbersArray = {1, 1, 4, 5, 1, 4};

        // Print the length of the array
        System.out.println("numbersArray.length = " + numbersArray.length);

        // Print the first element of the array
        System.out.println("numbersArray[0] = " + numbersArray[0]);

        // Use Arrays.toString to print the contents of the array
        System.out.println("Arrays.toString(numbersArray) = " + Arrays.toString(numbersArray));

        // Check if the array is equal to itself
        System.out.println("Arrays.equals(numbersArray, numbersArray) = " + Arrays.equals(numbersArray, numbersArray));

        // Use Arrays.binarySearch to perform binary search for the element 4
        System.out.println("Arrays.binarySearch(numbersArray, 4) = " + Arrays.binarySearch(numbersArray, 4));

        // Use Arrays.copyOf to create a new array containing the first 3 elements of the original array
        System.out.println("Arrays.copyOf(numbersArray, 3) = " + Arrays.toString(Arrays.copyOf(numbersArray, 3)));

        // Use Arrays.copyOfRange to create a subarray from index 1 to 3
        System.out.println("Arrays.copyOfRange(numbersArray, 1, 3) = " + Arrays.toString(Arrays.copyOfRange(numbersArray, 1, 3)));

        // Use Arrays.sort to sort the array
        Arrays.sort(numbersArray);
        System.out.println("Arrays.sort(numbersArray) = " + Arrays.toString(numbersArray));

        // Use Arrays.fill to fill the array with zeros
        Arrays.fill(numbersArray, 0);
        System.out.println("Arrays.fill(numbersArray, 0) = " + Arrays.toString(numbersArray));

        // Print the hash code of the array after filling with zeros
        System.out.println("Arrays.hashCode(numbersArray) = " + Arrays.hashCode(numbersArray));

        // Example usage of ArrayList
        ArrayList<String> sitesList = new ArrayList<>();

        // Add elements to the ArrayList
        sitesList.add("Google");
        sitesList.add("Runoob");
        sitesList.add("Taobao");
        sitesList.add("Weibo");

        // Print all elements in the ArrayList
        System.out.println("ArrayList<String> sitesList = " + sitesList);

        // Example of other ArrayList operations
        // Check if the ArrayList contains a specific element
        System.out.println("sitesList.contains(\"Runoob\") = " + sitesList.contains("Runoob"));

        // Get the size of the ArrayList
        System.out.println("sitesList.size() = " + sitesList.size());

        // Remove an element from the ArrayList
        sitesList.remove("Taobao");
        System.out.println("sitesList after removing \"Taobao\" = " + sitesList);

        // Get an element at a specific index
        System.out.println("sitesList.get(1) = " + sitesList.get(1));

        // Set an element at a specific index
        sitesList.set(1, "Baidu");
        System.out.println("sitesList after setting index 1 to \"Baidu\" = " + sitesList);

        // Clear all elements in the ArrayList
        sitesList.clear();
        System.out.println("sitesList after clear() = " + sitesList);
    }
}
