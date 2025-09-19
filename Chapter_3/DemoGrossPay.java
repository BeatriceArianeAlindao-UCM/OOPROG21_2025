import java.util.Scanner;

public class DemoGrossPay {

    public static final double HOURLY_RATE = 22.75;

    public static void calculateGross(double hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        System.out.println(hoursWorked + " hours at $" + HOURLY_RATE + " per hour is $" + grossPay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] hoursWorked = new double[3];

                for (int i = 0; i < 3; i++) {
            System.out.print("Enter hours worked for entry " + (i + 1) + ": ");
            hoursWorked[i] = scanner.nextDouble();
        }

        System.out.println(); 
        
                for (int i = 0; i < 3; i++) {
            calculateGross(hoursWorked[i]);
        }

        scanner.close();
    }
}
