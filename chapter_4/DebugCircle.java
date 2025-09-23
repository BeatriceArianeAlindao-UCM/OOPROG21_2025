public class DebugCircle {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    //  had an extra semicolon (;) after method header
    // "radiuss" was misspelled
    public int getRadius() {
        return radius;
    }

    // method return type was 'void' but tried to return a value
    // changed return type to 'int'
    public int getDiameter() {
        return diameter;
    }
    
    public double getArea() {
        return area;
    }

    // It needs a Main method to run and test the class
    public static void main(String[] args) {
        DebugCircle circle = new DebugCircle(5); // create a circle with radius 5
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());
    }
}



