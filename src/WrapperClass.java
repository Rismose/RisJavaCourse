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

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        Float e = 1.23f;
        Long f = 1234567890123456789L;
        Short g = 12;
        Byte h = 127;

        // String is already a reference data type
        String i = "Rismose";

        if (a == true) {
            System.out.println("a is true");
        }
        if (b == '@') {
            System.out.println("b is @");
        }
        if (c == 123) {
            System.out.println("c is 123");
        }
        if (d == 3.14) {
            System.out.println("d is 3.14");
        }
        if (e == 1.23f) {
            System.out.println("e is 1.23f");
        }
        if (f == 1234567890123456789L) {
            System.out.println("f is 1234567890123456789L");
        }
        if (g == 12) {
            System.out.println("g is 12");
        }
        if (h == 127) {
            System.out.println("h is 127");
        }

        // Try it yourself:
        // - Use wrapper classes in an ArrayList (e.g., ArrayList<Integer>).
        // - Compare wrapper objects with primitives.
        // - Try autoboxing and unboxing in your own methods.
    }
}
