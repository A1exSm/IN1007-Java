package weekSeven;
import weekThree.WeekThree;

import java.lang.Math;
public class WeekSeven {
    WeekThree weekThree = new WeekThree();

    public void run() {
        if (weekThree.inputString("would you like to run weekSeven methods (y/n)? ").equals("y")) {
            switch (weekThree.inputInt("Which function would you like to run? ")) {
                case 1 -> exerciseOne();
                case 2 -> exerciseTwo();
                case 3 -> exerciseThree();
                default -> System.out.println("Invalid input");
            }
        }
    }

    public class Car {
        String model;
        int speed;
        double miles;

        Car(String model, int speed, double miles) {
            this.model = model;
            this.speed = speed;
            this.miles = miles;
        }

        void update(int speed) {
            this.speed = speed;
        }

        void update(double miles) {
            this.miles = miles;
        }
    }

    public class Sportperson {
        String name;
        String sport;
        int age;

        Sportperson(String name, String sport) {
            this.name = name;
            this.sport = sport;
            this.age = 0;
        }

        void update(int increment) {
            age += increment;
        }
    }

    public class Student {
        String name;
        int IDnumber;
        int[] marks;

        Student(String name, int IDnumber) {
            this.name = name;
            this.IDnumber = IDnumber;
            this.marks = new int[10];
        }

        void update(int index, int mark) {
            this.marks[index] = mark;
        }

        int getMarks40() {
            int numLess40 = 0;
            for (int mark : marks) {
                if (mark < 40) {
                    numLess40++;
                }
            }
            return numLess40;
        }
    }

    public class Group {
        Student student1;
        Student student2;

        Group(Student student1, Student student2) {
            this.student1 = student1;
            this.student2 = student2;
        }
    }

    public void exerciseOne() {
        Car reno = new Car("Reno", 1000, 1000);
        System.out.println(reno.model);
        reno.update(2000);
        reno.update(1500.00);
        System.out.println("Speed: " + reno.speed);
        System.out.println("Miles: " + reno.miles);
    }

    public void exerciseTwo() {
        Sportperson person = new Sportperson("John", "Cricket");
        person.update(32);
        System.out.println("Name: " + person.name + "\nAge: " + person.age + "\nSport: " + person.sport);
    }

    public void exerciseThree() {
        Student john = new Student("John", 1000);
        Student martha = new Student("Martha", 1500);
        for (int i = 0; i < john.marks.length; i++) {
            john.marks[i] = (int) (Math.random() * 100);
        }
        john.update(4, 20);
        System.out.println(john.marks[4]);
        System.out.println(john.getMarks40());

        Group students = new Group(john, martha);
        System.out.println(students.student2.name);
    }
}
