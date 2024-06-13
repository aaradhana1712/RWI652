package com.thread;

//Define the DaemonThreadDemo class which extends Thread
public class DaemonThreadDemo extends Thread {
 @Override
 public void run() {
     System.out.println("This is the child thread");
 }

 public static void main(String[] args) {
     System.out.println("Parent thread");

     // Create an instance of DaemonThreadDemo
     DaemonThreadDemo d = new DaemonThreadDemo();

     // Optionally, set the thread as a daemon thread
     // Uncomment the following line to make it a daemon thread
     // d.setDaemon(true);

     // Start the thread
     d.start();
 }
}