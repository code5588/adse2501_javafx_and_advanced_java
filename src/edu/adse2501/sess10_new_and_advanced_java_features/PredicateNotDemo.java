package edu.adse2501.sess10_new_and_advanced_java_features;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This program demonstrates the usage of the Predicate.not method in Java. The
 * Predicate.not method provides a cleaner way to negate predicates, especially
 * useful when filtering collections.
 *
 * @author a.nyanjui
 */
public class PredicateNotDemo
{

    /**
     * Filters out empty strings from the list using Predicate.not
     *
     * @param strings the list of strings to filter
     *
     * @return a new list containing only non-empty strings
     */
    static List<String> filterNonEmptyStrings(List<String> strings)
    {
        // Define a predicate to check if  a string is empty
        Predicate<String> isEmpty = String::isEmpty;

        //Use Predicate.not to negate the isEmpty predicate, keeping only non-empty strings
        return strings.stream()
                .filter(Predicate.not(isEmpty)) // Equivalent to : s -> !s.isEmpty()
                .collect(Collectors.toList());
    }
    
    public static void main(String[] args)
    {
        // Sample list of strings, with some empty strings
        List<String> words = List.of("melon", "","avocado","banana","","grapes","apple");
        
        System.out.println("Original list of strings(fruits)");
        System.out.println(words);
        
        // Filter out empty strings using Predicate.not
        List<String> nonEmptyWords = filterNonEmptyStrings(words);
        
        System.out.println("\nList of words after filtering out empty strings:");
        System.out.println(nonEmptyWords);
    }
}
