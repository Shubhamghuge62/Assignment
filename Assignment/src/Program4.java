package com.extra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    int ID;
    int age;
    String name;

    public Student(int ID, int age, String name) {
        this.ID = ID;
        this.age = age;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Student Details:\n" +
                "[ID: " + ID + " " +
                "Name: " + name + " " +
                "Age: " + age + "]");
    }
}

class Subject {
    int ID;
    String name;

    public Subject(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject: [ID=" + ID + ", Name='" + name + "']";
    }
}

public class Program4 {
	
    public static void main(String[] args) {
        Map<Student, List<Subject>> studentSubjectMap = new HashMap<>();

        // Create some students and subjects
        Student student1 = new Student(1, 21, "Shubham");
        Student student2 = new Student(2, 16, "Shravani");

        Subject subject1 = new Subject(101, "Math");
        Subject subject2 = new Subject(102, "History");
        Subject subject3 = new Subject(103, "Physics");

        // Add subjects to students
        studentSubjectMap.put(student1, Arrays.asList(subject1, subject2));
        studentSubjectMap.put(student2, Arrays.asList(subject2, subject3));

        // Print List of keys (students)
        System.out.println("List of Students:");
        for (Student student : studentSubjectMap.keySet()) {
            student.displayInfo();
        }

        System.out.println("------------------------------");

        // Print List of values (lists of subjects)
        System.out.println("List of Subjects:");
        for (List<Subject> subjects : studentSubjectMap.values()) {
            for (Subject subject : subjects) {
                System.out.println(subject);
            }
            System.out.println("------------------------------");
        }
    }
}
