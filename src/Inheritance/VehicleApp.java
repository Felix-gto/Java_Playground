package Inheritance;

public class VehicleApp {

    public static void main(String[] args) {
        //Create object of the Car which extends the Abstract_Vehicle Class
        Car car = new Car();
        car.drive();
        //Have access to setID() / getID of Abstract_Vehicle since Car extends it
        car.setID(1);
        System.out.println("The ID of the car is: " + car.getID());

        //Create object of the Motorcycle which extends the Abstract_Vehicle Class
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.drive();
        //Have access to setID() / getID of Abstract_Vehicle since Car extends it
        motorcycle.setID(2);
        System.out.println("The ID of the motorcycle is: " + motorcycle.getID());
    }
}
