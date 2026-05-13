public class ArrayAlgorithms
{
    public static void printExclamation(String[] wordList)
    {
        for(int i = 0; i < wordList.length; i++)
        {
            System.out.println(wordList[i] + "!");
        }
    }
    public static void addExclamation(String[] wordList)
    {        
        for(int i = 0; i < wordList.length; i++)
        {
            wordList[i] += "!";
        }
    }  
    public static int sum(int[] numList)
    {
        int total = 0;
        for(int i = 0; i < numList.length; i++)
        {
            total += numList[i];
        }
        return total;
    }
    public static double average(int[] numList)
    {
        double total = 0;
        for(int i = 0; i < numList.length; i++)
        {
            total += numList[i];
        }
        return total / numList.length;
    }
    public static int minimum(int[] numList)
    {
        int min = numList[0];
        for(int i = 1; i < numList.length; i++)
        {
            if(numList[i] < min)
            {
                min = numList[i];
            }
        }
        return min;
    }
    public static int maximum(int[] numList)
    {
        int max = numList[0];
        for(int i = 1; i < numList.length; i++)
        {
            if(numList[i] > max)
            {
                max = numList[i];
            }
        }
        return max;
    }
    public static void multiplyBy(int[] numList, int multiplier)
    {
        for(int i = 0; i < numList.length; i++)
        {
            numList[i] *= multiplier;
        }
    }
    public static int[] squares(int[] numList)
    {
        int[] nums = new int[numList.length];
        for(int i = 0; i < numList.length; i++)
        {
            nums[i] = numList[i] * numList[i];
        }
        return nums;
    }
    public static void flipBool(boolean[] boolList)
    {
        for(int i = 0; i < boolList.length; i++)
        {
            boolList[i] = !boolList[i];
        }
    }
    public static String customToString(int[] numList)
    {
        String str = "[";
        for(int i = 0; i < numList.length; i++)
        {
            str += numList[i];
            if(i != numList.length - 1)
            {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}