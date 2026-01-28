package edu.adse2501.classes;

/**
 *
 * @author a.nyanjui
 */
public class Drink
{
    protected String name;
    protected float volume;

    public Drink()
    {
        this.name ="";
        this.volume = 0.0f;
    }

    public Drink(String name, float volume)
    {
        this.name = name;
        this.volume = volume;
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
     * @return the volume
     */
    public float getVolume()
    {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(float volume)
    {
        this.volume = volume;
    }

    @Override
    public String toString()
    {
        return String.format("""
                             Drink Details
                             -------------------------------------------
                             Name: %s
                             Volume in Litres: %.2f
                             -------------------------------------------
                             """, this.getName(),this.getVolume());
    }
    
    
    
}
