package Basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingWithExceptions {

    public static void main(String[] args) {
        createFile("fileTestExample");
        writeToFile("fileTestExample","The quick brown fox jumps over the lazy dog.");
        System.out.println(readFromFile("fileTestExample"));
    }

    // CREATE A FILE
    public static boolean createFile(String fileName) {
        try {
            // Attempt to create new file using File class
            File file = new File(fileName);
            // Returns "true" if the file is successfully created
            if (file.exists()) {
                System.out.println("File already exists");
            }
            return file.createNewFile();

            // Return "false" and catch exception if the file is not successfully created
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file");
            e.printStackTrace();
            return false;
        }
    }

    // WRITE TO A FILE
    public static boolean writeToFile(String fileName, String content) {
        try {
            // Returns "true" if the writing operation succeeds
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            return true;

            // Return "false" and catch exception if the writing is not successfully done
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file");
            e.printStackTrace();
            return false;
        }
    }

    // READ CONTENT OF FILE AND RETURN AS STRING
    public static String readFromFile(String fileName) {
        File file = new File(fileName);
        // Return empty string if file doesn't exist
        if (!file.exists()) {
            return "";
        }

        // If file exists create a Scanner object to read the file line by line.
        try {
            Scanner scanner = new Scanner(file);
            String content = "";
            while (scanner.hasNextLine()) {
                content += scanner.nextLine();
            }
            scanner.close();
            return content;

            // Return "" and catch exception if the reading is not successfully done
        } catch (IOException e) {
            System.out.println("Ann error occurred while reading the file");
            e.printStackTrace();
            return "";
        }
    }
}
