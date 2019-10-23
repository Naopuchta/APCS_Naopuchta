
/**
 * Write a description of class SortTester here.
 *
 * @author (Naomi Puchta)
 * @version (10/24)
 */
import java.util.Objects;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SortTester
{
    // instance variables - replace the example below with your own
    int temp;
    int index;
    int smallerNumber; 
    int pick;
    ArrayList<Integer> numList = new ArrayList<Integer>();
    // just gonna note here that I haven't been able to get the code to work
    // I did some research yesterday but nothing came up close to my issue
    public void loadNumbers(int n) {
        // load an ArrayList with n random numbers between 1 and 100 
        Random rand = new Random();
        for(int j = 0; j < 10; j++){
            pick = rand.nextInt(100);
            numList.add(pick);
        }
        System.out.println("Type B for bubbleSort, I for insertSort, and S for selectionSort");
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        if(inputStr == "B"){
            bubbleSort();
        }
        else if(inputStr == "I"){
            insertSort();
        }
        else if(inputStr == "S"){
            selectSort();
        }
    }
    // this is: Bubble Sort
    public  void bubbleSort(){
        for(int i = numList.size() -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(numList.get(j) > numList.get(j+1)){
                   temp = numList.get(j);
                   numList.set(j,j+1);
                   numList.set(j+1,temp);
                   //swap(numList, j, j+1); 
                }
            }
        }
        printList();
    }
    // this is: Insert Sort 
    public void insertSort(){
        for (int i = 1; i < numList.size(); i++){
            for(int j = i; i > 0; j--){
                // Swapping Code +++++++++
                if(numList.get(j) < numList.get(j-1)){
                    temp = numList.get(j);
                    numList.set(j,j-1);
                    numList.set(j-1,temp);
                    //numList.get(j) = numList.get(j-1);
                    //numList.get(j-1) = temp;
                }
                // Swapping Code +++++++++
            }
        }
        printList();
    }
    // this is: selection sort 
    public void selectSort(){
        for(int i = 0; i < numList.size() - 1; i++){
            index = i; 
            for (int j = i + 1; j < numList.size(); j++){
                if(numList.get(j) < numList.get(index)){
                    index = j; 
                }
                // swapping code 
                smallerNumber = numList.get(index);
                numList.set(index, i);
                numList.set(i,smallerNumber);
                //numList.get(index) = numList.get(i);
                //numList.get(i) = smallerNumber;
            }
        }
        printList();
    }
    // this prints out the final sorted list 
    public void printList(){
        System.out.println(numList);
    }
}
