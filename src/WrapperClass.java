// WrapperClass.java
// Demonstrates wrapper classes in Java and their use with collections
// Try it yourself: Use wrapper classes in ArrayLists, compare with primitives, or try autoboxing/unboxing!

public class WrapperClass {
    public static void main(String[] args) {
        // --- WRAPPER CLASS BASICS ---
        // Wrapper classes let you use primitive types as objects
        // Useful for collections like ArrayList, HashMap, etc.

        // Primitive         // Wrapper
        // boolean           // Boolean
        // char              // Character
        // int               // Integer
        // double            // Double
        // float             // Float
        // long              // Long
        // short             // Short
        // byte              // Byte

        // AutoBoxing: primitive to wrapper
        // UnBoxing: wrapper to primitive

        Boolean a = true; // Boolean is the wrapper class for boolean
        Character b = '@'; // Character is the wrapper class for char
        Integer c = 123; // Integer is the wrapper class for int
        Double d = 3.14; // Double is the wrapper class for double
        Float e = 1.23f; // Float is the wrapper class for float
        Long f = 1234567890123456789L; // Long is the wrapper class for long
        Short g = 12; // Short is the wrapper class for short
        Byte h = 127; // Byte is the wrapper class for byte

        // String is a reference data type, not a primitive
        String i = "Rismose";

        if (a == true) { // Compare Boolean object with primitive
            // Note: This is not the best practice, but works for demonstration
            // It's better to use a.equals(true) for comparison
            // because it avoids NullPointerException if 'a' is null.
            // However, in this case, 'a' is not null, so it works fine
            System.out.println("a is true"); // Prints if 'a' is true
        }
        if (b == '@') { // Compare Character object with primitive
            // Similar to Boolean, it's better to use b.equals('@') for comparison
            System.out.println("b is @"); // Prints if 'b' is '@'
        }
        if (c == 123) { // Compare Integer object with primitive
            System.out.println("c is 123"); // Prints if 'c' is 123
        }
        if (d == 3.14) { // Compare Double object with primitive
            // Note: Double comparison can be tricky due to precision issues
            // It's better to use d.equals(3.14) for comparison
            // but in this case, it works fine because 3.14 is a simple value
            System.out.println("d is 3.14"); // Prints if 'd' is 3.14
        }
        if (e == 1.23f) { // Compare Float object with primitive
            // Similar to Double, Float comparison can also be tricky
            // It's better to use e.equals(1.23f) for comparison
            // but in this case, it works fine because 1.23f is a simple value
            // Note: The 'f' suffix indicates that this is a float literal
            // without it, it would be treated as a double by default
            System.out.println("e is 1.23f"); // Prints if 'e' is 1.23f
        }
        if (f == 1234567890123456789L) { // Compare Long object with primitive
            // Note: Long comparison can also be tricky due to precision issues
            // It's better to use f.equals(1234567890123456789L) for comparison
            // but in this case, it works fine because 1234567890123456789L is a simple value
            // The 'L' suffix indicates that this is a long literal
            // without it, it would be treated as an int by default
            System.out.println("f is 1234567890123456789L"); // Prints if 'f' is 1234567890123456789L
        }
        if (g == 12) { // Compare Short object with primitive
            // Note: Short comparison can also be tricky due to precision issues
            // It's better to use g.equals(12) for comparison
            // but in this case, it works fine because 12 is a simple value
            System.out.println("g is 12"); // Prints if 'g' is 12
        }
        if (h == 127) { // Compare Byte object with primitive
            // Note: Byte comparison can also be tricky due to precision issues
            // It's better to use h.equals(127) for comparison
            // but in this case, it works fine because 127 is a simple value
            // The '127' is within the range of a byte (-128 to 127)
            // If you try to use a value outside this range, it will throw an exception
            System.out.println("h is 127"); // Prints if 'h' is 127
        }

        // Try it yourself:
        // - Use wrapper classes in an ArrayList (e.g., ArrayList<Integer>).
        // - Compare wrapper objects with primitives.
        // - Try autoboxing and unboxing in your own methods.
    }
}
