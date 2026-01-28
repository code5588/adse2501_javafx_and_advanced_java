package edu.adse2501.sess02_generics;

/**
 * Generic base class {@code Container} that can hold items of different 
 * types. 
 * 
 * @param <T> the type of item/contents held by this class.
 * @author a.nyanjui
 */
public class Container<T>
{
    protected T item;

    public Container(T varT)
    {
        this.item = varT;
    }

    /**
     * @return the item
     */
    public T getVarT()
    {
        return item;
    }
    
    public void displayItemInfo()
    {
        System.out.println("Item: " + item.toString());
    }
    
    
}
