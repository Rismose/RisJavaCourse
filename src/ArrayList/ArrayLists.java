// ArrayLists.java
// Demonstrates how to use ArrayLists in Java
// Try it yourself: Add/remove items, change values, or use other types!

package ArrayList;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // --- ARRAYLIST BASICS ---
        // ArrayLists store elements in an ordered list and can grow/shrink
        ArrayList<String> names = new ArrayList<String>(); // Create an ArrayList to store names
        // ArrayLists can hold any type of object, including Strings, Integers, etc.
        // They are dynamic, meaning you can add or remove items as needed.
        // This is useful when you don't know the number of items in advance.
        // You can also use ArrayList<Integer>, ArrayList<Double>, etc. for other types
        names.add("Rismose"); // Add names to the ArrayList
        names.add("Filicks");
        names.add("ResM00se");
        names.add("Gengu"); // Try changing names or adding more!

        // Print the ArrayList
        System.out.println(names); // Prints all names
        System.out.println(); // Print a blank line for better readability

        // Print the ArrayList size
        System.out.println(names.size()); // Number of elements
        System.out.println(); // Print a blank line for better readability

        // Print the first element
        System.out.println(names.get(0)); // First name
        System.out.println(); // Print the second element

        names.set(0, "jiggey"); // Change the first element to "jiggey"
        // The set method replaces the element at the specified index with a new value.
        // This is useful when you want to update an existing item in the ArrayList.
        // You can also use names.set(index, value) to change other elements.
        System.out.println(names.get(0)); // Prints the updated first name
        System.out.println(); // Print a blank line for better readability

        // Print all elements using a for loop
        for (int i = 0; i < names.size(); i++) { // Loop through each index
            // The loop iterates from 0 to the size of the ArrayList minus one.
            // This is a common way to access each element in an ArrayList.
            // You can also use names.get(i) to access the element at index i.
            // The size() method returns the number of elements in the ArrayList.
            // This is useful when you want to perform operations on each element.
            // For example, you can print each name or perform calculations.
            // You can also use a for-each loop to iterate through the ArrayList.
            System.out.println(names.get(i)); // Prints each name at index i
        }
        System.out.println(); // Print a blank line for better readability

        names.remove(0); // Remove the first element
        System.out.println(names); // Prints remaining names
        System.out.println(); // Print a blank line for better readability

        System.out.println(names.get(0)); // Prints new first name

        // Try it yourself:
        // - Add or remove more items.
        // - Use ArrayList<Integer> or ArrayList<Double>.
        // - Print all items with a for-each loop.
    }
}
