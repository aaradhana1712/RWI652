package com.thread;


//Define the PriorityThread class which extends Thread
public class PriorityThread extends Thread {

 @Override
 public void run() {
     // Print a message indicating the child thread is running
     System.out.println("Child Thread");

     // Print the priority of the current thread
     System.out.println("Child Thread Priority: " + Thread.currentThread().getPriority());
 }

 public static void main(String[] args) {
     // Print the priority of the main thread
     System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());

     // Create an instance of PriorityThread
     PriorityThread p = new PriorityThread();

     // Set the priority of the child thread
     p.setPriority(7);

     // Start the child thread
     p.start();
 }
}