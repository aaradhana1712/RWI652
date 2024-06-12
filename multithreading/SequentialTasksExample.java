package com.multithreading;

public class SequentialTasksExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 1 - Count: " + i);
                try {
                    Thread.sleep(300); // Simulate some work
                } catch (InterruptedException e) {
                    System.out.println("Task 1 was interrupted.");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 2 - Count: " + i);
                try {
                    Thread.sleep(500); // Simulate some work
                } catch (InterruptedException e) {
                    System.out.println("Task 2 was interrupted.");
                }
            }
        });

        thread1.start();
        try {
            thread1.join(); // Wait for thread1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for thread1.");
        }

        thread2.start();
        try {
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for thread2.");
        }

        System.out.println("All tasks are completed.");
    }
}
