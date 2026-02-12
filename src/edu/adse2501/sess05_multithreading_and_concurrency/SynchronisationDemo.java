package edu.adse2501.sess05_multithreading_and_concurrency;

class Counter
{
    private int count = 0;
    
    // Synchronised method to increment the counter
    public synchronized void increment()
    {
        count++; // only one thread can access this counter at a time
    }
    
    // Method to retrieve the counter's current value
    public int getCount()
    {
        return count;
    }
}

/**
 * Java  program to demonstrate thread locking and synchronisation.
 * @author a.nyanjui
 */
public class SynchronisationDemo
{
    public static void main(String[] args)
    {
        // Declare and instantiate a Counter object/instance
        Counter counter = new Counter();
        
        // Local counters for each thread
        final int[] thread1Count = {0};
        final int[] thread2Count = {0};
        
        // Create the first thread that will access the increment() method concurrently
        Thread t1 = new Thread(() ->
        {
                for(int n = 0; n < 1000; n++)
                {
                    counter.increment();
                    thread1Count[0]++;
                }
            System.out.println("Thread 1 local count: " + thread1Count[0]);
        });
        
        // Create the second thread that will access the increment() method concurrently
        Thread t2 = new Thread(() ->
        {
                for(int n = 0; n < 1000; n++)
                {
                    counter.increment();
                    thread2Count[0]++;
                }
            System.out.println("Thread 2 local count: " + thread2Count[0]);
        });
        
        // Start both thread
        t1.start();
        t2.start();
        
        // Wait for both threads to finish
        try
        {
            t1.join();
            t2.join();
        }catch(InterruptedException ie)
        {
            System.err.println("The error: " + ie. getLocalizedMessage() + " occurred!");
        }
        
        // Print the final count (expected to be 2000 if syncronisation worked correctly)
        System.out.println("Final counter value after synchronisation: "
              + counter.getCount());
    }
}
