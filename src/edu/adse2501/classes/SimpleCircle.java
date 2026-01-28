package edu.adse2501.classes;

/**
 *
 * @author a.nyanjui
 */
public class SimpleCircle
{

    protected float radius;

    public SimpleCircle()
    {
    }

    public SimpleCircle(float radius)
    {
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public float getRadius()
    {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public float calcArea()
    {
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    /**
     * Method to calculate the circumference of the circle.
     *
     * @return circumference of the circle as a float.
     */
    public float calcCircumference()
    {
        return (float) (Math.PI * (this.radius * 2));
    }

    @Override
    public String toString()
    {
        return "SimpleCircle {" + "radius = " + this.radius + "}";
    }
}
