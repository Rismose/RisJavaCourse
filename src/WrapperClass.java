public class WrapperClass {

    public static void main() {

        // Wrapper Classes - Provides a way to use primitive data types as reference data types.
        //                 - reference data types contain useful methods and properties.
        //                 - can be used with collections. (ArrayList, HashMap, etc.)


        // Primitive         // Wrapper
        // --------          // -------
        // boolean           // Boolean
        // char              // Character
        // int               // Integer
        // double            // Double
        // float             // Float
        // long              // Long
        // short             // Short
        // byte              // Byte

        // AutoBoxing - Automatic conversion of primitive data types to their corresponding wrapper classes.

        // UnBoxing - Automatic conversion of wrapper classes to their corresponding primitive data types.

        Boolean a = true; // Boolean a = true;
        Character b = '@'; // Character b = "@";
        Integer c = 123; // Integer c = 123;
        Double d = 3.14; // Double d = 3.14;
        Float e = 1.23f; // Float e = 1.23f;
        Long f = 1234567890123456789L; // Long f = 1234567890123456789L;
        Short g = 12; // Short g = 12;
        Byte h = 127; // Byte h = 127;

        // String is already a reference data type.
        String i = "Rismose"; // String e = "Rismose";

        if (a == true) { // if a is true
            System.out.println("a is true"); // Prints "a is true"
        }

        if (b == '@') { // if b is @
            System.out.println("b is @"); // Prints "b is @"
        }

        if (c == 123) { // if c is 123
            System.out.println("c is 123"); // Prints "c is 123"
        }

        if (d == 3.14) { // if d is 3.14
            System.out.println("d is 3.14"); // Prints "d is 3.14"
        }

        if (e == 1.23f) { // if e is 1.23f
            System.out.println("e is 1.23f"); // Prints "e is 1.23f"
        }

        if (f == 1234567890123456789L) { // if f is 1234567890123456789L
            System.out.println("f is 1234567890123456789L"); // Prints "f is 1234567890123456789L"
        }

        if (g == 12) { // if g is 12
            System.out.println("g is 12"); // Prints "g is 12"
        }

        if (h == 127) { // if h is 127
            System.out.println("h is 127"); // Prints "h is 127"
        }
    }
}
