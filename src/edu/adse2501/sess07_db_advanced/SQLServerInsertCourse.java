package edu.adse2501.sess07_db_advanced;

import edu.adse2501.db_connection.SQLServerOpenConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Java program to insert a new course to the course table in the College 
 * database.
 * 
 * @author a.nyanjui
 */
public class SQLServerInsertCourse
{
    // Private class constant string holding the SQL query to be sent to the database
    // for execution
    private static final String COURSE_QUERY = "Select * from Course";
    private static final Scanner USER_INPUT = new Scanner(System.in).useDelimiter("\n");
    
    // Method to get course values from the user
    public static String[] getCourseDetails()
    {
        String courseValues[] = new String[4];
        // Read in the course code
        System.out.println("Please enter the course code ->");
        courseValues[0] = USER_INPUT.next();
        // Read in the course name
        System.out.println("Please enter the course name/title ->");
        courseValues[1] = USER_INPUT.next();
        // Read in the course fee
        System.out.println("Please enter the course fee in Kes. ->");
        courseValues[2] = USER_INPUT.next();
        // Read in the course duration
        System.out.println("Please enter the course duration in months ->");
        courseValues[3] = USER_INPUT.next();
        // close the input stream
        USER_INPUT.close();
        return courseValues;
    }
    
    public static void main(String[] args)
    {
        // String array to hold the values to be inserted in the course table
        String userValues[] = getCourseDetails();
        
        // Use a try...with resources to connect to the database
        try(Connection conn = new SQLServerOpenConnection().createConnection();
                Statement stmt = conn.createStatement(
                        ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery(COURSE_QUERY))
        {
            // Move to the last row/record/insert row to add a new record
            rs.moveToInsertRow();
            // Add the user's course details to the resultset
            rs.updateString(1, userValues[0]);
            rs.updateString(2, userValues[1]);
            rs.updateFloat(3, Float.parseFloat(userValues[2]));
            rs.updateInt(4, Integer.parseInt(userValues[3]));
            
            // Insert the row in the course table
            rs.insertRow();
            
            // Inform the user the row's been succesfully added to the course table
            System.out.println("The course " + userValues[1] + " has been "
                    + "successfully added to the list of courses.");
        }catch (NumberFormatException nfe)
        {
            System.err.println("Sorry, the values entered in the fee or "
                    + "duration fields are invalid.\nPlease enter valid numbers "
                    + "for fee and/or duration.");
        }catch(SQLException sqle)
        {
            sqle.printStackTrace();
        }
        
    }
}
