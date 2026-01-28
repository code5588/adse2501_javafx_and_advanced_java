package edu.adse2501.sess02_generics;

import edu.adse2501.classes.Drink;

/**
 * Specialised generic class {@code DrinkContainer} that only holds items 
 * of type T which extend the Drink class.
 *
 * @param <T> a subclass of the {@code Drink} class
 * @author a.nyanjui
 */
public class DrinkContainer<T extends Drink> extends Container<T>
{

    public DrinkContainer(T drinkItem)
    {
        super(drinkItem);
    }
    
    // Method to display drink-specific information
    public void displayVolume()
    {
        System.out.println(item.getName() + " comes in a volume of " 
                + item.getVolume() + " litres.");
    }
    
}
