package examples.introduction;

public class ControlFlowExample {
    public static void main(String[] args) {
        // if-else example
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // switch example
        int month = 3;
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            default:
                monthName = "Invalid month";
        }
        System.out.println("The month is " + monthName);

        // for loop example
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while loop example
        int counter = 0;
        while (counter < 3) {
            System.out.println("Counter value: " + counter);
            counter++;
        }

        // do-while loop example
        int number = 5;
        do {
            System.out.println("Number value: " + number);
            number--;
        } while (number > 0);

        // break example
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = 5");
                break;
            }
            System.out.println("i = " + i);
        }

        // continue example
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd number: " + i);
        }
    }
}
