package Basics;

public class Methods_Basics {
    public static void main(String[] args) {
        //sayHello()
        System.out.println("\nMETHOD - Calling a basic method");
        sayHello("Felix", 36);
        sayHello("Alina", 35);

        // returnMax
        System.out.println("\nMETHOD - Return a max number");
        int maxNumber = returnMax(10, 25); // Capture function return value (int) in a variable
        System.out.println("The highest number is: " + maxNumber);
    }

    public static void sayHello(String name, int age) {
        System.out.println("Hello " + name + "! Your age is: " + age );
    }

    public static int returnMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
