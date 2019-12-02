public class IntArrayWorker
{
    /** two dimensional matrix */
    private int[][] matrix = null;

    /** set the matrix to the passed one
     * @param theMatrix the one to use
     */
    public void setMatrix(int[][] theMatrix)
    {
        matrix = theMatrix;
    }

    /**
     * Method to return the total 
     * @return the total of the values in the array
     */
    public int getTotal()
    {
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                total = total + matrix[row][col];
            }
        }
        return total;
    }

    /**
     * Method to return the total using a nested for-each loop
     * @return the total of the values in the array
     */
    public int getTotalNested()
    {
        int total = 0;
        for (int[] rowArray : matrix)
        {
            for (int item : rowArray)
            {
                total = total + item;
            }
        }
        return total;
    }

    /**
     * Method to fill with an increasing count
     */
    public void fillCount()
    {
        int numCols = matrix[0].length;
        int count = 1;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < numCols; col++)
            {
                matrix[row][col] = count;
                count++;
            }
        }
    }

    /**
     * print the values in the array in rows and columns
     */
    public void print()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                System.out.print( matrix[row][col] + " " );
            }
            System.out.println();
        }
        System.out.println();
    }

    /** 
     * fill the array with a pattern
     */
    public void fillPattern1()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; 
            col++)
            {
                if (row < col)
                    matrix[row][col] = 1;
                else if (row == col)
                    matrix[row][col] = 2;
                else
                    matrix[row][col] = 3;
            }
        }
    }
    // Activity 4: Exercise 1
    // having a bit of an issue with this one, trying to get it to connect 
    // to the tester in the other class 
    public int getCount(int val){
        int count = 0; 
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[r].length; c++){
                if(matrix[r][c] == val){
                    count++;
                }
            }
        } 
        // returning the count 
        return count;
    }
    // Activity 4: Exercise 2 
    public int getLargest(){
        int largestInt = matrix[0][0]; 
        // this checks the row
        for(int r = 1; r < matrix.length; r++){
            // this checks the column

            for(int c = 1; c < matrix[r].length; c++){
                // if there is a larger number than what was set it will take the bigger number
                if(largestInt < matrix[r][c]){
                    largestInt = matrix[r][c];
                }
            }
        }
        // returning the largest value 
        return largestInt;
    }
    // Activity 4: Exercise 3
    public int getColTotal(int column){
        // this sets the sum to 0 so that it may add up the numbers
        // column is the sum of the column you're looking for
        int sum = 0;

        for(int c = 0; c < matrix[column].length; c++){
            // this adds up each value from the row 
            sum = sum + matrix[column][c]; 
        }

        // returns the sum of the values 
        return sum;
    }
}
