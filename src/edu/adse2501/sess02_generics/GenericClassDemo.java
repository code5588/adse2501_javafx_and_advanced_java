package edu.adse2501.sess02_generics;

import edu.adse2501.classes.SimpleCircle;
import java.util.Scanner;

/**
 * Java program to demonstrate working with custom generic classes.
 * 
 * @author a.nyanjui
 */
public class GenericClassDemo
{
    // main method begins program execution
    public static void main(String[] args)
    {
        // Declare generic objects
        GenericClass<String> genString = new GenericClass<>("Hello!");
        GenericClass<Byte> genByte;
        GenericClass<Float> genFloat = new GenericClass<>(56.78f);
        GenericClass<SimpleCircle> genCircle;
        
        // Instantiate the genericByte and genericSimpleCircle objects
        genByte = new GenericClass<>((byte)32);
        
        // Prompt the user for the radius of the circle
        System.out.println("Please enter the radius of the circle in cm. ->");
        float rad = new Scanner(System.in).nextFloat();
        genCircle = new GenericClass<>(new SimpleCircle(rad));
        
        // Display the contents and types of the various generic objects 
        // created/instantiated above
        System.out.println("genString's type is -> " +genString.showType() + 
                " and its value is: " + genString.getVarT());
        System.out.println("genByte's type is -> " +genByte.showType() + 
                " and its value is: " + genByte.getVarT());
        System.out.println("genFloat's type is -> " +genFloat.showType() + 
                " and its value is: " + genFloat.getVarT());
        System.out.println("genCircle's type is -> " +genCircle.showType() + 
                " and its radius is: " + genCircle.getVarT().getRadius() + " cm.");
        
        // TODO: modify lines 38 & 39 to display the generic circle's 
        // 1. radius
        // 2. area
        // 3. circumference
        // 4. its type
    }
}
