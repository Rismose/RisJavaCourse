public class SwapVariable {

    public static void main() {

        String x = "x";
        String y = "y";
        String temp;

        temp = x;

        x = y;

        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

}
