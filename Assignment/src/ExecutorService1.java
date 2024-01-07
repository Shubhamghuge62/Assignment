package com.extra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService1 {

    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool size of 2
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Task 1: Calculate the square of a number
        Runnable task1 = () -> {
            int number = 5;
            int result = number * number;
            System.out.println("Task 1: Square of " + number + " is " + result + " - Thread: " + Thread.currentThread().getName());
        };

        // Task 2: Calculate the cube of a number
        Runnable task2 = () -> {
            int number = 3;
            int result = number * number * number;
            System.out.println("Task 2: Cube of " + number + " is " + result + " - Thread: " + Thread.currentThread().getName());
        };

        // Submit tasks to the ExecutorService
        executorService.submit(task1);
        executorService.submit(task2);

        // Shutdown the ExecutorService when tasks are done
        executorService.shutdown();
    }
}

