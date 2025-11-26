import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("(StringBuilder 1) nameString: ");
        String userString1 = input.nextLine();

        StringBuilder sb1 = new StringBuilder(userString1);

        System.out.println("Capacity of nameString is: " + sb1.capacity());

        System.out.print("\nEnter new length for nameString: ");
        int newLength1 = input.nextInt();
        input.nextLine(); 
        sb1.setLength(newLength1);

        System.out.print("\n(StringBuilder 2) addressString: ");
        String userString2 = input.nextLine();

        StringBuilder sb2 = new StringBuilder(userString2);

        System.out.println("Capacity of addressString is: " + sb2.capacity());

        System.out.print("\nEnter new length for addressString: ");
        int newLength2 = input.nextInt();
        sb2.setLength(newLength2);
        
        System.out.println("\n(Length set to " + newLength1 + " for StringBuilder 1) The name is " + sb1.toString());
        System.out.println("(Length set to " + newLength2 + " for StringBuilder 2) The address is " + sb2.toString());
    }
