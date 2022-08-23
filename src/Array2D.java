public class Array2D {

    public static void main() {

        // 2D Arrays - An array that contains other arrays. Class name couldn't be 2DArray because it's a reserved word.

        int[][] array2D = new int[3][3]; // 3x3 array

        array2D[0][0] = 0; // 0,0
        array2D[0][1] = 1; // 0,1
        array2D[0][2] = 2; // 0,2
        array2D[1][0] = 1; // 1,0
        array2D[1][1] = 2; // 1,1
        array2D[1][2] = 3; // 1,2
        array2D[2][0] = 1; // 2,0
        array2D[2][1] = 3; // 2,1
        array2D[2][2] = 3; // 2,2

        System.out.println(array2D[1][1]); // 4 - Prints the specific value in the array

        // Print out the entire array
        for (int i = 0; i < array2D.length; i++) { // Loop through the rows
            for (int j = 0; j < array2D[i].length; j++) { // Loop through the columns
                System.out.print(array2D[i][j] + " "); // Print the value in the array
            }
            System.out.println(); // New line afterwards
        }

    }
}
