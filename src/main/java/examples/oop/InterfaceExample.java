package examples.oop;

public class InterfaceExample {
    interface Flyable {
        void fly();
    }

    interface Drivable {
        void drive();
    }

    static class Vehicle implements Flyable, Drivable {
        @Override
        public void fly() {
            System.out.println("Flying");
        }

        @Override
        public void drive() {
            System.out.println("Driving");
        }
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.fly();
        vehicle.drive();
    }
}
