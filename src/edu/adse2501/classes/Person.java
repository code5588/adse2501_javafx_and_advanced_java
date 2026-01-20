package edu.adse2501.classes;

import java.time.LocalDate;

/**
 * The abstract class {@code Person} represents a person with common 
 * attributes or properties such as names, birthdate, gender (binary) and 
 * nationality. It provides a basic structure for its subclasses and includes 
 * getters & setters for these attributes. 
 * The class also defines an abstract method {@code getPersonRole) that must be
 * implemented by any concrete class.
 * 
 * <p>This class can be extended by other classes that represent more specific 
 * types of persons or people (e.g. Student, Employee) by providing additional
 * attributes or behaviours.
 * </p> 
 * 
 * @author a.nyanjui
 */
public abstract class Person
{
    /**
     * The person's full name(s)
     */
    protected String names;
    
    /**
     * The person's date of birth represented as a {@code LocalDate}
     */
    protected LocalDate birthDate;
    
    /**
     * The person's gender, represented as a character (e.g. 'M' for male, and
     * 'F' for female).
     */
    protected char gender;
    
    /** 
     * The person's nationality. 
     */
    protected String nationality;

    /** 
     * Default constructor for the {@code Person} class.
     * <p>Initialises the object with no specific values for the fields. This
     * constructor can be used for subclasses that will set values later using
     * the setters.
     * </p>
     */
    public Person(){}

    /**
     * Parameterised constructor for the {@code Person} class.
     * 
     * @param names the person's full name
     * @param birthDate the person's date of birth as a {@code LocalDate}
     * @param gender the person's binary gender represented as a char
     * @param nationality the person's nationality
     */
    public Person(String names, LocalDate birthDate, char gender, String nationality)
    {
        this.names = names;
        this.birthDate = birthDate;
        this.gender = gender;
        this.nationality = nationality;
    }
    

    /**
     * Retrieves the person's full name(s)
     * 
     * @return the person's full name(s)
     */
    public String getNames()
    {
        return names;
    }

    /**
     * Sets the person's name
     * 
     * @param names the full names of the person
     */
    public void setNames(String names)
    {
        this.names = names;
    }    

    /**
     * Retrieves the person's full date of birth
     * 
     * @return the person's date of birth as a {@code LocalDate}
     */
    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    /**
     * Sets the person's date of birth
     * 
     * @param LocalDate set the person's birthdate as a {@code LocalDate}
     */
    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    /**
     * Retrieves the person's gender
     * 
     * @return the person's gender as a char
     */
    public char getGender()
    {
        return gender;
    }

    /**
     * Sets the person's gender
     * 
     * @param gender set the person's gender as a character ('M':male,'F':female)
     */
    public void setGender(char gender)
    {
        this.gender = gender;
    }
    
    /**
     * Retrieves the person's nationality
     * 
     * @return the person's nationality as a string
     */
    public String getNationality()
    {
        return nationality;
    }

    /**
     * Sets the person's nationality
     * 
     * @param nationality set the nationality of the person as a string
     */
    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }
    
    /**
     * Returns the role of the person (e.g. "Student", "Employee","Customer").
     * Each subclass must provide its own role.
     * 
     * @return the role of the person as a String.
     */
    public abstract String getPersonRole();

    /**
     * Returns a formatted string representation of the person's details.
     * 
     * @return the person's details. 
     */
    @Override
    public String toString()
    {
        return String.format("""
                             Role: %s
                             Name(s): %s
                             Birth Date: %s
                             Gender%s
                             Nationality""",
                getPersonRole(),
                getNames(),
                birthDate,
                getGender() == 'm' || getGender() == 'M' ? "Male":"Female",
                nationality
        );
    }
    
    
}
