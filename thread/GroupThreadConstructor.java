package com.thread;

public class GroupThreadConstructor extends Thread {

    @Override
    public void run() {
        // Print if the current thread is alive
        System.out.println("Is thread alive: " + Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        // Create a new instance of GroupThreadConstructor
        GroupThreadConstructor thread = new GroupThreadConstructor();

        // Check if the thread is alive before starting
        System.out.println("Thread is started or not = " + thread.isAlive());

        // Start the thread properly
        thread.start();

        // Wait a bit to ensure the thread has started
        try {
            thread.join(100);  // Join the thread with a small delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is alive after starting
        System.out.println("After starting the thread = " + thread.isAlive());

        // Create a ThreadGroup named "Parent Thread"
        ThreadGroup tg1 = new ThreadGroup("Parent Thread");

        // Create threads associated with the ThreadGroup
        Thread tg3 = new Thread(tg1, thread, "the");
        Thread tg4 = new Thread(tg1, thread, "work");

        // Start the threads associated with the ThreadGroup
        tg3.start();
        tg4.start();

        // Print the name of the ThreadGroup
        System.out.println("Thread Group Name: " + tg1.getName());

        // List all active threads in the ThreadGroup
        tg1.list();

        // Wait for tg3 and tg4 to finish
        try {
            tg3.join();
            tg4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}