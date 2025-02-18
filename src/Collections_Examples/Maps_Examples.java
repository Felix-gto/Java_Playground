package Collections_Examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps_Examples {

    public static void main(String[] args) {

        // Maps can have Map<Integer, String> OR Map<String, Integer> OR Map<Integer, Integer> OR Map<String, String> etc.

        //HASHMAP
        Map<Integer, String> basicHashMap = new HashMap<>();
        basicHashMap.put(1, "Hello");
        basicHashMap.put(2, "World");
        basicHashMap.put(2, "Felix");  // Duplicate key - basically re-assign value "Felix" instead of "World" to key "2"

        //Print hashMap
        System.out.println("Hashmap printed out: " +basicHashMap);
        //Print value of desired key
        System.out.println("Value of key 1 is: " + basicHashMap.get(1));

        //Print records from a map:
        System.out.println("Print values using for loop: ");
        for(Map.Entry<Integer, String> element: basicHashMap.entrySet()) {
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

        //LinkedHashMap
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,1987);
        linkedHashMap.put(2,1989);
        System.out.println("Linked Hash Map: " + linkedHashMap);

        //TreeMap
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("FirstName", "Felix");
        treeMap.put("LastName", "Daraban");
        System.out.println("Linked Tree Map: " + treeMap);
    }
}
