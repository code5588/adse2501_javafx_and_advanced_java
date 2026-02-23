package edu.adse2501.sess08_design_patterns_and_other_features;

/**
 * Java program that demonstrates delegation using a DocumentPrinter that 
 * delegates printing work to specific PrintService implementations
 * @author a.nyanjui
 */
public class DelegationDemo
{
    public static void main(String[] args)
    {
        // Declare and instantiate a DocumentPrinter object
        DocumentPrinter printer = new DocumentPrinter();
        
        // Print a PDF Document
        printer.printDocument("These are the contents of the PDF document.", "PDF");        
        
        // Print a Text Docuement
        printer.printDocument("These are the contents of the Text document.", "Text");
        
    }
}


/**
 * DocumentPrinter class delegates printing responsibilities to the apt
 * PrintService based on the document type.
 * 
 * @author a.nyanjui
 */
class DocumentPrinter
{
    private final PDFPrinter pdfPrinter;
    private final TextPrinter textPrinter;
    
    /**
     * Constructor that initialises the specific PrintService implementations
     */
    public DocumentPrinter()
    {
        this.pdfPrinter = new PDFPrinter();
        this.textPrinter = new TextPrinter();
    }
    
    /**
     * Prints the document by delegating the printing work to the appropriate
     * service (pdf or text printer service).
     * 
     * @param content The content(s) of the document to be printed
     * @param type The type of document to be printed
     */
    public void printDocument(String content, String type)
    {
        if("pdf".equalsIgnoreCase(type))
            pdfPrinter.print(content);
        else if("text".equalsIgnoreCase(type))
            textPrinter.print(content);
        else
            System.err.println("Sorry, you gave us an unsupported type: " + type);
    }
}

/**
 * PrintService interface defines the print operation (print() method).
 * 
 */
interface PrintService
{
    void print(String document);
}

/**
 * PDFPrinter class is a specific implementation of the PrintService interface
 * for PDF Documents. 
 */
class PDFPrinter implements PrintService
{
    @Override
    public void print(String content)
    {
        System.out.println("Printing PDF Document: " + content);
    }
}

/**
 * TextPrinter class is a specific implementation of the PrintService interface
 * for Text Documents. 
 */
class TextPrinter implements PrintService
{
    @Override
    public void print(String content)
    {
        System.out.println("Printing Text Document: " + content);
    }
}