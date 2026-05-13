import javax.swing.*;
public class RodkoProj3
{
    static class Point {
        double x, y;
        Point(double x, double y) { this.x = x; this.y = y; }
        double getX() { return x; }
        double getY() { return y; }
    }
    public static void main(String []args)
    {
        Point a = getPointFromUser("Enter the first point in the format (x, y): ");
        System.out.println(a);
        Point b = getPointFromUser("Enter the second point in the format (x, y): ");
        System.out.println(b);
        Point c = getPointFromUser("Enter the third point in the format (x, y): ");
        System.out.println(c);
        Point d = getPointFromUser("Enter the fourth point in the format (x, y): ");
        System.out.println(d);
        
        
        if (isParallelogram(a, b, c, d))
        {
            JOptionPane.showMessageDialog(null, "ABCD is a parallelogram");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ABCD is NOT a parallelogram");
        }
        if (isRectangle(a, b, c, d))
        {
            JOptionPane.showMessageDialog(null, "ABCD is a rectangle");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ABCD is NOT a rectangle");
        }
        if (isRhombus(a, b, c, d))
        {
            JOptionPane.showMessageDialog(null, "ABCD is a rhombus");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ABCD is NOT a rhombus");
        }
        if (isSquare(a, b, c, d))
        {
            JOptionPane.showMessageDialog(null, "ABCD is a square");
        }
        else if(!isSquare(a, b, c, d))
        {
            JOptionPane.showMessageDialog(null, "ABCD is NOT a square");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The points form an recognizable shape.");
        }
//        Debug:
//        System.out.println("Test 1: TTFF");
//        Point a = new Point(-3.0, 2.0);
//        Point b = new Point(-2.0, -1.0);
//        Point c = new Point(4.0, 1.0);
//        Point d = new Point(3.0, 4.0);
//        System.out.println(isParallelogram(a, b, c, d));
//        System.out.println(isRectangle(a, b, c, d));
//        System.out.println(isRhombus(a, b, c, d));
//        System.out.println(isSquare(a, b, c, d));
//        System.out.println("Test 2: TFTF");
//        Point e = new Point(2.0, 2.0);
//        Point f = new Point(4.0, 6.0);
//        Point g  = new Point(6.0, 2.0);
//        Point h = new Point(4.0, -2.0);
//        System.out.println(isParallelogram(e, f, g, h));
//        System.out.println(isRectangle(e, f, g, h));
//        System.out.println(isRhombus(e, f, g, h));
//        System.out.println(isSquare(e, f, g, h));
//        System.out.println("Test 3: TFFF");
//        Point i = new Point(2.0, 3.0);
//        Point j = new Point(7.0, 10.0);
//        Point k = new Point(9.0, 4.0);
//        Point l = new Point(4.0, -3.0);
//        System.out.println(isParallelogram(i, j, k, l));
//        System.out.println(isRectangle(i, j, k, l));
//        System.out.println(isRhombus(i, j, k, l));
//        System.out.println(isSquare(i, j, k, l));
//        System.out.println("Test 4: TTTT");
//        Point m = new Point(8.0, 14.0);
//        Point n = new Point(10.0, 10.0);
//        Point o = new Point(14.0, 12.0);
//        Point p = new Point(12.0, 16.0);
//        System.out.println(isParallelogram(m, n, o, p));
//        System.out.println(isRectangle(m, n, o, p));
//        System.out.println(isRhombus(m, n, o, p));
//        System.out.println(isSquare(m, n, o, p));
        
    }
    public static Point getPointFromUser(String message)
    {
        String userInput = JOptionPane.showInputDialog(message);

        int posOpenBracket = userInput.indexOf('(');
        int posComma = userInput.indexOf(',');
        int posCloseBracket = userInput.indexOf(')');

        String xStr = extractNumber(userInput, posOpenBracket + 1, posComma);
        String yStr = extractNumber(userInput, posComma + 1, posCloseBracket);

        double x = Double.parseDouble(xStr);
        double y = Double.parseDouble(yStr);

        return new Point(x, y);
    }
    public static String extractNumber(String str, int start, int end)
    {
        String xOrY = "";
        for (int i = start; i < end; i++)
        {
            char ch = str.charAt(i);
            if (ch != ' ')
            {
                xOrY += ch; 
            }
        }
        return xOrY;
    }
    public static double distanceBetween(Point a, Point b)
    {
        return Math.sqrt((Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2)));
    }
    
    public static Point midPoint(Point a, Point b)
    {
        return new Point((a.getX() + b.getX()) / 2, (a.getY() + b.getY()) / 2);
    }
    
    public static double slope(Point a, Point b)
    {
        return (b.getY() - a.getY()) / (b.getX() - a.getX());
    }
    
    public static boolean isParallelogram(Point a, Point b, Point c, Point d)
    {
        return slope(a, b) == (slope(d, c)) && slope(a,d) == slope(b, c);
    }
    public static boolean isRhombus(Point a, Point b, Point c, Point d)
    {
        return distanceBetween(a, b) == distanceBetween(b, c) &&
                distanceBetween(c, d) == distanceBetween(d, a) && 
                distanceBetween(b, c) == distanceBetween(c, d);
    }

    public static boolean isRectangle(Point a, Point b, Point c, Point d)
    {
        return isParallelogram(a, b, c , d) && distanceBetween(a, c) == distanceBetween(b, d);
    }

    public static boolean isSquare(Point a, Point b, Point c, Point d)
    {
        return isRhombus(a, b, c , d) && distanceBetween(a, c) == distanceBetween(b, d);
    }
}
