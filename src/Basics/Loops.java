package Basics;

public class Loops {
    public static void main(String[] args) {
        //FOR Loop
        System.out.println("\nFOR loop (increment):");
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\nFOR loop (increment) with if statement - stop (break):");
        for (int i = 0; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nFOR loop (decrement) with if statement - skip (continue):");
        for (int i = 10; i >= 0; i--) {
            if (i <= 6 && i >= 3) {
                continue;
            }
            System.out.println("i = " + i);
        }

        //WHILE Loop
        System.out.println("\nWHILE loop:");
        int number = 0;
        while (number <= 10) {
            System.out.println("Number is: " + number);
            number++; // If we don't increment the number it runs an infinite loop
        }

        //DO WHILE Loop
        System.out.println("\nDO WHILE loop (condition false):");
        int number2 = 0;
        do {
            System.out.println("Number2 is: " + number2);
        } while (number2 >=1);

        System.out.println("\nDO WHILE loop (condition true):");
        int number3 = 0;
        do {
            System.out.println("Number3 is: " + number3);
            number3++;
        } while (number3 <=5);
    }
}
