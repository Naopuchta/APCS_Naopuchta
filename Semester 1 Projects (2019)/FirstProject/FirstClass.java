
/**
 * Write a description of class FirstClass here.
 *
 * @author (Naomi Puchta)
 * @version (8/15)
 */
public class FirstClass
{
    // instance variables - replace the example below with your own
    private static int n;
    /**
     * Constructor for objects of class FirstClass
     */
    public FirstClass()
    {
       
    }                                             

    //this is the main method
    //public static void main(String[] args){
       // System.out.print("hello world");   
    //}
    
    public static void printName(String name, int n){
     System.out.print("hello there, " + name + "   " + n );
    
    }
    
    public static void main(){
     n = 7;
     printName("Tom", n); // <-- this is a method call  
    }
}

