package com.multithreading;

public class SynchronizedCounter implements Runnable {

    private static int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            incrementCounter();
        }
    }

    private synchronized void incrementCounter() {
        counter++;
        System.out.println(Thread.currentThread().getName() + " - Counter: " + counter);
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }

    public static void main(String[] args) {
        SynchronizedCounter task = new SynchronizedCounter();

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
