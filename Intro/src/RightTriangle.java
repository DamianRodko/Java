public class RightTriangle
{
    double base, height;


    public RightTriangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }//end constructor


    /* Uses the Pythagorean Theorem: a2 + b2 = c2
        to calculate and return the length of the hypotenuse (side c)
        of a right triangle with base (side a) and height (side b)
    */
    public double hypotenuse()
    {
        /* implement this method!  */
        double c = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return c;
    }//end hypotenuse()


    // Test RightTriangle class
    public static void main(String[] args) {
        // Test 3,4,5 right triangle
        RightTriangle triangle1 = new RightTriangle(3, 4);
        double hypotenuse1 = triangle1.hypotenuse();
        System.out.println(hypotenuse1);


        // Test 6.5 and 10.7
        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
        double hypotenuse2 = triangle2.hypotenuse();
        System.out.println(hypotenuse2);


    }//end main


}//end class

