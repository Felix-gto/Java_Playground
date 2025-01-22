package Polymorphism;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal pig = new Pig();
        animal.animalSound();
        dog.animalSound();
        pig.animalSound();
    }
}