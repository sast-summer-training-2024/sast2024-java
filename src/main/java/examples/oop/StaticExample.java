package examples.oop;

public class StaticExample {
    static class Car {
        static int counter = 0;
        String name;

        Car(String name) {
            this.name = name;
            counter++;
        }
    }
    public static void main(String[] args) {
        Car a = new Car("Benz");
        System.out.println("First car: " + a + ". Total car count: " + Car.counter);
        Car b = new Car("Honda");
        System.out.println("Second car: " + b + ". Total car count: " + Car.counter);
        Car c = new Car("Volkswagen");
        System.out.println("Third car: " + c + ". Total car count: " + Car.counter);
    }
}
