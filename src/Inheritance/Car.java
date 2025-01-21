package Inheritance;

public class Car extends Abstract_Vehicle{
    //Mandatory - Implement Abstract Method from the inherited Abstract_Vehicle class which this class extends
    @Override
    public void drive() {
        System.out.println("The car is being driven");
    }
}
