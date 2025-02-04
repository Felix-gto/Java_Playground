package Collections_Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists_Practice {
    public static void main(String[] args) {

        // Standard Array
        String[] cars = {"Volvo", "BMW", "Honda"};

        //ArrayList - can be manipulated
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        Collections.addAll(animals, "Dog", "Mouse", "Horse");
        System.out.println("The animals[] array contains the following animals: " + animals);

    }
}
