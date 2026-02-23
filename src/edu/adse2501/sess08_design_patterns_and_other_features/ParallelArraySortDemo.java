package edu.adse2501.sess08_design_patterns_and_other_features;

import java.util.Arrays;
import java.util.Random;

/**
 * This program demonstrates how to sort an array of random float 
 * numbers(100) using parallelSort() method from the Arrays class in Java. It
 * shows the numbers before and after sorting.
 * 
 * @author a.nyanjui
 */
public class ParallelArraySortDemo
{
    public static void main(String[] args)
    {
        // Create an array of 100 random floats
        float[] array = new float[100];
        
        // Populate that array with random float numbers between 0 - 1000
        Random random = new Random();
        for(int n = 0; n < array.length; n++)
            array[n] = random.nextFloat() * 1000; // Random floats btwn. 0 - 1000
        
        // Display the random numbers before sorting
        System.out.println("Numbers in the array before sorting :");
        printArray(array);
        
        // Sort the array using parallelSort()
        Arrays.parallelSort(array);
        
        // Display the random numbers after sorting
        System.out.println("Numbers in the array after sorting :");
        printArray(array);
    }

    private static void printArray(float[] array)
    {
        for(float num: array)
            System.out.printf("%.2f ",num); // Print/display each no. correct to 2 d.p.
        System.out.println(""); // Empty line after printing the array
    }
    
}
