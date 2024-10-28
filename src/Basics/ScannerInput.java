package Basics;
import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String nameInput = myScanner.nextLine();
        System.out.println("Hello, " + nameInput);

    }
}
