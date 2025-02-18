package Collections_Examples;

import java.util.*;

public class Sets_Examples {
    public static void main(String[] args) {

        //HASHSET
        Set<String> hashSetExample = new HashSet<>();
        // Performance is the best for this set
        // Random order

        hashSetExample.add("Felix");
        System.out.println("hashSetExample contains: " + hashSetExample);

        //LINKED HASHSET
        Set<Integer> linkedHashSetExample3 = new LinkedHashSet<>();
        // Faster than TreeSet and slower than HashSet
        // Order of insertion maintained
        linkedHashSetExample3.add(1987);

        System.out.println("linkedHashSetExample3 contains the following integers: " + linkedHashSetExample3);

        //TREE SET
        Set<String> treeSetExample2 = new TreeSet<>();
        // Slowest set for adding and retrieving data
        // Sorted order (all data is sorted)

        treeSetExample2.add("Daraban");
        System.out.println("treeSetExample2 contains: " + treeSetExample2);

        // !!! SET OPERATIONS !!!

        // Set of Integers setA - Add some values
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);

        // Add array of integers to existing setA
        Integer[] integerArray = {3,4,5};
        Collections.addAll(setA, integerArray);
        System.out.println("setA now contains: " + setA);

        // Set of Integers setB - Add some values
        Set<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);

        System.out.println("setB contains: " + setB);

        // UNION
        Set<Integer> unionOfSets = new HashSet<>(setA);
        unionOfSets.addAll(setB);
        System.out.println("The union of setA and setB is: " + unionOfSets);

        //INTERSECTION
        Set<Integer> intersectionOfSets = new HashSet<>(setA);
        intersectionOfSets.retainAll(setB);
        System.out.println("The intersection between setA and setB is: " + intersectionOfSets);

        //DIFFERENCE
        Set<Integer> differenceBetweenSets = new HashSet<>(setA);
        differenceBetweenSets.removeAll(setB);
        System.out.println("The difference between setA and setB is: " + differenceBetweenSets);
    }
}
