import java.util.ArrayList;

public class ArrayLists {

    public static void main() {

        // ArrayList = a collection that stores elements in an ordered list.
        //             elements can be added, removed, and accessed after compilation phase.
        //             store references data types.


        //          ArrayList reference data type

        ArrayList<String> names = new ArrayList<String>(); // Create an ArrayList of Strings
        names.add("Rismose"); // Add a String to the ArrayList
        names.add("Filicks"); // Add a String to the ArrayList
        names.add("ResM00se"); // Add a String to the ArrayList
        names.add("Gengu"); // Add a String to the ArrayList

        // Print the ArrayList
        System.out.println(names); // Prints [Rismose, Filicks, ResM00se, Gengu]
        System.out.println(); // Print a blank line

        // Print the ArrayList size
        System.out.println(names.size()); // Print the size of the ArrayList
        System.out.println(); // Print a blank line

        // Print the ArrayList element at index 0
        System.out.println(names.get(0)); // Print the element at index. (Rismose)
        System.out.println(); // Print a blank line

        names.set(0, "jiggey"); // Change the element at index 0 to "jiggey"

        // Print the ArrayList element at index 0
        System.out.println(names.get(0)); // Print the element at index 0. (jiggey)
        System.out.println(); // Print a blank line

        // Print the ArrayList elements using a for loop
        for (int i = 0; i < names.size(); i++) { // for loop - i is the index, names.size() is the size of the ArrayList
            System.out.println(names.get(i)); // Print the element at index i
        }
        System.out.println(); // Print a blank line

        names.remove(0); // Remove the element at index 0. (jiggey)
        System.out.println(names); // Print the ArrayList. [Filicks, ResM00se, Gengu]
        System.out.println(); // Print a blank line

        System.out.println(names.get(0)); // Print the element at index 0. (Filicks)
        System.out.println(); // Print a blank line

        names.clear(); // Clear the ArrayList.
        System.out.println(names); // Print the ArrayList. []
        System.out.println(); // Print a blank line



        //          ArrayList primitive data type

        ArrayList<Integer> numbers = new ArrayList<Integer>(); // Create an ArrayList of Integers
        numbers.add(1); // Add an Integer to the ArrayList
        numbers.add(2); // Add an Integer to the ArrayList
        numbers.add(3); // Add an Integer to the ArrayList
        numbers.add(4); // Add an Integer to the ArrayList
        numbers.add(5); // Add an Integer to the ArrayList

        // Print the ArrayList
        System.out.println(numbers); // Prints [1, 2, 3, 4, 5]
        System.out.println(); // Print a blank line

        // Print the ArrayList size
        System.out.println(numbers.size()); // Print the size of the ArrayList
        System.out.println(); // Print a blank line

        // Print the ArrayList element at index 0
        System.out.println(numbers.get(0)); // Print the element at index. (1)
        System.out.println(); // Print a blank line

        numbers.set(0, 6); // Change the element at index 0 to 6

        // Print the ArrayList element at index 0
        System.out.println(numbers.get(0)); // Print the element at index 0. (6)
        System.out.println(); // Print a blank line

        // Print the ArrayList elements using a for loop
        for (int i = 0; i < numbers.size(); i++) { // for loop - i is the index, numbers.size() is the size of the ArrayList
            System.out.println(numbers.get(i)); // Print the element at index i
        }
        System.out.println(); // Print a blank line

        numbers.remove(0); // Remove the element at index 0. (6)
        System.out.println(numbers); // Print the ArrayList. [2, 3, 4, 5]
        System.out.println(); // Print a blank line

        System.out.println(numbers.get(0)); // Print the element at index 0. (2)
        System.out.println(); // Print a blank line

        numbers.clear(); // Clear the ArrayList.
        System.out.println(numbers); // Print the ArrayList. []
        System.out.println(); // Print a blank line
    }
}
