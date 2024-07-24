package examples.oop;

public class CompositionExample {
    static class Engine {
        int typeCode;

        Engine(int typeCode) {
            this.typeCode = typeCode;
        }
        @Override
        public String toString() {
            return "Engine [typeCode=" + typeCode + "]";
        }
    }
    static class Tyre {
        int radius;

        Tyre(int radius) {
            this.radius = radius;
        }
        @Override
        public String toString() {
            return "Tyre [radius=" + radius + "]";
        }
    }
    static class Car {
        Engine engine;
        Tyre tyre;

        Car(int engineTypeCode, int tyreRadius) {
            this.engine = new Engine(engineTypeCode);
            this.tyre = new Tyre(tyreRadius);
        }
        @Override
        public String toString() {
            return "Car {" + engine + ", " + tyre + "}";
        }
    }
    public static void main(String[] args) {
        Car car = new Car(3, 5);
        System.out.println(car);
    }
}
