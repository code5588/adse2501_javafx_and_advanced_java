package edu.adse2501.sess02_generics;

import edu.adse2501.classes.Fruit;
import java.time.LocalDate;

/**
 *
 * @author a.nyanjui
 */
public class GenericClassInheritanceDemo
{
    // main method begins program execution
    public static void main(String[] args)
    {
        // Create a Fruit object
        Fruit orange = new Fruit("Sweet", 150.0f, "Orange",
                LocalDate.now().plusDays(7));
        
        // Create an orange fruit container
        FoodContainer<Fruit> orangeContainer = new FoodContainer<>(orange);
        
        // Call/invoke the methods from the 'Container' and 'FoodContainer' clases.
        orangeContainer.displayItemInfo(); // Display the fruit's details
        orangeContainer.displayExpirationDate(); // Display the fruit's exp. date
        
        // TODO
        // 1. Create a Drink object (your favourite juice/soda)
        // 2. Create a Juice container
        // 3. Invoke the methods from the 'Container' and 'DrinkContainer classes.
    }
}
