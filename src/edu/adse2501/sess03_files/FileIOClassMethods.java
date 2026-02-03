package edu.adse2501.sess03_files;

import java.io.File;
import java.net.URL;

/**
 * Java program that demonstrates the various methods of the java.io File class.
 *
 * @author a.nyanjui
 */
public class FileIOClassMethods
{

    // URL to hold the relative path to the file 'read_files.txt'
    protected URL url2File = this.getClass().
            getResource("../../files/read_files.txt");

    public static void main(String[] args)
    {
        // Declare a file object
        File readFile = null;

        //Read in the file contents within a try...catch block
        try
        {
            readFile = new File(new FileIOClassMethods().url2File.getPath());
            // Display some properties of the readFile object
            System.out.println("Properties of the " + readFile.getName()
                    + " file."
                    + "\n----------------------------------------------"
                    + "\nIf the file exists/has been found: " + readFile.exists()
                    + "\nPath to the file: " + readFile.getAbsolutePath()
                    + "\nName of the file: " + readFile.getName()
                    + "\nLength of the file in bytes: " + readFile.length()
                    + "\nWhether it's a file: " + readFile.isFile()
                    + "\nWhether it's a folder/directory: " + readFile.isDirectory()
                    + "\n----------------------------------------------");
        } catch (Exception e)
        {
            System.err.println("The error: " + e.getLocalizedMessage() +
                    " occurred!");
        }
    }
}
