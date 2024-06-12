package com.multithreading;

public class AnonymousRunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Anonymous Task - Count: " + i);
                    try {
                        Thread.sleep(400); // Sleep for 400 milliseconds
                    } catch (InterruptedException e) {
                        System.out.println("Anonymous Task was interrupted.");
                    }
                }
            }
        });

        thread1.start();
    }
}
