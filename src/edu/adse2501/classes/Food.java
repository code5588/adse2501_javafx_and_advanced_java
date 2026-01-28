package edu.adse2501.classes;

import java.time.LocalDate;

/**
 *
 * @author a.nyanjui
 */
public class Food
{
    protected String name;
    protected LocalDate expirationDate;

    public Food(String name, LocalDate expirationDate)
    {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the expirationDate
     */
    public LocalDate getExpirationDate()
    {
        return expirationDate;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(LocalDate expirationDate)
    {
        this.expirationDate = expirationDate;
    }
    
    @Override
    public String toString()
    {
        return String.format("""
                             Food Details
                             -------------------------------------------
                             Name: %s
                             Expiration Date: %s
                             -------------------------------------------
                             """, this.getName(),this.getExpirationDate());
    }
    
    
}
