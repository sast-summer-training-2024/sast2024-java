package examples.introduction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer n, and I will try to calculate 100 / n: ");
        try {
            int n = sc.nextInt();
            int result = 100 / n; // if n = 0 then `ArithmeticException` will be thrown
            if (n < 0)
                throw new IllegalArgumentException("Number is negative."); // custom exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // will be executed if n = 0
            System.out.println("Number is zero.");
        } catch (InputMismatchException e) {
            System.out.println("Number is not a integer.");
        } catch (Exception e) { // will be executed if other exception occurs
            e.printStackTrace();
        } finally { // will be executed always
            System.out.println("Finally block is always executed.");
            sc.close();
        }
    }
}
