package Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    public static void main(String[] args) {

        // Example of runtime exception
        String[] arrayOfStrings = {"Felix","Alina","Luna"};
        try {
            System.out.println("Code before exception");
            // Exception thrown since we try to print 4th array element (we only have 3) - ArrayIndexOutOfBoundsException
            System.out.println(arrayOfStrings[3]);
            // Code not executed
            System.out.println("Code after exception");
        } catch (Exception e) {
            // Code only run when exception is thrown - would not run if we print arrayOfStrings[2]
            System.out.println("Exception caught");
            // Optional -> Print exception errors:
            // e.printStackTrace();
            // throw new RuntimeException(e);

        } finally {
            System.out.println("Finally -> Code runs regardless of result");
        }

        System.out.println("Additional line outside of the try...catch...finally block");

        // Example of checked exception
        File file = new File("C:\\randomName.txt");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught for FileReader");
        }
    }
}
