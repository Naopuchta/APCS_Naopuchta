
/**
 * This is a program which will use math to find values of a and b
 *
 * @author (Naomi Puchta)
 * @version (819)
 */
public class FirstMethod
{
    private static int x;
    private static int a;
    private static int b;
    
    public static void printValues(int a, int b, int x){
        x = a + b; 
        System.out.println("The sum of " + a + " plus " + b + " equals " + x); 
        x = 0;
        x = a - b;
        System.out.println("The remainder of " + a + " minus " + b + " equals " + x);
        x = 0;
        x = a * b; 
        System.out.println("The multiplied sum of " + a + " times " + b + " equals " + x);
        x = 0;
        x = a /(double) b;
        
        System.out.println("The quotient of " + a + " divided by " + b + " equals " + x);
        x = 0; 
        if(a > b){
            System.out.println(a + " is greater than " + b);
        } 
        else{
            System.out.println(b + " is greater than " + a);
        }
    }
    
    public static void main(){
        x = 0;
        a = 5;
        b = 9;
        printValues(a,b,x);
    }
}
