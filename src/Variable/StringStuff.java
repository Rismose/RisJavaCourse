// StringStuff.java
// Demonstrates common String methods in Java
// Try it yourself: Change the string, use other methods, and see what happens!

package Variable;

public class StringStuff {

    public static void main(String[] args) {
        // String = a reference data type that stores a sequence of characters.
        // Reference data types have access to useful methods and properties.

        String name = "Rismose"; // Try changing this to your own name!


        // equals - checks if the string is equal to "Rismose"
        boolean result = name.equals("Rismose"); // checks if the string is equal to the string "Rismose"

        System.out.println(result); // Prints true if equal, false if not


        // equalsIgnoreCase - checks if the string is equal, ignoring case
        result = name.equalsIgnoreCase("rismose"); // checks if the string is equal to the string "Rismose" but ignores the case.

        System.out.println(result); // Prints true if equal, false if not (ignoring case)


        // length - returns the length of the string
        int length = name.length(); // length of the string "Rismose"

        System.out.println(length); // Prints the length of the string (7 in this case)


        // charAt - returns the character at the specified index
        try { // try block to handle exceptions
            // If the index is out of range, it will throw an exception.
            char character = name.charAt(0); // character at index 0 of the string "Rismose" (which is 'R')
            // ! Strings are zero-indexed, so the first character is at index 0. !
            System.out.println(character); // Prints the character at index 0 of the string. ('R')
        } catch (Exception e) { // catch block to handle any exceptions
            // If the index is out of range, it will throw an exception.
            // For example, if you try to access index 10 in a string of length 7. It will throw a StringIndexOutOfBoundsException.
            // You can also use e.getMessage() to get the error message.
            // In this case, it will print "String index is out of range: 0"
            System.out.println("String index is out of range: 0"); // Prints the error message if the index is out of range.
        }


        // indexOf - returns the index of the first occurrence of a character
        int index = name.indexOf("s"); // index of the first occurrence of the character "s" in the string "Rismose"
        // In this case, it will return 2 because "s" is at index 2 in "Rismose".
        // If the character is not found, it will return -1.
        // For example, if you try to find the index of "x" in "Rismose", it will return -1.

        System.out.println(index); // Prints the index of the first occurrence of the character "s" in the string "Rismose" (which is 2)


        // isEmpty - checks if the string is empty
        System.out.println(name.isEmpty()); // Prints false because "Rismose" is not empty


        // toUpperCase and toLowerCase - changes case
        System.out.println(name.toUpperCase()); // Changes to uppercase and prints "RISMOSE"

        System.out.println(name.toLowerCase()); // Changes to lowercase and prints "rismose"


        // trim - removes leading/trailing spaces
        String spaced = "   Rismose   "; // String with spaces at the beginning and end
        System.out.println(spaced.trim()); // Removes spaces and prints "Rismose"
        // Can be used to trim spaces or other whitespace characters from the beginning and end of a string.

        // substring - extracts a part of the string
        System.out.println(name.substring(1, 4)); // Extracts characters from index 1 to 3 (exclusive) and prints "ism"
        // In this case, it will print "ism" because it starts at index 1 and ends at index 4 (exclusive).


        // replace - replaces characters or substrings
        System.out.println(name.replace("R", "B")); // Replaces all occurrences of "R" with "B" and prints "Bismose"


        // Try it yourself:
        // - Change 'name' to something else.
        // - Try other string methods (see Java docs).
        // - What happens if you use an index that's too high in charAt?
    }
}
