package edu.adse2501.sess04_thread;

import java.security.SecureRandom;

/**
 * Demonstrate creating a new thread(s) by implementing the 
 * java.lang.Runnable interface and overriding its run() method. Each thread
 * sleeps for a random duration and performs a simulated task.
 * 
 * @author a.nyanjui
 */
public class ImplementRunnable implements Runnable
{
    /**
     * SecureRandom instance to generate random sleep duration for each thread.
     */
    private static final SecureRandom SLEEP_TIME_GENERATOR = new SecureRandom();
    private final int sleepDuration;
    private final String threadName;

    public ImplementRunnable(int threadNum)
    {
        this.threadName = "Thread-" + threadNum;
        this.sleepDuration = SLEEP_TIME_GENERATOR.nextInt(1500);
    }

    @Override
    public void run()
    {
        try
        {
            for(int n = 5; n < 10; n++)
            {
                System.out.println("Output from " + threadName);
                System.out.println("Current value of n is: " + n);
                
                // Put the thread to sleep for a random duration
                Thread.sleep(sleepDuration);
                System.out.println(threadName +" has slept for "
                + sleepDuration + " milliseconds.");
            }
        } catch (InterruptedException ie)
        {
            // Print error message when the thread is interrupted
            System.err.println(threadName + " was interrupted!");
            System.err.println("Error: " + ie.getLocalizedMessage());
            Thread.currentThread().interrupt(); // Preserve the interrupted status
        }
        
        // Print completion message after the loop completes
        System.out.println(threadName + " has finished executing!");
    }
    
    
    
    
}
