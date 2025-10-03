// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;

public class DebugFive4
{
    public static void main(String args[])
    {
        int one, two, three, four;
        int highest;
        Scanner input = new Scanner(System.in);

        // ERROR: all inputs were stored in "one"
        // FIX: store each input in its own variable
        System.out.print("Enter an integer >> ");
        one = input.nextInt();
        System.out.print("Enter an integer >> ");
        two = input.nextInt();
        System.out.print("Enter an integer >> ");
        three = input.nextInt();
        System.out.print("Enter an integer >> ");
        four = input.nextInt();

        // ERROR: uninitialized variables used in comparisons
        // FIX: now all variables are properly initialized

        if (one > two && one > three && one > four)
            highest = one;
        // ERROR: original used (&& ... || ...) which gave wrong results
        // FIX: must use && for all comparisons
        else if (two > one && two > three && two > four)
            highest = two;
        // ERROR: original used (three == one) instead of >
        // FIX: changed to (three > one)
        else if (three > one && three > two && three > four)
            highest = three;
        else
            highest = four;

        System.out.println("The highest number is " + highest);
    }
}
