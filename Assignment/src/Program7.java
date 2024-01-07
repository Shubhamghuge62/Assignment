package com.extra;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class C {
    int id;
    int marks;
    String subject;

    public C(int id, int marks, String subject) {
        this.id = id;
        this.marks = marks;
        this.subject = subject;
    }

    // Getters and setters can be added if needed

    @Override
    public String toString() {
        return "C{" +
                "id=" + id +
                ", marks=" + marks +
                ", subject='" + subject + '\'' +
                '}';
    }
}

public class Program7 {
	
    public static void main(String[] args) {
        // Create a list of class A
        List<C> classAList = new ArrayList<>();
        classAList.add(new C(1, 80, "Math"));
        classAList.add(new C(2, 55, "English"));
        classAList.add(new C(3, 70, "Science"));
        classAList.add(new C(4,59, "History"));

        // Filter the list to include only entries with marks more than 60
        List<C> filteredList = classAList.stream()
                .filter(c -> c.marks > 60)
                .collect(Collectors.toList());

        // Print the filtered list
        for (C element : filteredList) {
            System.out.println(element);
        }
    }
}
