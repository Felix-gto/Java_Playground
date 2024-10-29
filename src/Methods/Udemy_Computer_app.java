package Methods;

public class Udemy_Computer_app {

    public static void main(String[] args) {
        // Create new object of the Udemy_Computer class
        Udemy_Computer udemyComputer1 = new Udemy_Computer();

        udemyComputer1.RAM = 8;
        udemyComputer1.GPU = "Nvidia";
        udemyComputer1.hardDisk = "WD";
        udemyComputer1.motherboard = "Intel motherboard";
        udemyComputer1.brand = "Asus";

        //Print computer brand (Access class property value we assigned
        System.out.println("The computer is produced by " + udemyComputer1.brand + ".");

        // Runs showInfo() method from Udemy_Computer.java
        udemyComputer1.showInfo();

        // Runs showGPU() method from Udemy_Computer.java - returns string -> we then print out that string (Result)
        String result = udemyComputer1.showGPU();
        System.out.println(result);
    }

}
