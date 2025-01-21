package Inheritance;

//Abstract Class
public abstract class Abstract_Vehicle {

    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // Abstract method - does not have a body {}. The body is provided by the subclass (Car, Motorcycle).
    public abstract void drive();
}
