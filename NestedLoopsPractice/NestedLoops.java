
/**
 * Write a description of class NestedLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoops
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class NestedLoops
     */
    public NestedLoops()
    {
        System.out.println("Here is A.");
        System.out.println();
        for(int i = 1; i < 6; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
        }
        System.out.println("Here is B.");
        System.out.println();
        for(int i = 5; i > 1; i--){
            for(int j = 8; j > 0; j--){
                System.out.print(i);
            }
        }
        System.out.println("Here is C.");
        System.out.println();
    }
}
