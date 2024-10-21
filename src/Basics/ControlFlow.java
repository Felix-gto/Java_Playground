package Basics;

public class ControlFlow {
    public static void main (String[] args) {

        //IF Statement
        System.out.println("IF Statement:");
        boolean isActive = true;
        if (isActive) {
            System.out.println("The user is active");
        }
        //Runs if isActive is false
        if(!isActive) {
            System.out.println("The user is not active");
        }

        // IF-ELSE statement
        System.out.println("\nIF-ELSE Statement:");
        int number = 10;

        if (number == 10) {
            System.out.println("The number is 10 \nYou are correct");
        } else {
            System.out.println("The number is not 10");
        }

        //ELSE-IF statement
        System.out.println("\nELSE-IF:");
        int age = 12;

        if (age > 14 && age < 18) {
            System.out.println("You are " + age + " years old and have and ID, but cannot vote yet");
        } else if (age <14) {
            System.out.println("You are under 14 and don't have an ID");
        } else {
            System.out.println("You are old enough to vote");
        }

        //Nested Ifs
        System.out.println("\nNESTED Ifs:");
        int yearOfBirth = 1956;
        if(yearOfBirth == 1987) {
            System.out.println("You are born in 1987");
        } else {
            if(yearOfBirth < 1987) {
                System.out.println("You are born before the year 1987");
            } else {
                System.out.println("You are born after the year 1987");
            }
        }

        //SWITCH
        System.out.println("\nSWITCH:");
        int time = 10;

        switch(time) {
            case 10:
                System.out.println("The time is " + time + ". Time for a coffee");
                break;
            case 7:
                System.out.println("The time is " + time + ". Time for a run");
                break;
            default:
                System.out.println("Time to relax.");
                break;
        }

    }
}

