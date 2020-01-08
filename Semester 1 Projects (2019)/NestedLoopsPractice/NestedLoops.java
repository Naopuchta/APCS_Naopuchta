
/**
 * Write a description of class NestedLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoops
{
    // instance variables - replace the example below with your own
    int num = 0;
    /**
     * Constructor for objects of class NestedLoops
     */
    public NestedLoops()
    {
        // this is for problem A 
        System.out.println("Here is A.");
        System.out.println();
        for(int i = 1; i < 6; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
        }
        // this is for problem B 
        System.out.println("Here is B.");
        System.out.println();
        for(int i = 5; i > 1; i--){
            for(int j = 8; j > 0; j--){
                System.out.print(i);
            }
        }
        // this is problem C
        System.out.println("Here is C.");
        System.out.println();
        for(int i = 3; i > 0; i++){
            if(num == 0){
                num = 2;
            }
            else if(num == 2){
                num = 3;
            }
            else if(num == 3){
                num = 6;
            }
            for(int j = 0; j < num; j++){

                System.out.print(num); 
            }
        }
        // this is problem D
        System.out.println("Here is D.");
        System.out.println();
        for(int i = 1; i <= 7; i++){
            // finds the total number of dashes 
            int totalDash = 8 - i; 
            for(int j = 0; j <= totalDash; j++){
                System.out.print("-");
            }
            // prints out i after the dashes 
            System.out.print(i);
            System.out.println();
        }
        // this is problem E 
        // there are a total of 6 spaces in the first line 
        for(int i = 1; i <= 7; i++){
            int totalSpace = 7 - i; 
            for(int j = 0; j <= totalSpace; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
        }
        // This is problem F
        // the center piece has 13 stars 
        // have to add by 2 every time 
        for(int i = 1; i <= 13; i = i+2){
            for(int j = 6; j <= 0; j = j = j - 2){
            
            }
        }
    }
}
