package Basics;

import java.util.Scanner;

// INTERFACE
interface Event {
    String message = "An event has been triggered!";
    // Interface Method
    void printMessage();
}

public class InnerClasses_Anonymous {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter an integer: ");
        int number = scanner.nextInt();

        if(number == 1) {
            // ANONYMOUS INNER CLASS = Instantiate the Interface (Create an object of the Interface)
            Event event = new Event() {
                // Provide implementation for the Interface method
                @Override
                public void printMessage() {
                    System.out.println(message);
                }
            };
            // Run the method of the anonymous inner class
            event.printMessage();
        } else {
            System.out.println("To trigger an event, please run again and input 1");
        }
    }
}