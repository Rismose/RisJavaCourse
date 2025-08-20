// ArrayList2D.java
// Demonstrates how to use 2D ArrayLists in Java
// Try it yourself: Add more lists, items, or print in different formats!

package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {
        // --- 2D ARRAYLIST BASICS ---
        // 2D ArrayLists are ArrayLists that store other ArrayLists

        // First we need to create some ArrayLists to store different categories of items.
        // Each category will be an ArrayList of Strings.
        // This allows us to have a flexible structure where we can add or remove items easily.

        ArrayList<String> dinnerList = new ArrayList<>(); // Create a new ArrayList to store dinner items
        dinnerList.add("Burger"); // Add items to the dinner list
        dinnerList.add("Pizza");
        dinnerList.add("Pasta");
        dinnerList.add("Salad");
        dinnerList.add("Soup");
        dinnerList.add("Sandwich");
        dinnerList.add("Pancakes"); // Try adding more dinner items!
        System.out.println(dinnerList); // Print the dinner list
        System.out.println(); // Print a blank line for better readability

        ArrayList<String> drinksList = new ArrayList<>(); // Create a new ArrayList to store drinks
        drinksList.add("Water"); // Add drinks to the drinks list
        drinksList.add("Coke");
        drinksList.add("Beer");
        drinksList.add("Soda");
        drinksList.add("Lemonade");
        drinksList.add("Orange Juice");
        drinksList.add("Lime Juice");
        drinksList.add("Grapefruit Juice");
        drinksList.add("Mango Juice");
        drinksList.add("Pineapple Juice"); // Try adding more drinks!
        System.out.println(drinksList); // Print the drinks list
        System.out.println(); // Print a blank line for better readability

        ArrayList<String> dessertsList = new ArrayList<>(); // Create a new ArrayList to store desserts
        dessertsList.add("Ice Cream"); // Add desserts to the desserts list
        dessertsList.add("Cake");
        dessertsList.add("Cupcake");
        dessertsList.add("Brownie");
        dessertsList.add("Cookie");
        dessertsList.add("Pie");
        dessertsList.add("Pudding");
        dessertsList.add("Candy"); // Try adding more desserts!
        System.out.println(dessertsList); // Print the desserts list
        System.out.println(); // Print a blank line for better readability

        // Nor we can create a 2D ArrayList to hold all these lists.
        // A 2D ArrayList is simply an ArrayList that contains other ArrayLists.
        // This allows us to group related lists together, like dinner, drinks, and desserts.
        ArrayList<ArrayList<String>> menu = new ArrayList<>(); // Create a new 2D ArrayList to hold the menu categories
        menu.add(dinnerList); // Add the dinner list to the menu
        menu.add(drinksList); // Add the drinks list to the menu
        menu.add(dessertsList); // Add the drinks list to the menu

        // Print all items in the 2D ArrayList
        for (ArrayList<String> category : menu) { // Loop through each category in the menu
            System.out.println(category); // Print the current category
        }

        System.out.println(); // Print a blank line for better readability

        Scanner scanner = new Scanner(System.in); // Create a Scanner to read user input
        // Create a menu that prompts the user to choose a string from each category
        System.out.println("Choose a dinner item: "); // Prompt user for a dinner item
        for (int i = 0; i < dinnerList.size(); i++) { // Loop through each item in the dinner list
            System.out.println((i + 1) + ". " + dinnerList.get(i)); // Print the item with its index
        }
        System.out.println("-----------------"); // Print a separator line for better readability
        System.out.println(); // Print a blank line for better readability
        int dinnerChoice = scanner.nextInt() - 1; // Read user input and adjust
        // for zero-based indexing
        System.out.println("You chose: " + dinnerList.get(dinnerChoice)); // Print the chosen dinner item
        System.out.println(); // Print a blank line for better readability
        System.out.println("Choose a drink: "); // Prompt user for a drink
        for (int i = 0; i < drinksList.size(); i++) { // Loop through each item in the drinks list
            System.out.println((i + 1) + ". " + drinksList.get(i)); // Print the item with its index
        }
        System.out.println("-----------------"); // Print a separator line for better readability
        System.out.println(); // Print a blank line for better readability
        int drinkChoice = scanner.nextInt() - 1; // Read user input and adjust
        // for zero-based indexing
        System.out.println("You chose: " + drinksList.get(drinkChoice)); // Print the chosen drink
        System.out.println(); // Print a blank line for better readability
        System.out.println("Choose a dessert: "); // Prompt user for a dessert
        for (int i = 0; i < dessertsList.size(); i++) { // Loop through each item in the desserts list
            System.out.println((i + 1) + ". " + dessertsList.get(i)); // Print the item with its index
        }
        System.out.println("-----------------"); // Print a separator line for better readability
        System.out.println(); // Print a blank line for better readability
        int dessertChoice = scanner.nextInt() - 1; // Read user input and adjust
        // for zero-based indexing
        System.out.println("You chose: " + dessertsList.get(dessertChoice)); // Print the chosen dessert
        System.out.println("-----------------"); // Print a separator line for better readability
        System.out.println(); // Print a blank line for better readability
        // Now we have a simple menu system where the user can choose items from each category.
        // This demonstrates how to use 2D ArrayLists to organize related data.

        // Print the user's choices
        System.out.println("Your choices: ");
        System.out.println("Dinner: " + dinnerList.get(dinnerChoice)); // Print the chosen dinner item
        System.out.println("Drink: " + drinksList.get(drinkChoice)); // Print the chosen drink
        System.out.println("Dessert: " + dessertsList.get(dessertChoice)); // Print the chosen dessert
        scanner.close();


        // Try it yourself:
        // - Add more categories (e.g., appetizers).
        // - Print each item in every category using nested loops.
        // - Use ArrayList<ArrayList<Integer>> for numbers.
    }
}
