public class ImplementingMethods
{
    public static void main(String[] args)
    {
        //implement:
        //To put into effect
        System.out.println(in1020(12, 99)); // true
        System.out.println(in1020(21, 12)); // true
        System.out.println(in1020(8, 99)); // false
        
        System.out.println(makes10(9, 10)); // true
        System.out.println(makes10(9, 9)); // false
        System.out.println(makes10(1, 9)); // true
        
        System.out.println(loneTeen(13, 99)); // true
        System.out.println(loneTeen(21, 19)); // true
        System.out.println(loneTeen(13, 13)); // false
        
        System.out.println(missingChar("kitten", 1)); // ktten
        System.out.println(missingChar("kitten", 1)); // itten
        System.out.println(missingChar("kitten", 1)); //kittn
        
        System.out.println(removeChar("KITTEN", 'K', true)); // ITTEN
        System.out.println(removeChar("KITTEN", 'K', false)); // KITTEN
        System.out.println(removeChar("KITTEN", 'T', true)); // KITEN
        System.out.println(removeChar("KITTEN", 'a', true)); // KITTEN
        
        System.out.println(close10(8, 13)); // 8
        System.out.println(close10(13, 8)); // 8
        System.out.println(close10(13, 7)); // 0
        
        System.out.println(kindaSum(3)); // 3
        System.out.println(kindaSum(13)); // 4
        System.out.println(kindaSum(123)); // 5
        
        System.out.println(notString("candy")); // not candy
        System.out.println(notString("x")); // not x
        System.out.println(notString("not bad")); // not bad
        
    }
    /* public static returnType methodName(parameter(s))
        {
            body to execute when the method is called
        }
    */
    public static int biggerTwo(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        return b;
    }
    
    public static boolean in1020(int a, int b) 
    {
        if((a <= 20 && a >= 10) || (b <= 20 && b >= 10))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean makes10(int a, int b) 
    {
        if((a == 10 || b == 10) || (a + b == 10))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean loneTeen(int a, int b) 
    {
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19))
        {
            if((a >= 13 && a <= 19) && (b >= 13 && b <= 19))
            {
                return false;
            }
            return true;
        }
        else
        {
            return false;
        }
    }
        public static String missingChar(String str, int n)
    {
        String firstPart = str.substring(0,n);
        String secondPart = str.substring(n + 1);
        String combine = firstPart + secondPart;
        return combine;
    }
    public static String removeChar(String str, char c, boolean remove)
    {
        int locationOfChar = str.indexOf(c);
        {
            if(remove == true && locationOfChar != -1)
            {
                return missingChar(str, locationOfChar);
            }
            else
            {
                return str;
            }
        }
    }
    public static int close10(int a, int b) 
    {
        if (Math.abs(a - 10) == Math.abs(b - 10))
        {
            return 0;
        }
        else if (Math.abs(a - 10) > Math.abs(b - 10))
        {
            return b;
        }
        else
        {
            return a;
        }
    }
    public static int kindaSum(int num) 
    {
        int ones = num%10;
        int tens = (num / 10) % 10;
        if(num > 0 && num < 10)
        {
            return num;
        }
        else
        {
            return ones + tens;
        }
    }
    public static String notString(String str)
    {
        if(str.contains("not"))
        {
            return str;
        }
        else
        {
            str = "not " + str;
            return str;
        }
    }
}