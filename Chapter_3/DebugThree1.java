import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        double check1, check2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble(); // use nextDouble() instead of nextInt()for decimal input

        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble(); // use nextDouble () instead of nextInt ()
        calcTip(check1);
        calcTip(check2);

        input.close();
    }

    // This method now accepts a parameter (bill) to calculate the tip i put double bill because it needs a parameter
    public static void calcTip(double bill) {
        final double RATE = 0.15; // fixed spelling of 'double'
        double tip;
        tip = bill * RATE; // corrected tip calculation (bill * RATE, not bill / RATE)
        System.out.println("The tip should be at least $" + tip);
    }
}
