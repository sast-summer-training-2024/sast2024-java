package examples.introduction;

public class VariablesExample {
    public static void main(String[] args) {
        // Integers
        byte byteVariable = 123;
        short shortVariable = 12345;
        int intVariable = 1234567890;
        long longVariable = 1234567890123456789L;

        // Floating-point Numbers
        float floatVariable = 3.14f;
        double doubleVariable = 3.14159265358979;

        // Character
        char charVariable = 'A';

        // Boolean
        boolean booleanVariable = true;

        // Printing the values
        System.out.println("byte: " + byteVariable);
        System.out.println("short: " + shortVariable);
        System.out.println("int: " + intVariable);
        System.out.println("long: " + longVariable);
        System.out.println("float: " + floatVariable);
        System.out.println("double: " + doubleVariable);
        System.out.println("char: " + charVariable);
        System.out.println("boolean: " + booleanVariable);

        // Integer array
        int[] intArray = {1, 2, 3, 4, 5};

        // Accessing array elements
        System.out.println("First element: " + intArray[0]);
        System.out.println("Last element: " + intArray[intArray.length - 1]);

        // Iterating through the array
        System.out.println("Iterating through the array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Character array
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        // Iterating through the character array
        System.out.println("Iterating through the character array:");
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
