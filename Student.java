package org.example;

public class Student {
    String lastName, firstName;
    int score;

    public Student(String lastName, String firstName, int score) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.score = score;
    }

    public static void main(String[] args) {
        Student student = new Student("Lily", "Dang", 6);
        System.out.println("last name: " + student.lastName);
        System.out.println("first name: " + student.firstName);
        System.out.println("diem so: " + student.score);
        if (student.score > 10 || student.score < 0) {
            System.out.println("Invalid Score!");
        } else if (student.score >= 5) {
            System.out.println("result: Passed");
        } else {
            System.out.println("result: Failded");
        }
    }
}
