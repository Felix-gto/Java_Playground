package Basics;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {12, 50, 60, 100, 200, 20, 50};

        //Using for-each
        System.out.println("\n" + "Using for-each:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Using For loop
        System.out.println("\n" + "Using For Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The number with index " + i + " is: " + numbers[i]);
        }

        // Define array and assign values
        System.out.println("\nDefining array and assigning values (see code)");
        int[] numbersArray = new int[5];
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;
        numbersArray[3] = 40;
        numbersArray[4] = 50;

        //Challenge - Run getHighestNumber Method
        System.out.println("\n" + "Get Highest Number: Pass an array as a parameter to a method and get the highest number:");
        int[] arrayOfNumbersPassed = {0, 10, 25, 40, 77, 150};
        int maxFound = getHighestNumber(arrayOfNumbersPassed);
        System.out.println("The highest number from the arrayOfNumbersPassed[] is: " + maxFound);
    }

    //Method that receives an array as a parameter and returns the biggest number
    public static int getHighestNumber(int[] arrayOfNumbers) {
        int max = arrayOfNumbers[0];
        for (int number : arrayOfNumbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
}
