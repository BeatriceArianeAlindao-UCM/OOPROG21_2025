public class DebugPen
{
    private String color;
    private String point;

    public DebugPen()
    {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point)
    {
        this.color = color;   // was color = color did not assign to the field
        this.point = point;   // was point = point did not assign to the field
    

    public String getColor()
    {
        return color;
    }

    public String getPoint()
    {
        return point;
    }
}
