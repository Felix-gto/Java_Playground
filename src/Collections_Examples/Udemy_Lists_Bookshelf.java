package Collections_Examples;

import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Function;

/* GENERICS
 * Udemy Assignment description: https://www.udemy.com/course/automation-testing-masterclass/learn/quiz/5809948#questions/20170312
 * Udemy Assignment explanation: https://www.udemy.com/course/automation-testing-masterclass/learn/lecture/44912095#questions/20170312
*/

public class Udemy_Lists_Bookshelf<T> {

    // Define a list of items: digital bookshelf that can hold any type of items, not just books!
    private List<T> items;

    // Create an empty bookshelf (or list).
    public Udemy_Lists_Bookshelf() {
        items = new ArrayList<T>();
    }

    // Add an item to the bookshelf.
    public void addItem(T item) {
        items.add(item);
    }

    // Remove an item from the bookshelf.
    public void removeItem(T item) {
        items.remove(item);
    }

    // Get all items from the bookshelf.
    public List<T> getItems() {
        return items;
    }

    // Search for items on the bookshelf using a keyword.
    public List<T> searchItems(String keyword, Function<T, String> fieldExtractor) {
        List<T> results = new ArrayList<T>();
        for (T item : items) {
            String field = fieldExtractor.apply(item);
            if (field != null && field.contains(keyword)) {
                results.add(item);
            }
        }
        return results;
    }
}
