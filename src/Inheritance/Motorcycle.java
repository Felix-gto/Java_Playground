package Inheritance;

public class Motorcycle extends Abstract_Vehicle {
    //Mandatory - Implement Abstract Method from the inherited Abstract_Vehicle class which this class extends
    @Override
    public void drive() {
        System.out.println("The motorcycle is being driven");
    }
}