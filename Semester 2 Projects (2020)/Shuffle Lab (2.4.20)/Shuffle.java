
/**
 * Write a description of class Shuffle here.
 *
 * @author (Naomi)
 * @version (2/4/2020)
 */
// Importing an ArrayList so that I can use it throughout the program 
import java.util.*;
public class Shuffle
{ 
    ArrayList<Integer> shuffList = new ArrayList<Integer>();
    public static void main(){
        int[] nums = new int [52];
        for(int i = 0; i < 52; i++){
            nums[i] = i + 1;
        }
        Shuffle shuff = new Shuffle(nums);
    }
    // this is the Shuffle Method 
    public Shuffle(int[] s1){
        // setting this temp to copy items from s1
        // this will be the array we edit and import into the list 
        int[] temp = s1; 
        // adding all of the values into the ArrayList
        for(int i = 0; i < 52; i++){
            shuffList.add(temp[i]);
        }
        // now this is where shuffList is shuffled around 
        // goes down one each time
        for(int i = 0; i < 52; i++){
           // picking a random number between 1 and 51
           int rando = (int)Math.random()*52;
           
        }
    }
}
