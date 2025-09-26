// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;

public class DebugFour1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int radius;

        // There is no class named Circle, use DebugCircle instead
        // Circle c = new Circle();
        DebugCircle c;

        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();

        // The DebugCircle constructor needs an int radius, 
        c = new DebugCircle(radius);

        // Method names were wrong, they must match DebugCircle.java
        // c.getRad() to c.getRadius()
        System.out.println("The radius is " + c.getRadius());

        // c.getDiam() to c.getDiameter()
        System.out.println("The diameter is " + c.getDiameter());

        System.out.println("The area is " + c.getArea());
    }
}
