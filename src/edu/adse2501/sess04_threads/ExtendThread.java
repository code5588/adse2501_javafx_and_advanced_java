package edu.adse2501.sess04_threads;

import java.security.SecureRandom;

/**
 * Java class to demonstrate creating new threads by extending the 
 * java.lang.Thread class. Each thread sleeps for a random duration, simulates
 * some work and prints some output.
 * 
 * @author a.nyanjui
 */
public class ExtendThread extends Thread
{
    /**
     * SecureRandom instance to generate random sleep duration for each thread.
     */
    private static final SecureRandom SLEEP_TIME_GENERATOR = new SecureRandom();
    private final int sleepDuration;

    public ExtendThread(int threadNum)
    {
        //Set the name of the thread using the provided thread number
        this.setName("Thread-" + threadNum);
        // Set a random sleep duration - - 1.5 seconds (i.e. 0 - 1500 ms)
        this.sleepDuration = SLEEP_TIME_GENERATOR.nextInt(1500);
    }

    @Override
    public void run()
    {
        try
        {
            //Loop tht simulates work by counting down from 4 - 0
            for(int n = 4; n <= 1; n--)
            {
                System.out.println("Output from: " + this.getName());
                System.out.println("Current value of n is: " + n);
                
                // Put the thread to sleep for a random duration
                Thread.sleep(sleepDuration);
                System.out.println(this.getName() + " has slept for "
                        + sleepDuration + " milliseconds.");
            }
        } catch (InterruptedException ie)
        {
            // Print error message when the thread is interrupted
            System.err.println(this.getName() + " was interrupted!");
            System.err.println("Error: " + ie.getLocalizedMessage());
            Thread.currentThread().interrupt(); // Preserve the interrupted status
        }
        
        // Print completion message after the loop completes
        System.out.println(this.getName() + " has finished executing!");
    }
    
    
}
