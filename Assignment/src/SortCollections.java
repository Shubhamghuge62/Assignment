package com.extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class A2 {
    private int id;
    private int marks;
    private String subject;

    public A2(int id, int marks, String subject) {
        this.id = id;
        this.marks = marks;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "A2{" +
                "id=" + id +
                ", marks=" + marks +
                ", subject='" + subject + '\'' +
                '}';
    }
}

public class SortCollections {
    public static void main(String[] args) {
        ArrayList<A2> list = new ArrayList<>();
        list.add(new A2(1, 90, "Math"));
        list.add(new A2(2, 85, "Science"));
        list.add(new A2(3, 95, "English"));
        list.add(new A2(4, 88, "Math"));
        list.add(new A2(5, 92, "Science"));

        // Separate "Math" subjects from other subjects
        List<A2> mathSubjects = list.stream()
                .filter(a -> a.getSubject().equals("Math"))
                .collect(Collectors.toList());

        List<A2> otherSubjects = list.stream()
                .filter(a -> !a.getSubject().equals("Math"))
                .collect(Collectors.toList());

        // Sort "Math" subjects by marks in descending order
        Collections.sort(mathSubjects, Comparator.comparingInt(A2::getMarks).reversed());

        // Sort other subjects by subject and then by marks in descending order
        Collections.sort(otherSubjects, Comparator
                .comparing(A2::getSubject)           // First, sort by subject
                .thenComparingInt(A2::getMarks)     // Then, sort by marks within the subject
                .reversed());                       // Reversed for descending order

        // Combine the two sorted lists
        List<A2> sortedList = new ArrayList<>(mathSubjects);
        sortedList.addAll(otherSubjects);

        // Printing the sorted list
        for (A2 a : sortedList) {
            System.out.println(a);
        }
    }
}
