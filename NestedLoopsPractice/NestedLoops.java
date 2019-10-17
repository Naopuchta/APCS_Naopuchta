
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
    }
}
