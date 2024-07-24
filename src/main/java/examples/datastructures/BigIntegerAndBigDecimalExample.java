package examples.datastructures;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigIntegerAndBigDecimalExample {
    public static void main(String[] args) {
        // Example usage of BigInteger
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        System.out.println("BigInteger: " + bigInt);

        // Arithmetic operations with BigInteger
        BigInteger bigInt1 = new BigInteger("987654321098765432109876543210");
        BigInteger bigInt2 = new BigInteger("100");
        BigInteger sum = bigInt1.add(bigInt2);
        BigInteger difference = bigInt1.subtract(bigInt2);
        BigInteger product = bigInt1.multiply(bigInt2);
        BigInteger quotient = bigInt1.divide(bigInt2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Example usage of BigDecimal
        BigDecimal bigDec = new BigDecimal("1234567890.12345678901234567890");
        System.out.println("BigDecimal: " + bigDec);

        // Arithmetic operations with BigDecimal
        BigDecimal bigDec1 = new BigDecimal("987654321.098765432109876543210");
        BigDecimal bigDec2 = new BigDecimal("0.0012345");
        BigDecimal sumBD = bigDec1.add(bigDec2);
        BigDecimal differenceBD = bigDec1.subtract(bigDec2);
        BigDecimal productBD = bigDec1.multiply(bigDec2);
        BigDecimal quotientBD = bigDec1.divide(bigDec2, 10, RoundingMode.HALF_UP);

        System.out.println("BigDecimal Sum: " + sumBD);
        System.out.println("BigDecimal Difference: " + differenceBD);
        System.out.println("BigDecimal Product: " + productBD);
        System.out.println("BigDecimal Quotient (rounded to 10 scale): " + quotientBD);

        // Demonstrate precision of BigDecimal
        BigDecimal pi = new BigDecimal(Math.PI);
        System.out.println("Pi (to 10 scale): " + pi.setScale(10, RoundingMode.HALF_UP));
    }
}
