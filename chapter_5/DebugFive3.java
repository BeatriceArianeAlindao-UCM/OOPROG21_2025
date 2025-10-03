// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher - Housewares Department
import java.util.Scanner;

public class DebugFive3
{
    public static void main (String args[])
    {
        int item;
        String output;
        final int LOW = 111;
        final int HIGH = 999;
        final int CUTOFF = 500;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter item number >> ");
        item = input.nextInt();

        // ERROR: condition was reversed (item > LOW)
        // FIX: should be item < LOW
        if(item < LOW)
            output = "Item number too low";

        // ERROR: used HIGHH (typo) and wrong condition
        // FIX: should be item > HIGH
        else if(item > HIGH)
            output = "Item number too high";

        // ERROR: checked only == CUTOFF
        // FIX: valid items less than 500 are Automotive
        else if(item < CUTOFF)
            output = "Valid - Item in Automotive Department";

        // FIX: remaining valid numbers (>= 500) go to Housewares
        else
            output = "Valid - Item in Housewares Department";

        System.out.println(output);
    }
}
