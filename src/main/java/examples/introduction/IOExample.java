package examples.introduction;

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        // Console Output
        System.out.println("This is an output with a new line.");
        System.out.print("This is an output without a new line.");
        System.out.println("So this sentence will appear right after the last one.");

        // Console Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old!");
    }
}
