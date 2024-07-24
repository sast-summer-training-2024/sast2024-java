package examples.oop;

public class InheritanceExample {
    static class Animal {
        int age, weight;

        public Animal(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }
        void makeSound() {
            System.out.println("Make sound");
        }
    }
    static class Dog extends Animal {
        String color;

        Dog(int age, int weight, String color) {
            super(age, weight);
            this.color = color;
        }
        @Override
        void makeSound() {
            System.out.println("Bark bark.");
        }
    }
    static class Cat extends Animal {
        String name;

        Cat(int age, int weight, String name) {
            super(age, weight);
            this.name = name;
        }
        @Override
        void makeSound() {
            System.out.println("Meow meow.");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog(3, 25, "White");
        Cat cat = new Cat(4, 4, "Kitty");
        dog.makeSound();
        cat.makeSound();
    }
}
