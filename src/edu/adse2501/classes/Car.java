package edu.adse2501.classes;

import java.io.Serializable;

/**
 *
 * @author a.nyanjui
 */
public class Car implements Serializable
{
    private static final long serialVersionUID = 1L; // Used for serialisable classes
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /**
     * @return the make
     */
    public String getMake()
    {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make)
    {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel()
    {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model)
    {
        this.model = model;
    }

    /**
     * @return the year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return String.format("""
                             Car Details
                             -------------------------------------------------
                             Make :     %s
                             Model:     %s
                             Year :     %d
                             -------------------------------------------------
                             """, this.getMake(), this.getModel(),this.getYear());
    }
    
    
    
}
