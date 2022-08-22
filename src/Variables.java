public class Variables {

    public static void main() {

        // This is the correct way of doing this and would give us an accurate result
        float x, y, z;

        x = 10f;

        y = 20f;

        z = x / y + 13f;

        System.out.println("The correct way of doing things");
        System.out.println("z = " + z);
        System.out.println("X / Y = " + x / y + "\n");

        // Now to the INCORRECT way of doing things

        int a,b,c;

        a = 10;

        b = 20;

        c = a / b + 13;

        System.out.println("The incorrect way of doing things");
        System.out.println("c = " + c);
        System.out.println("A / B = " + a / b);
    }

}
