public class RodkoProj6
{
    public static void main(String []args)
    {
        double[][] doubles = {{0.3, 0.7, 0.8},
                        {1.1, 1.4, 0.4},
                        {0.2, 0.5, 0.1},
                        {0.9, 0.6, 1.6}};
        int[] num = {90, 60, 75, 80, 80};
        String[] r = {"Joe", "Kim", "Chris"};
        int[][] g = {{9, 8, 7, 6, 2, 4, 5},
                    {5, 4, 2, 1, 9, 3, 1},
                    {3, 9, 2, 3, 5, 1, 2},
                    {8, 7, 6, 3, 2, 5, 5},
                    {1, 2, 3, 3, 2, 1, 4},
                    {9, 8, 7, 6, 7, 8, 9}};
        String[][] t = new String[2][3];
        String[] words = {"Hello", "blah", "boom", "elephant"};
        String[][] table ={{"X", "O", "O", "X", "X", "X", "O", "O", "O"},
                            {"O", "O", "O", "O", "X", "O", "O", "O", "O"},
                            {"O", "O", "O", "O", "O", "O", "X", "X", "X"},
                            {"O", "O", "X", "O", "O", "O", "X", "O", "O"},
                            {"X", "X", "X", "O", "O", "O", "O", "O", "O"},
                            {"O", "O", "O", "O", "X", "O", "O", "O", "O"},
                            {"O", "O", "O", "X", "X", "X", "O", "O", "X"}};
        char[][] lets = {{'s', 'h', 'u', 'j', 'r', 'e', 'i'},
                        {'x', 'q', 'a', 'i', 'x', 'r', 'h', 'a'}};
            int[][] sudokuPuzz1 = {{4,3,5,2,6,9,7,8,1},
            {6,8,2,5,7,1,4,9,3},
            {1,9,7,8,3,4,5,6,2},
            {8,2,6,1,9,5,3,4,7},
            {3,7,4,6,8,2,9,1,5},
            {9,5,1,7,4,3,6,2,8},
            {5,1,9,3,2,6,8,7,4},
            {2,4,8,9,5,7,1,3,6},
            {7,6,3,4,1,8,2,5,9}};
//        System.out.println(minFromSection(doubles,0,2,1,2));
//        Learning2DArrays.printArr(twoCharsTo2D(t, words));
//        System.out.println(findAverage(num));
//        System.out.println(bestAverage(r, g));
//        Learning2DArrays.printArr(removeRow(g, 0));
//        Learning2DArrays.printArr(removeCol(g, 0));
//        Learning2DArrays.printArr(removeRowCol(g, 0, 0));
//        System.out.println(toBeChanged(1, 5, table));
//        Learning2DArrays.printArr(change2DArray(table));
//        Learning2DArrays.printArr(soDramatic(lets));
//        Learning2DArrays.printArr(reverseColMajor(g));
//        LearningArrays.printArr(get5x5At(g, 5, 6));
//        System.out.println(checkRow(sudokuPuzz1, 5));
//        System.out.println(checkCol(sudokuPuzz1, 4));
//        System.out.println(check3x3(sudokuPuzz1, 0, 3));
        System.out.println(checkPuzzle(sudokuPuzz1 ));
    }
    // Method to find the minimum value in a given section of a 2D array
    public double minFromSection(double[][] nums, int startRow, int endRow, int startCol, int endCol)
    {
        double min = nums[startRow][startCol];// Default min value
        for(int i = startRow; i <= endRow; i++)//row loop
        {
            for(int j = startCol; j <= endCol; j++)//column loop
            {
                if(nums[i][j] < min)
                {
                    min = nums[i][j];//Update min if a smaller value is found
                }
            }
        }
        return min;
    }
    // Converts an array of words into a 2D array containing the first two characters of each word and replaces the extra spaces with $$
    public static String[][] twoCharsTo2D(String[][] table, String[] words)
    {
        int wordCount = 0;
        for(int i = 0; i < table.length; i++)//row loop
        {
            for(int j = 0; j < table[0].length; j++)//column loop
            {
                if(wordCount < words.length)
                {
                    table[i][j] = words[wordCount].substring(0,2);// Extracts first two characters
                    wordCount++;
                }
                else
                {
                    table[i][j] = "$$";// Placeholder if words run out
                }
            }
        }
        return table;
    }
    // Computes the average of an integer array
    public static double findAverage(int[] nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)//loops through nums array
        {
            sum += nums[i];// Summing up the array elements
        }
        return (double) sum / nums.length;//divides the sum by total length to find average
    }
    // Computes row averages for a 2D integer array
    public static double[] rowAvg(int[][] nums)
    {
        double[] avg = new double[nums.length];//Array for row averages
        for (int i = 0; i < nums.length; i++)//row loop
        {
            avg[i] = findAverage(nums[i]);// Finding average per row
        }
        return avg;
    }
    // Finds the name of the student with the highest average grade
    public static String bestAverage(String[] roster, int[][] grades)
    {
        double[] avgs = rowAvg(grades);//create row avgs 
        int bestAvg = 0;// Index of highest average
        for (int i = 0; i < avgs.length; i++)
        {
            if (avgs[i] > avgs[bestAvg])
            {
                bestAvg = i;
            }
        }
        return roster[bestAvg];
    }
    // Method to remove a row from a 2D array
    public static int[][] removeRow(int[][] mat, int row)
    {
        int[][] output = new int[mat.length - 1][mat[0].length];//creates a new array with the same length as mat with 1 less row
        int count = 0;//counter for index of row in new array
        for(int r = 0; r < mat.length; r++)
        {
            if(r != row)
            {
                for (int c = 0; c < mat[0].length;c++)
                {
                    output[count][c] = mat[r][c];
                }
            count++;
            }
        }
        return output;
    }
    // Method to remove a column from a 2D array
    public static int[][] removeCol(int[][] mat, int col)
    {
        int[][] output = new int[mat.length][mat[0].length - 1];//creates a new array with the same length as mat with 1 less column
        for(int r = 0; r < mat.length; r++)//row loop
        {
            int count = 0;//counter for index of column in new array
            for (int c = 0; c < mat[0].length;c++)
            {
                if(c != col)
                {
                    output[r][count] = mat[r][c];
                    count++;
                }
            }
        }
        return output;
    }
    // Method to remove both a row and a column from a 2D array
    public static int[][] removeRowCol(int[][] mat, int row, int col)
    {
        int[][] withoutRow = removeRow(mat, row);//removes row
        return removeCol(withoutRow, col);//removes column
    }
    
    public static boolean toBeChanged(int r, int c, String[][] grid)
    {
        if(!grid[r][c].equals("O"))//checks if the point is not an o
        {
            return false;
        }
        if(r == 0 || c == 0)//checks if row or column is zero
        {
            return true;
        }
        return !grid[r - 1][c].equals("O") || !grid[r][c - 1].equals("O");//checks if the left or above the point is an o
    }
    public static String[][] change2DArray(String[][] grid)
    {
        String[][] out = new String[grid.length][grid[0].length];//create array with same length as grid
        for(int r = 0; r < out.length; r++)//row loop
        {
            for(int c = 0; c < out[0].length; c++)//column loop
            {
                if(toBeChanged(r, c, grid))//check if it needs to be changed
                {
                    out[r][c] = "#";//add #
                }
                else
                {
                    out[r][c] = grid[r][c];//do not change anything
                }
            }
        }
        return out;
    }
    // Method to capitalize letters a,h,j, and r
    // Replaces all other letters with -
    public static char[][] soDramatic(char[][] lets)
    {
        char[][] out = new char[lets.length][lets[0].length];// createsa new array with the same length as lets
        for(int r = 0; r < lets.length; r++)//row loop
        {
            for(int c = 0; c < lets[0].length; c++)//column loop
            {
                if(lets[r][c] == 'a' || lets[r][c] == 'h' || lets[r][c] == 'j' || lets[r][c] == 'r' )//finds the letters
                {
                    out[r][c] = Character.toUpperCase(lets[r][c]);// add the capital letters to the new array
                }
                else
                {
                    out[r][c] = '-';//add the dashes to the new array
                }
            }
        }
        return out;
    }
    // Method to reverse a 2D array's columns
    public static int[][] reverseColMajor(int[][] mat)
    {
        int[][] out = new int[mat.length][mat[0].length];//create new array with same length as mat
        int rCount = 0;//counter for index of row in new array
        for(int r = mat.length - 1; r >= 0; r--)
        {
            int cCount = 0;//counter for index of column in new array
            for(int c = mat[0].length - 1; c >= 0; c--)
            {
                out[rCount][cCount] = mat[r][c];
                cCount++;
            }
            rCount++;
        }
        return out;
    }
    public static int[] get5x5At(int[][] grid, int row, int col)
    {
        //Initialize minimum and maximum row
        int minRow = 0;
        int maxRow = grid.length - 1;
        int minCol = 0;
        int maxCol = grid[0].length - 1;
        //if statements to check if row is on the edges
        if(row - 2 > 0)
        {
            minRow = row - 2;
        }
        if(col - 2 > 0)
        {
            minCol = col - 2;
        }
        if(row + 2 < maxRow)
        {
            maxRow = row + 2;
        }
        if(col + 2 < maxCol)
        {
            maxCol = col + 2;
        }
        int[] out = new int[(maxRow - minRow + 1) * (maxCol - minCol + 1)];//1D array with the size of the specified 5x5 area
        int count = 0;//counter for index of new array
        for(int r = minRow; r <= maxRow; r++)//row loop
        {
            for(int c = minCol; c <= maxCol; c++)//column loop
            {
                out[count] = grid[r][c];
                count++;
            }
        }
        return out;
    }
    // contains helper method
    public static boolean contains(int[] arr, int num)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == num)
            {
                return true;
            }
        }
        return false;
    }
    //checks if each row has no duplicate numbers 1-9
    public static boolean checkRow(int[][] puzzle, int currRow)
    {
        int[] row = new int[puzzle.length];//1d array of the row in puzzle
        for(int c = 0; c < puzzle.length; c++)//loops through puzzle
        {
            if(!contains(row, puzzle[currRow][c]))//checks if the new row array already contains that number
            {
                row[c] = puzzle[currRow][c];//adds that number to the row array
            }
            else return false;
        }
        return true;
    }
    //checks if each column has no duplicate numbers 1-9
    public static boolean checkCol(int[][] puzzle, int currCol)
    {
        int[] col = new int[puzzle[0].length];//1d array of the column in puzzle
        for(int r = 0; r < puzzle[0].length; r++)//loops through puzzle
        {
            if(!contains(col, puzzle[r][currCol]))//checks if the new column array already contains that number
            {
                col[r] = puzzle[r][currCol];//adds that number to the column array
            }
            else return false;
        }
        return true;
    }
    //checks 3x3 sudoku board
    public static boolean check3x3(int[][] puzzle, int currRow, int currCol)
    {
        int[] nums = new int[9];
        for(int r = currRow; r <= currRow + 2; r++)//row loop
        {
            for(int c = currCol; c <= currCol + 2; c++)//column loop
                {
                    if(!contains(nums, puzzle[r][c]))//checks if the new array already contains that number
                    {
                        nums[r] = puzzle[r][c];
                    }
                else return false;
                }
        }
        return true;
    }
    //checks entire 9x9 sudoku board
    public static boolean checkPuzzle(int[][] puzzle)
    {
        for(int r = 0; r < puzzle.length; r++)//row loop
        {
            if(!checkRow(puzzle, r))//checks if each row has no duplicate numbers 1-9
            {
                return false;
            }
            for(int c = 0; c < puzzle[0].length; c++)//column loop
            {
                if(!checkCol(puzzle, c))//checks if each column has no duplicate numbers 1-9
                {
                    return false;
                }
                if(r % 3 == 0 && c % 3 == 0)// checks every 3 rows and 3 columns
                {
                    if(!check3x3(puzzle, r, c))//checks if 3x3 has no duplicate numbers 1-9
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}