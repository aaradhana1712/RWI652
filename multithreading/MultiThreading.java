package com.multithreading;

// ThreadEx class extends Thread and overrides the run method
class ThreadEx extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        // Create two threads
        ThreadEx t1 = new ThreadEx();
        ThreadEx t2 = new ThreadEx();

        // Set the second thread as a daemon thread
        t2.setDaemon(true);

        // Start both threads
        t1.start();
        t2.start();

        // Main thread prints numbers
        for (int i = 0; i < 10; i++) {
            System.out.println("Main: " + i);
        }

        // Check if t1 and t2 are daemon threads
        System.out.println("t1 is daemon: " + t1.isDaemon());
        System.out.println("t2 is daemon: " + t2.isDaemon());
    }
}
