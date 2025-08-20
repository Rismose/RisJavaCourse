// ForEachLoops.java
// Demonstrates for-each loops for arrays and ArrayLists in Java
// Try it yourself: Change the items, add more, or print indexes!

package Loops;

import java.util.ArrayList;

public class ForEachLoops {

    public static void main(String[] args) {
        // --- For-each loop with an array ---
        String[] animals = {"cat", "dog", "bird", "fish"}; // Try adding more animals!
        for (String animal : animals) { // For-each loop iterates through each animal
            // The variable 'animal' takes the value of each element in the array
            // in each iteration of the loop.
            // This is a simplified way to loop through arrays or collections.
            // It automatically handles the index and length of the array.
            // You don't need to worry about the index or length.
            System.out.println(animal); // Prints each animal
        }

        // --- For-each loop with an ArrayList ---
        ArrayList<String> food = new ArrayList<String>(); // ArrayList to store food items
        // ArrayLists can grow and shrink dynamically, unlike arrays.
        // You can add or remove items as needed.
        // This is useful when you don't know the number of items in advance.
        food.add("pizza"); // Add food items to the ArrayList
        food.add("hamburger");
        food.add("hotdog");
        food.add("fries"); // Try adding more food!
        for (String item : food) { // For-each loop iterates through each food item
            // The variable 'item' takes the value of each element in the ArrayList
            // in each iteration of the loop.
            // This is a simplified way to loop through collections.
            // It automatically handles the size of the ArrayList.
            System.out.println(item); // Prints each food item
        }

        // Try it yourself:
        // - Add more items to the array or ArrayList.
        // - Print the index (hint: use a regular for loop).
        // - Use for-each with other types (e.g., int[]).
    }
}
