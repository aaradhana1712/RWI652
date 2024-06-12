package com.multithreading;

class SharedCounter {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
        System.out.println(Thread.currentThread().getName() + " - Counter: " + counter);
    }

    public int getCounter() {
        return counter;
    }
}

class IncrementTask implements Runnable {
    private SharedCounter sharedCounter;

    public IncrementTask(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedCounter.increment();
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
        }
    }
}

public class SharedDataExample {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();

        Thread thread1 = new Thread(new IncrementTask(sharedCounter), "Thread 1");
        Thread thread2 = new Thread(new IncrementTask(sharedCounter), "Thread 2");

        thread1.start();
        thread2.start();
    }
}
