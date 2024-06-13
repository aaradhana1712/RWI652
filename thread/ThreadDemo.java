package com.thread;

//Define a class that extends Thread to demonstrate daemon thread and naming functionality
public class ThreadDemo extends Thread {

 @Override
 public void run() {
     // Print the name of the current thread
     System.out.println(Thread.currentThread().getName() + " is executing.");
     System.out.println("Thread Task1");
 }

 // Method to display the name of the current thread
 public void displayThreadName() {
     System.out.println("Current Thread: " + Thread.currentThread().getName());
 }

 public static void main(String[] args) {
     // Parent thread action
     System.out.println("Parent thread is running.");

     // Create an instance of the ThreadDemo class
     ThreadDemo t1 = new ThreadDemo();

     // Set the name of the thread
     t1.setName("MyCustomThread");

     // Optionally set the thread as a daemon thread
     // Uncomment the following line to make it a daemon thread
     // t1.setDaemon(true);

     // Start the thread
     t1.start();

     // Call the displayThreadName method to show the current thread's name
     t1.displayThreadName();

     // Check and print if the thread is a daemon thread
     System.out.println(t1.getName() + " is daemon: " + t1.isDaemon());
 }
}