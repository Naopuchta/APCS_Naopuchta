
/**
 * [][] Use your IntArrayWorker worker class and write the method that will.. [][]
 *
 *--> loadEvensOdds will load the left side of the array with even numbers and odds
 *          on the right side. 
 *
 *--> flipVertical will take the array and mirror the elements over a centerline. the result
 *          should be Odds on the left and Evens on the right. 
 *
 *
 * @author (Naomi Puchta)
 * @version (12/04/19)
 */
public class loadEvensOdds
{
    // instance variables - replace the example below with your own
    private int lValue;
    private int rValue; 
    
    /**
     * Constructor for objects of class loadEvensOdds
     */
    public loadEvensOdds()
    {
        // initialise instance variables
        int[][] arr = {{1,3,5,7,9}, {2,4,6,8,10}};
        
        // note that the array must be an even on both sides otherwise the code will break 
        
        // calls for arr to be sorted out from left to right  
        flipVertical(arr);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void flipVertical(int[][] array){
        // this is the code where the program will flip the numbers around 
        int length = array[0].length;
        // the temp or the "index values" labeled left and right for convenience 
        int lValue;
        int rValue;
        // scanning through the rows 
        for(int row = 0; row < array.length/2; row++){
            // going through the cols and halving the width so that the numbers move from
            // left to right 
            for(int col = 0; col < array[row].length; col++){
                // taking the selected row and taking a certain col value 
                //          lValue = array[row][col];
                // you want to subract by the width so that it does not reset the numbers 
                // and switch the switched values back
                
                // taking the very last value of row and assigning it to the right value of
                // the correct col 
                //          rValue = array[array.length -1 - row][col];
                
                // inputs the left current row and the right corresponding row, the current
                // col and the array so that the array can be called into swap 
                swap(row,array.length-1-row,col,array);
            }
        }
    }
    
    public void swap(int left, int right, int select, int[][]a){
        // selecting the left col value in the row 
        int temp = a[left][select];
        // setting the right col value to the left col value 
        a[left][select] = a[right][select];
        // setting the right col value to temp 
        a[right][select] = temp; 
    }
}
