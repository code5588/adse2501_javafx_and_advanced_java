package edu.adse2501.sess08_design_patterns_and_other_features;

import java.util.concurrent.locks.StampedLock;

/**
 * Java program that uses the Java's StampeLock class to manage a shared
 * resource, in this case, a balance amount. The StampedLock allows both read
 * and write operations with different levels of locking : - Write lock: used
 * for exclusive modifications. - Read lock: used for shared access without
 * modification. - Optimistic read lock: used for non-blocking reads, allowing
 * readers to proceed unless a write occurs.
 *
 * This class demonstrates locking mechanisms through deposit, withdraw and
 * balance checking methods.
 *
 * @author a.nyanjui
 */
public class StampedLockDemo
{

    private final StampedLock stampedLock = new StampedLock();
    private double balance;

    public StampedLockDemo(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        System.out.println("\nAbout to deposit Kes. : " + amount);
        long stamp = stampedLock.writeLock(); // Acquire an exclusive write lock
        System.out.println("Applied write lock");
        try
        {
            balance += amount; // Safely update the balance
            System.out.println("Available balance: " + balance);
        } finally
        {
            stampedLock.unlock(stamp);// Release the exclusive  write lock
            System.out.println("Unlock write lock");
        }
    }

    public void withdraw(double amount)
    {
        System.out.println("About to withdraw Kes.: " + amount);
        long stamp = stampedLock.writeLock(); // Acquire a write lock
        System.out.println("Applied write lock");
        try
        {
            balance -= amount; // Safely update the balance
            System.out.println("Available balance: " + balance);
        }finally
        {
            stampedLock.unlockWrite(stamp); // Release the write lock
            System.out.println("Unlocked write lock");
        }
    }
    
    public double checkBalance()
    {
        System.out.println("\nAbout to check balance");
        long stamp = stampedLock.readLock(); // Acquire a full read lock
        System.out.println("Applied a read lock");
        try
        {
            System.out.println("Available balance Kes.: " + this.balance);
            return this.balance;
        }finally
        {
            stampedLock.unlockRead(stamp); // Release the read lock
            System.out.println("Unlocked the read lock");
        }
    }
    
    public double checkBalanceOptimisticRead()
    {
        System.out.println("\nAbout to check the balance with optimistec read lock");
        long stamp = stampedLock.tryOptimisticRead(); // Attempt a non-blocking optimistic read
        System.out.println("Applied non-blocking optimistic read lock");
        double currentBalance = this.balance;
        
        // Validate if a write occured during the optimistic read
        if(!stampedLock.validate(stamp))
        {
            System.out.println("Stamp has changed. Applying full read lock");
            stamp = stampedLock.readLock(); // Fallback to read lock when optimistic read fails
            try
            {
                currentBalance = this.balance;
            }finally
            {
                stampedLock.unlockRead(stamp);// Release the read lock
                System.out.println("Unlock read lock");
            }
        }
        System.out.println("\nAvailable balance is Kes.: " + currentBalance);
        return currentBalance;
    }
    
    public static void main(String[] args)
    {
        // Initialise StampedLockDemo with an initial balance of 4000.00
        StampedLockDemo stampedLockDemo = new StampedLockDemo(4000.00);
        
        // Perform a series of transactions
        stampedLockDemo.withdraw(1000.0);               // Withdraw Kes. 1000.00
        stampedLockDemo.deposit(5000.0);                // Deposit  Kes. 5000.00
        stampedLockDemo.checkBalance();                 // Check balance with read lock
        stampedLockDemo.checkBalanceOptimisticRead();   // Check balance with optimistic read lock
    }
}
