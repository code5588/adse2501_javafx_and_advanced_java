package edu.adse2501.sess09_java_data_structures;

import java.util.BitSet;

/**
 * This program demonstrates the usage of the BitSet class in Java.
 * BitSet is a class that allows the creation of a sequence of bits, 
 * which can grow as needed. It is particularly efficient for manipulating
 * large sets of bits for tasks such as checking flags or storing binary states.
 * 
 * Methods demonstrated include setting, clearing, flipping, and performing 
 * logical operations (AND, OR) on bits.
 * 
 * @author a.nyanjui
 */
public class BitsetDemo
{
    public static void main(String[] args)
    {
        // Create two Bitset instances/objects of size 8
        BitSet bitSet1 = new BitSet(8);
        BitSet bitSet2 = new BitSet(8);
        
        // Set some bits in bitSet1
        bitSet1.set(0);
        bitSet1.set(2);
        bitSet1.set(4);
        bitSet1.set(6);
        
        // Set some bits in bitSet2
        bitSet2.set(1);
        bitSet2.set(2);
        bitSet2.set(3);
        bitSet2.set(4);
        
        // Display the initial bitSets
        System.out.println("Initial bitSet1: " + bitSet1);
        System.out.println("-".repeat(45));
        System.out.println("Initial bitSet2: " + bitSet2);
        
        // Perform logical AND operation between bitSet1 and bitSet2
        BitSet andResult = (BitSet) bitSet1.clone(); // Clone bitSet1 to preserve the original
        andResult.and(bitSet2); // AND operation
        System.out.println("\nbitSet1 AND bitset2: " + andResult);
        
        // Perform logical OR operation between bitSet1 and bitSet2
        BitSet orResult = (BitSet) bitSet1.clone(); // Clone bitSet1 to preserve the original
        orResult.or(bitSet2); // OR operation
        System.out.println("\nbitSet1 OR bitset2: " + orResult);
        
        // Perform logical XOR operation between bitSet1 and bitSet2
        BitSet xorResult = (BitSet) bitSet1.clone(); // Clone bitSet1 to preserve the original
        orResult.xor(bitSet2); // XOR operation
        System.out.println("\nbitSet1 XOR bitset2: " + xorResult);
        
        // Flip (invert) the bits in bitSet1
        BitSet flippedBitSet1 = (BitSet) bitSet1.clone();
        flippedBitSet1.flip(0,8); // Flip  all bits from index 0 to 8
        System.out.println("\nFlipped bitset1: " + flippedBitSet1);
        
        // Clear a specific bit in bitSet2
        BitSet clearedBitSet2 = (BitSet) bitSet2.clone();
        clearedBitSet2.clear(2); // Clear the bit at index 2
        System.out.println("bitSet2 after clearing bit 2: " + clearedBitSet2);
        
        // Check if a specific bit is set in bitSet1
        System.out.println("\nIs bit at index 4 set in bitSet1? " + bitSet1.get(4));
        System.out.println("Is bit at index 5 set in bitSet1? " + bitSet1.get(5));
    }
}
