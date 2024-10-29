package Methods;

// Udemy Course - Automation Masterclass (2.19 - Methods)
public class Udemy_Computer {
    int RAM;
    String GPU;
    String hardDisk;
    String motherboard;
    String brand;


    void showInfo() {
        System.out.println("This computer has " + RAM + " GB of RAM, a " + GPU + " GPU" + " and a " + hardDisk + " hard disk.");
    }

    String showGPU() {
        return "This computer has a " + GPU + " GPU.";
    }
}
