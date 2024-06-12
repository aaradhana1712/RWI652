package com.multithreading;

class Task1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1 - Count: " + i);
            try {
                Thread.sleep(300); // Sleep for 300 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Task 1 was interrupted.");
            }
        }
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2 - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Task 2 was interrupted.");
            }
        }
    }
}

public class MultipleRunnableTasks {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());

        thread1.start();
        thread2.start();
    }
}
