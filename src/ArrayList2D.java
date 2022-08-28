import java.util.ArrayList;

public class ArrayList2D {

    public static void main() {

        // 2D ArrayList = dynamic array that can store other arrays.
        // Can change the size during runtime.

        ArrayList<String> dinnerList = new ArrayList<>(); // Create an ArrayList of Strings

        dinnerList.add("Pizza"); // Add a String to the ArrayList
        dinnerList.add("Pasta"); // Add a String to the ArrayList
        dinnerList.add("Salad"); // Add a String to the ArrayList
        dinnerList.add("Soup"); // Add a String to the ArrayList
        dinnerList.add("Sandwich"); // Add a String to the ArrayList
        dinnerList.add("Pancakes"); // Add a String to the ArrayList

        System.out.println(dinnerList); // Print the ArrayList
        System.out.println(); // Print a blank line

        ArrayList<String> drinksList = new ArrayList<>(); // Create an ArrayList of Strings

        drinksList.add("Water"); // Add a String to the ArrayList
        drinksList.add("Coke"); // Add a String to the ArrayList
        drinksList.add("Beer"); // Add a String to the ArrayList
        drinksList.add("Soda"); // Add a String to the ArrayList
        drinksList.add("Lemonade"); // Add a String to the ArrayList
        drinksList.add("Orange Juice"); // Add a String to the ArrayList
        drinksList.add("Lime Juice"); // Add a String to the ArrayList
        drinksList.add("Grapefruit Juice"); // Add a String to the ArrayList
        drinksList.add("Mango Juice"); // Add a String to the ArrayList
        drinksList.add("Pineapple Juice"); // Add a String to the ArrayList

        System.out.println(drinksList); // Print the ArrayList
        System.out.println(); // Print a blank line

        ArrayList<String> dessertsList = new ArrayList<>(); // Create an ArrayList of Strings

        dessertsList.add("Ice Cream"); // Add a String to the ArrayList
        dessertsList.add("Cake"); // Add a String to the ArrayList
        dessertsList.add("Cupcake"); // Add a String to the ArrayList
        dessertsList.add("Brownie"); // Add a String to the ArrayList
        dessertsList.add("Cookie"); // Add a String to the ArrayList
        dessertsList.add("Pie"); // Add a String to the ArrayList
        dessertsList.add("Pudding"); // Add a String to the ArrayList
        dessertsList.add("Candy"); // Add a String to the ArrayList

        System.out.println(dessertsList); // Print the ArrayList
        System.out.println(); // Print a blank line

        ArrayList<ArrayList<String>> menu = new ArrayList<>(); // Create an ArrayList of ArrayLists of Strings
        menu.add(dinnerList); // Add the dinnerList to the menu
        menu.add(drinksList); // Add the drinksList to the menu
        menu.add(dessertsList); // Add the dessertsList to the menu

        System.out.println(menu); // Print the ArrayList of ArrayLists of Strings
        System.out.println(); // Print a blank line

        System.out.println(menu.get(0)); // Print the first arraylist in the ArrayList of ArrayLists of Strings
        System.out.println(); // Print a blank line

        System.out.println(menu.get(1).get(0)); // Print the first String in the second arraylist in the ArrayList of ArrayLists of Strings
    }
}
