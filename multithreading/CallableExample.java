package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<String> {

    private String taskName;

    public CallableExample(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        System.out.println(taskName + " is running on " + Thread.currentThread().getName());
        Thread.sleep(1000); // Simulate some work
        return taskName + " completed.";
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        CallableExample task = new CallableExample("Task 1");
        Future<String> result = executorService.submit(task);

        try {
            System.out.println("Result: " + result.get()); // Get the result of the task
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
