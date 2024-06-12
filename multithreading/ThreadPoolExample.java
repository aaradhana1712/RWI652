package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample implements Runnable {

    private String taskName;

    public ThreadPoolExample(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " is running on " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println(taskName + " was interrupted.");
        }
        System.out.println(taskName + " has completed.");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            ThreadPoolExample task = new ThreadPoolExample("Task " + i);
            executorService.execute(task);
        }

        executorService.shutdown();
    }
}
