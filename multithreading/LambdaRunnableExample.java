package com.multithreading;

public class LambdaRunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda Task - Count: " + i);
                try {
                    Thread.sleep(200); // Sleep for 200 milliseconds
                } catch (InterruptedException e) {
                    System.out.println("Lambda Task was interrupted.");
                }
            }
        });

        thread1.start();
    }
}
