package examples.oop;

import java.util.Objects;

public class ObjectExample {
    static abstract class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            if (age != person.age) return false;
            return Objects.equals(name, person.name);
        }
        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }
    static class Student extends Person {
        int studentID;

        public Student(String name, int age, int studentID) {
            super(name, age);
            this.studentID = studentID;
        }
        @Override
        public String toString() {
            return "Student [name=" + name + ", age=" + age + ", studentID=" + studentID + "]";
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            if (studentID != student.studentID) return false;
            if (age != student.age) return false;
            return Objects.equals(name, student.name);
        }
        @Override
        public int hashCode() {
            return Objects.hash(name, age, studentID);
        }
    }
    static class Teacher extends Person {
        int teacherID;

        public Teacher(String name, int age, int teacherID) {
            super(name, age);
            this.teacherID = teacherID;
        }
        @Override
        public String toString() {
            return "Teacher [name=" + name + ", age=" + age + ", teacherID=" + teacherID + "]";
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Teacher teacher = (Teacher) o;
            if (teacherID != teacher.teacherID) return false;
            if (age != teacher.age) return false;
            return Objects.equals(name, teacher.name);
        }
    }
    public static void main(String[] args) {
        Student student_1 = new Student("Alice", 18, 2023000000);
        Teacher teacher_1 = new Teacher("Bob", 50, 2000000000);
        Teacher teacher_2 = new Teacher("Carol", 45, 2000000001);
        Teacher teacher_3 = new Teacher("Bob", 50, 2000000000);
        System.out.println("student_1 = " + student_1);
        System.out.println("teacher_1 = " + teacher_1);
        System.out.println("teacher_2 = " + teacher_2);
        System.out.println("student_1 == teacher_1 ? " + student_1.equals(teacher_1));
        System.out.println("teacher_1 == teacher_2 ? " + teacher_1.equals(teacher_2));
        System.out.println("teacher_1 == teacher_3 ? " + teacher_1.equals(teacher_3));
    }
}
