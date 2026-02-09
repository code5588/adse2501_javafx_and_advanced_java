package edu.adse2501.sess03_files;

import edu.adse2501.classes.Car;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Java program to demonstrate serialisation and deserialisation.
 * 
 * @author a.nyanjui
 */
public class SerialisationDemo
{
    // Class/static method to serialise a Car object/instance to a file
    public static void serialiseCar(Car car, String fileName)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(fileName)))
        {
            oos.writeObject(car);
            System.out.println("Successfully serialised " + car);
        }catch(IOException ioe)
        {
            System.err.println("Serialisation failed due to:\n"
                    + ioe.getLocalizedMessage());
        }
    }
    
    // Class/static method to deserialise a Car object/instance from a file
    public static Car deserialiseCar(String fileName)
    {
        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileName)))
        {
            return (Car)ois.readObject();
        }catch(IOException | ClassNotFoundException e)
        {
            System.err.println("Deserialisation failed due to:\n" 
                    + e.getLocalizedMessage());
            return null;
        }
    }
    
    public static void main(String[] args)
    {
        // Declare and instantiate a Car object
        Car myCar = new Car("Lexus","NX",2025);
        
        // Call/invoke the serialiseCar method to serialise the car details to file
        String fileName = "car.txt";
        serialiseCar(myCar, fileName);
        
        // Call/invoke the deserialiseCar method to deserialise the car details from the file
        Car deserialisedCar = deserialiseCar(fileName);
        
        // Display the car details when the car object is not null
        if(deserialisedCar != null)
        {
            System.out.println("Deserialisation successful and car details "
                    + "displayed below.\n" + deserialisedCar);
        }
    }
}
