
/**
 * Write a description of class InsertSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertionSorter extends Sorter 
{

    /**
     * Constructor for objects of class InsertSort
     */
    public InsertionSorter()
    {
        super();
    }
    
    public void sort(int[] a){
        for (int i = 1; i < a.length; i++){
            for(int j = i; i > 0; j--){
                // Swapping Code +++++++++
                if(a[j] < a[j-1]){
                    swap(a,j,i);
                    
                    //numList.get(j) = numList.get(j-1);
                    //numList.get(j-1) = temp;
                }
                // Swapping Code +++++++++
            }
        }
    }
}
