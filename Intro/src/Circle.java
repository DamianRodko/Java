package Math;
public class Circle
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double area()
    {
        double a = Math.PI * (Math.pow(radius, 2));
        return a;
    }
    public double circumference()
    {
         double d = 2 * radius;
         double c = Math.PI * d;
         return c;
    }
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
    public String toString()
    {
        String str = "radius = " + radius + "\n";
        str += "area = " + area() + "\n";
        str += "circumference = " + circumference() + "\n";
        return str;
    }
    public static void main(String[] args)
    {
        Circle myCircle = new Circle(5);
        System.out.println(myCircle);
        myCircle = new Circle(9.2);
        System.out.println(myCircle);
        myCircle.setRadius(10);
        System.out.println(myCircle);
    }
}