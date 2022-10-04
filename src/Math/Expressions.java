package Math;

public class Expressions {

    public static void main() {

        // Math.Expressions = operands & operators
        // operands = values, variables, constants, etc.
        // operators = +, -, *, /, %, ++, --, etc.


        //  ADDITION

        // Let's say we have 10 friends.
        int friends = 10;
        // Using the ++ operator we can add 1 to our friends variable.
        friends++; // would be 11
        // Printing out the friends variable. (11)
        System.out.println(friends);


        //  SUBTRACTION

        // Now, let's say we also have 10 enemies.
        int enemies = 10;
        // Using the -- operator we can subtract 1 from our enemies variable.
        enemies--; // would be 9
        // Printing out the enemies variable. (9)
        System.out.println(enemies);


        //  DIVISION

        // Let's say we have 25 classmates. We want to divide them into 5 different groups.
        int classmates = 25;
        // We can use the / operator to divide our classmates variable by 5.
        int groups = classmates / 5;
        // We now have a new variable called groups, that is equal to 5.
        // Printing out the groups variable. (5)
        System.out.println(groups);


        //  MULTIPLICATION

        // Let's say we have a total of 100 people.
        int total = 100;
        // We want to know how many people are in each group.
        int group = total / 5; // We can use the / operator to divide our total variable by 5.
        // We now have a new variable called group, that is equal to 20.
        // Printing out the group variable. (20)
        System.out.println(group);


        //  PERCENTAGE

        // Let's say we have a total of 500 people.
        int all = 500;
        // We want to know how many percent of the total 7 people are.
        float percent = (7f * 100)  / all; // We can use our people divided by 100 to get the percentage if there were 100 people.
        // Printing out the percent variable. (1.4%)
        System.out.println(percent + "%");

        // ! Writing this at 10 in the morning after I haven't slept. And the percentage part doesn't make much sense to me.
        // I wrote it and it's right, but I don't understand it right now, lmao, I need sleep. Don't blame me if it is wrong !







    }

}
