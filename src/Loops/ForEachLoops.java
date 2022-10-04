package Loops;

import java.util.ArrayList;

public class ForEachLoops {

    public static void main() {

        // For-each loops - Used to loop through arrays and collections

        // String array of animals
        String[] animals = {
                "cat",
                "dog",
                "bird",
                "fish"
        };

        // This will loop through the array and print out each value
        for (String i : animals) { // For each string in the array, print it out. The variable "i" is the current value in the array and means index.
            System.out.println(i);
        }

        // ArrayList of food
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        food.add("fries");

        // This will loop through the ArrayList and print out each value
        for (String i : food) { // For each string in the ArrayList, print it out. The variable "i" is the current value in the ArrayList and means index.
            System.out.println(i);
        }
    }

}
