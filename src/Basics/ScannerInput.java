package Basics;
import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        // Create the Scanner object
        Scanner myScanner = new Scanner(System.in);

        // Input a String
        System.out.println("What is your name?");

        String nameInput = myScanner.nextLine();
        System.out.println("Hello, " + nameInput);

        // Input an integer
        System.out.println("How old are you?");

        int ageInput = myScanner.nextInt();
        System.out.println(nameInput + " is " + ageInput + " years old");
    }
}
