package Basics;

class Person {
    private String name; // Private variable (hidden from outside)

    // Public method to set the name (write access)
    public void setName(String newName) {
        name = newName;
    }

    // Public method to get the name (read access)
    public String getName() {
        return name;
    }
}

public class Encapsulation_Example_Get_Set {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");  // Setting the name
        System.out.println(person.getName()); // Getting the name → Output: Alice
    }
}
