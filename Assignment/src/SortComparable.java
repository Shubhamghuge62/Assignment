package com.extra;
import java.util.ArrayList;
import java.util.Collections;

class A implements Comparable<A> {
    int id;
    int marks;
    String subject;

    // Constructor to initialize object of class A
    public A(int id, int marks, String subject) {
        this.id = id;
        this.marks = marks;
        this.subject = subject;
    }

    // Compare instances based on marks for the Math subject in descending order
    @Override
    public int compareTo(A other) {
        // Compare based on marks only for the Math subject in descending order
        if ("Math".equals(this.subject) && "Math".equals(other.subject)) {
            return Integer.compare(other.marks, this.marks);
        } else {
            // If subjects are different or the other subject is not Math, maintain the current order
            return 0;
        }
    }

    // Override toString method for better printing of object information
    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", marks=" + marks +
                ", subject='" + subject + '\'' +
                '}';
    }
}

public class SortComparable {
    public static void main(String[] args) {
        // Create an ArrayList of class A to store objects
        ArrayList<A> arrayList = new ArrayList<>();

        // Adding sample data to the ArrayList
        arrayList.add(new A(1, 90, "Math"));
        arrayList.add(new A(2, 85, "Math"));
        arrayList.add(new A(3, 92, "Science"));
        arrayList.add(new A(4, 88, "Science"));
        arrayList.add(new A(5, 95, "English"));
        arrayList.add(new A(6, 89, "English"));

        // Sorting the ArrayList using Collections.sort method
        Collections.sort(arrayList);

        // Printing the sorted ArrayList
        for (A a : arrayList) {
            System.out.println(a);
        }
    }
}
