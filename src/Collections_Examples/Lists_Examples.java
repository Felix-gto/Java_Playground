package Collections_Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists_Examples {
    public static void main(String[] args) {

        // Standard Array
        String[] cars = {"Volvo", "BMW", "Honda"};

        for (String car : cars) {
            System.out.println(car);
        }

        //ArrayList - can be manipulated
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        Collections.addAll(animals, "Dog", "Mouse", "Horse");
        System.out.println("The animals[] array contains the following animals: " + animals);

    }
}
