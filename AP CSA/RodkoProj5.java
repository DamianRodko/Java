public class RodkoProj5
{
    public static void main(String []args)
    {
        String[] str = {"AP", "COMP", "SCI", "ROCKS"};;
//        String[] str = {"GREEN", "EGGS", "AND", "HAM"};
//        String[] str = {"BEACH", "BALL"};
//        System.out.println(comesBefore(str, "xenomorph"));
        int[] ints = {12, 10, -13, 4, 20, 15};
//        LearningArrays.printArr(noAdj(ints));
//        System.out.println(maxAdjDist(ints));
//        System.out.println(countStringsWithE(str));
//        LearningArrays.printArr(noMoreEvilEsPLEASE(str));
        double[] nums = {5.0, 2.2, 3.8, 9.1};
//        LearningArrays.printArr(randomlyRemoveElement(nums));
//        LearningArrays.printArr(randomlyRemoveNElements(nums, 2));
//        System.out.println(totalLetters(str));
//        System.out.println(basicGapWidth(str, 20));
//        System.out.println(leftoverSpaces(str, 20));
//        System.out.println(format(str, 20));
//        System.out.println(format(str,20).length());
    }
    public static boolean comesBefore(String[] words, String str)
    {
        for(int i = 0; i < words.length; i++)
        {
            if(str.compareTo(words[i]) < 0)
            {
                return false;
            }
        }
        return true;
    }
    public static int[] noAdj(int[] ints)
    {
        for(int i = 0; i < ints.length - 2; i++)
        {
            if((ints[i] + 1 == ints[i + 1]) && ints[i + 1] + 1 == ints[i + 2])
            {
                ints[i] = -99;
                ints[i + 1] = -99;
                ints[i + 2] = -99;
            }
        }
        return ints;
    }
    public static int maxAdjDist(int[] nums)
    {
        int out = Math.abs(nums[0] - nums[1]);
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(Math.abs(nums[i] - nums[i + 1]) > out)
            {
                out = Math.abs(nums[i] - nums[i + 1]);
            }
        }
        return out;
    }
    public static int countStringsWithE(String[] strs)
    {
        int count = 0;
        boolean hasE = false;
        for(int i = 0; i < strs.length; i++)
        {
            for(int j = 0; j < strs[i].length(); j++)
            {
                if(strs[i].charAt(j) == 'E')
                {
                    hasE = true;
                }
            }
            if(hasE)
            {
                count++;
            }
            hasE = false;
        }
        return count;
    }
    public static String[] noMoreEvilEsPLEASE(String[] strs)
    {
        int noELength = strs.length - countStringsWithE(strs);
        String[] arr = new String[noELength];
        int noECount = 0;
        boolean hasE = false;
        if(countStringsWithE(strs) == 0)
        {
            return strs;
        }
        for(int i = 0; i < strs.length; i++)
        {
            for(int j = 0; j < strs[i].length(); j++)
            {
                if(strs[i].charAt(j) == 'E')
                {
                    hasE = true;
                }
            }
            if(!hasE)
            {
                arr[noECount++] = strs[i];
            }
            hasE = false;
        }
        return arr;
    }
    public static double[] randomlyRemoveElement(double[] nums)
    {
        double[] arr = new double[nums.length - 1];
        int rand = (int)(Math.random() * nums.length);
        int arrIndex = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i != rand)
            {
                arr[arrIndex++] = nums[i];
            }
        }
        return arr;
    }
    public static double[] randomlyRemoveNElements(double[] nums, int n)
    {
        for(int i = 0; i < n; i++)
        {
            nums = randomlyRemoveElement(nums);
        }
        return nums;
    }
    public static int totalLetters(String[] wordList)
    {
        int count = 0;
        for(int i = 0; i < wordList.length; i++)
        {
            for(int j = 0; j < wordList[i].length(); j++)
            {
                count++;
            }
        }
        return count;
    }
    public static int basicGapWidth(String[] wordList, int formattedLen)
    {
        int total = totalLetters(wordList);
        int numSpaces = formattedLen - total;
        int gapCount = wordList.length - 1;
        return numSpaces / gapCount;
    }
    public static int leftoverSpaces(String[] wordList, int formattedLen)
    {
        int gapCount = wordList.length - 1;
        int total = totalLetters(wordList);
        int basicSpaceCount = gapCount * basicGapWidth(wordList, formattedLen);
        return formattedLen - total - basicSpaceCount;
    }
    public static String format(String[] wordList, int formattedLen)
    {
        String out = "";
        int leftOver = leftoverSpaces(wordList, formattedLen);
        for(int i = 0; i < wordList.length; i++)
        {
            out += wordList[i];
            if(i != wordList.length - 1)
            {
                for(int j = 0; j < basicGapWidth(wordList, formattedLen); j++)
                {
                    out += " ";
                    if(leftOver > 0)
                    {
                        out += " ";
                        leftOver--;
                    }
                }
            }
        }
        return out;
    }
}