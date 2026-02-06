package edu.adse2501.sess03_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

/**
 * Java program to demonstrate how to read file contents using the methods of
 * the java.io.FileReader class.
 *
 *
 * @author a.nyanjui
 */
public class ReadFile_FileReader
{

    // URL to hold the relative path to the file 'read_files.txt'
    protected URL url2File = this.getClass().
            getResource("../../files/read_files.txt");

    public static void main(String[] args)
    {
        // Use a try with resources to automatically close all open handles later
        try (FileReader freader = new FileReader(new File(
                new ReadFile_FileReader().url2File.getPath())))
        {
            int n;
            while ((n = freader.read()) != -1)
            {
                // Display the contents of the file
                System.out.print((char) n);
            }
        } catch (FileNotFoundException fne)
        {
            System.err.println("""
                               Sorry the file was not found.
                               Please check for typos and ensure you have permissions to access the file & try again.""");
        } catch (Exception e)
        {
            System.err.println("The error: " + e.getLocalizedMessage()
                    + " occurred!");
        }

    }
}
