package com.thread;


//Define the GetNameAndSetNameThread class which extends Thread
public class GetNameAndSetNameThread extends Thread {
 @Override
 public void run() {
     // Print the name of the current thread
     System.out.println(Thread.currentThread().getName());
     System.out.println("Thread Task1");
 }

 public void displayThreadName() {
     // Print the name of the current thread
     System.out.println(Thread.currentThread().getName());
 }

 public static void main(String[] args) {
     // Create an instance of GetNameAndSetNameThread
     GetNameAndSetNameThread t1 = new GetNameAndSetNameThread();

     // Set the name of the thread
     t1.setName("MyThread");

     // Start the thread
     t1.start();

     // Call the displayThreadName method
     t1.displayThreadName();
 }
}