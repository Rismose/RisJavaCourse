public class StringStuff {

    public static void main() {

     // String = a reference data type that stores a sequence of characters.
     // Reference data types have access to useful methods and properties.

        String name = "Rismose"; // String name = "Rismose";


        // equals - checks if the string is equal to "Rismose"

        boolean result = name.equals("Rismose"); // checks if the string is equal to the string "Rismose"

        System.out.println(result); // Prints the result in boolean. True if equal. False if not equal.


        // equals.IgnoreCase - checks if the string is equal to the string "Rismose" but ignoring the case, so "rismose" is also true.

        result = name.equalsIgnoreCase("rismose"); // checks if the string is equal to the string "Rismose" but ignores the case.

        System.out.println(result); // Prints the result in boolean. True if equal. False if not equal.


        // Length - returns the length of the string.

        int length = name.length(); // length of the string "Rismose"

        System.out.println(length); // Prints the length of the string.


        // CharAt - returns the character at the specified index.

        try { // try catch block to catch any errors
            char character = name.charAt(0); // character at index 0 of the string "Rismose"
            System.out.println(character); // Prints the character at index 0 of the string.
        } catch (Exception e) { // catch any errors
            System.out.println("String index is out of range: 0"); // Prints the error message if the index is out of range.
        }


        // IndexOf - returns the index of the first occurrence of the specified character.

        int index = name.indexOf("s"); // index of the first occurrence of the character "s" in the string "Rismose"

        System.out.println(index); // Prints the index of the first occurrence of the character "s" in the string. (2)
                                   // Prints -1 if the character is not found.


        // isEmpty - checks if the string is empty. Returns true if it is empty. Returns false if it is not empty.

        boolean isEmpty = name.isEmpty(); // checks if the string is empty. Returns true if it is empty. Returns false if it is not empty.

        System.out.println(isEmpty); // Prints the result in boolean. True if empty. False if not empty.


        // UpperCase - returns the string in upper case.

        String upperCase = name.toUpperCase(); // returns the string in upper case.

        System.out.println(upperCase); // Prints the string in upper case.


        // LowerCase - returns the string in lower case.

        String lowerCase = name.toLowerCase(); // returns the string in lower case.

        System.out.println(lowerCase); // Prints the string in lower case.


        // Trim - returns the string with leading and trailing spaces removed.

        String trim = name.trim(); // returns the string with leading and trailing spaces removed.

        System.out.println(trim); // Prints the string with leading and trailing spaces removed.
                                  // Right now this does nothing, as I do not have any leading or trailing spaces in the name string.


        // Replace - replaces the first occurrence of the specified character with the specified character.

        String replace = name.replace('s', 'z'); // replaces the first specified character with the second specified character.

        System.out.println(replace); // Prints the string with the first specified character replaced with the second specified character.
                                     // Prints "Rizmoze".
    }
}
