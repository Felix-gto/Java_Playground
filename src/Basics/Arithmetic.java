package Basics;

public class Arithmetic {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        //Addition
        System.out.println("\nADDITION");
        System.out.println(num1 + num2);

        //Subtraction
        System.out.println("\nSUBTRACTION");
        System.out.println(num1 - num2);

        //Multiplication
        System.out.println("\nMULTIPLICATION");
        System.out.println(num1 * num2);

        //Division
        System.out.println("\nDIVISION");
        System.out.println(num1 / num2);

        //Modulo
        System.out.println("\nMODULO");
        System.out.println(num1 % num2);

        //Using Parenthesis
        System.out.println("\nPARENTHESIS");
        System.out.println(num1 + num2 * 4);   // Returns 18
        System.out.println((num1 + num2) * 4);   // Returns 48

        //Increment, decrement, equals
        System.out.println("\nINCREMENT, DECREMENT, EQUALS");
        int myNumber = 1;
        myNumber++;
        System.out.println(myNumber);   // Returns 2

        myNumber--;
        System.out.println(myNumber); // Returns 1

        myNumber += 5;
        System.out.println(myNumber);   // Returns 6

        System.out.println("Prefix decrementation: " + --myNumber);   // Returns 5
    }
}
