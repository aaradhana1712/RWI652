package com.multithreading;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class DownloadTaskWithExecutor implements Runnable {
    private final String fileName;
    private final ConcurrentMap<String, String> downloadResults;

    public DownloadTaskWithExecutor(String fileName, ConcurrentMap<String, String> downloadResults) {
        this.fileName = fileName;
        this.downloadResults = downloadResults;
    }

    @Override
    public void run() {
        System.out.println("Starting download: " + fileName);
        try {
            // Simulate download time
            Thread.sleep((long) (Math.random() * 3000));
            // Simulate download result
            String result = "Downloaded content of " + fileName;
            downloadResults.put(fileName, result);
            System.out.println("Completed download: " + fileName);
        } catch (InterruptedException e) {
            System.out.println("Download interrupted: " + fileName);
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        // Shared data structure to hold download results
        ConcurrentMap<String, String> downloadResults = new ConcurrentHashMap<>();

        // File names to simulate downloads
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt", "file4.txt"};

        // ExecutorService to manage threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks to the executor service
        for (String fileName : fileNames) {
            executorService.submit(new DownloadTaskWithExecutor(fileName, downloadResults));
        }

        // Shutdown the executor service
        executorService.shutdown();
        try {
            // Wait for all tasks to complete or timeout
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow(); // Force shutdown if not all tasks completed
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        // Print the download results
        System.out.println("\nDownload results:");
        downloadResults.forEach((fileName, result) -> 
            System.out.println(fileName + ": " + result)
        );
    }
}
