package edu.adse2501.sess03_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

/**
 * Java program that prompts the user for a string, writes it to a file, then
 * reads & displays the contents of the file using methods of the java.nio
 * classes.
 * 
 * 
 * @author a.nyanjui
 */
public class NIOWrite2File
{
    // Create a path reference to the file to be written to ('nioreadwrite.txt')
    private static final Path readWriteFile = Paths.get("src/edu/files/"
            + "nioreadwrite.txt");
    
    public static void main(String[] args)
    {
        
        // Debug tip to get the absolute path to the readWriteFile
//            System.out.println("Path to the file:\n"
//                    + readWriteFile.toAbsolutePath());
        // Use a try...with resources to autoclose resources
        try(Scanner sc = new Scanner(System.in).useDelimiter("\n"))
        {
            // Prompt the user for a string to be written to the nioreadwrite file
            System.out.println("Please enter a message/some text to be "
                    + "written to the file ->");
            String appendString = System.lineSeparator() + sc.nextLine();
            
            // Append the contents to the file
            Files.write(readWriteFile, appendString.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            System.out.println("Contents written to the file.");
            
            // Read and display the contents from the file
            List<String> fileContents = Files.readAllLines(readWriteFile);
            fileContents.forEach((fileContent) ->
            {
                System.out.println(fileContent);
            });
        }catch(IOException ioe)
        {
            System.err.println("The error " + ioe.getLocalizedMessage() + " occurred!");
        }
    }
}
