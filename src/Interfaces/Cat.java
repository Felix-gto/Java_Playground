package Interfaces;

public class Cat implements InterfaceExample {

    public void showCatInfo() {
        String breed = "European";
        String color = "black";
        String name = "Luna";
        System.out.println(name + " is a " + breed + " cat, it's color is " + color + " .");
    }
}
