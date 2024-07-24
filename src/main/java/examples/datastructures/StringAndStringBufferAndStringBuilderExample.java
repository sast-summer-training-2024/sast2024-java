package examples.datastructures;

public class StringAndStringBufferAndStringBuilderExample {
    public static void main(String[] args) {
        // String array
        String[] stringArray = {"apple", "banana", "cherry"};

        // Iterating through the string array
        System.out.println("Iterating through the string array:");
        for (String s : stringArray) {
            System.out.println(s);
        }

        // Demonstrating String immutability
        String str = "Hello";
        System.out.println("Original String: " + str);
        str += " World"; // New String object is created
        System.out.println("After concatenation: " + str);

        // Demonstrating StringBuffer usage
        StringBuffer stringBuffer = new StringBuffer("Initial");
        stringBuffer.append(" String"); // Appending to StringBuffer
        stringBuffer.insert(0, "Another "); // Inserting into StringBuffer
        System.out.println("StringBuffer: " + stringBuffer);

        // Demonstrating StringBuilder usage
        StringBuilder stringBuilder = new StringBuilder("Initial");
        stringBuilder.append(" String"); // Appending to StringBuilder
        stringBuilder.insert(0, "Another "); // Inserting into StringBuilder
        System.out.println("StringBuilder: " + stringBuilder);

        // StringBuilder is generally faster than StringBuffer
        // because it is not synchronized, making it ideal for single-threaded scenarios.

        // Example of using StringBuilder for complex string manipulations
        System.out.println("Complex StringBuilder operations:");
        stringBuilder.setLength(0); // Clear the StringBuilder content
        stringBuilder.append("Looping and ");
        stringBuilder.append("building a long ");
        stringBuilder.append("string in a ");
        stringBuilder.append("StringBuilder.");
        System.out.println(stringBuilder);

        // Convert StringBuilder to String
        String finalString = stringBuilder.toString();
        System.out.println("StringBuilder converted to String: " + finalString);
    }
}
