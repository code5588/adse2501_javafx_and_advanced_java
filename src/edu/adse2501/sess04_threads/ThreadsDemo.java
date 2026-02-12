package edu.adse2501.sess04_threads;

/**
 * Java program to demonstrate creating threads fro a class that implements
 * the java.lang.Runnable interface and one that extends the java.lang.Thread
 * class. 
 * 
 * @author a.nyanjui
 */
public class ThreadsDemo
{
    public static void main(String[] args)
    {
        // Demonstrate thread execution by creating and starting multiple threads
        for(int n = 1; n < 5; n++)
        {
            Thread t = new Thread(new ImplementRunnable(n));
            ExtendThread thread = new ExtendThread(n);
            t.start();
            thread.start();
        }
    }
}
