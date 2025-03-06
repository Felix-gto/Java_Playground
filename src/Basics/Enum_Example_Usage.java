package Basics;

public class Enum_Example_Usage {

    // ENUM inside a Class 1
    public enum EnumInsideClass {
        MAN,
        WOMAN,
        CHILD
    }

    // ENUM inside a Class 2
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        // Using a separate ENUM file: Enum_Example_Pets
        System.out.println("My pet is a: " + Enum_Example_Pets.CAT);

        // Using ENUM from this class
        System.out.println("I am a: " + EnumInsideClass.MAN);


        // Using ENUM from this class - Using switch statement to check for corresponding values
        System.out.println("Using switch statement to check for corresponding values:");

        Level myVar = Level.MEDIUM;
        switch (myVar) {
            case LOW:
                System.out.println("My level is: Low level");
                break;
            case MEDIUM:
                System.out.println("My level is: Medium level");
                break;
            case HIGH:
                System.out.println("My level is: High level");
                break;
        }

        // Using FOR Each Loop to print Enum values
        System.out.println("Using FOR Each loop to print Enum values:");

        for (Enum_Example_Pets enumExamplePets : Enum_Example_Pets.values()) {
            System.out.println(enumExamplePets);
        }
    }

}
