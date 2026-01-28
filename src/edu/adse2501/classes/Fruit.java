package edu.adse2501.classes;

import java.time.LocalDate;

/**
 *
 * @author a.nyanjui
 */
public class Fruit extends Food
{
    protected String taste;
    protected float weight;

    public Fruit(String taste, float weight, String name, LocalDate expirationDate)
    {
        super(name, expirationDate);
        this.taste = taste;
        this.weight = weight;
    }

    /**
     * @return the taste
     */
    public String getTaste()
    {
        return taste;
    }

    /**
     * @param taste the taste to set
     */
    public void setTaste(String taste)
    {
        this.taste = taste;
    }

    /**
     * @return the weight
     */
    public float getWeight()
    {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight)
    {
        this.weight = weight;
    }
    
    @Override
    public String toString()
    {
        return String.format("""
                             Fruit Details
                             -------------------------------------------
                             %s
                             Taste: %s
                             Weight in grams: %.2f
                             -------------------------------------------
                             """,super.toString(), this.getTaste(),this.getWeight());
    }
}
