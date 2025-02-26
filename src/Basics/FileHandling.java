package Basics;

import java.io.File; // Import File class

import java.io.FileNotFoundException; // "throws FileNotFoundException" added to psvm if we only read file using scanner
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        // Create object of type File - Relative or absolute path (path only file name since it's in the root folder)
        File myFile = new File("fileExample");

        // Read the file - using Scanner & while loop
        Scanner scanner = new Scanner(myFile);

        // FileWriter - adds "throws IOException" in the psvm (more complete than FileNotFoundException)
        FileWriter fileWriter = new FileWriter("fileExample");
        fileWriter.write("The quick brown fox jumps over the lazy dog.");

        // Add after fileWriter.write before outputting the content of the file (otherwise file basically is in use)
        fileWriter.flush();
        fileWriter.close();

        // .hasNext() returns a boolean - true if we have something to read
        while (scanner.hasNext()) {
            // scanner.next() returns a string - content of the file, each word listed on separate lines
            System.out.println(scanner.next());
        }
    }
}
