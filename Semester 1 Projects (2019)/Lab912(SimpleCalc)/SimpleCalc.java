
/**
 * Write a description of class SimpleCalc here.
 *
 * @author (Naomi Puchta)
 * @version (9/12)
 */
public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private int x;
    private int num1;
    private int num2;
    private int count;
    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc()
    {
        num1 = 4;
        num2 = 3; 
        System.out.println("The first number is " + num1 + " and the second number is " + num2);
        while(x<6){
            num1 = 4;
            num2 = 3; 
            if(x==1){
                // checking for sum
                count = num1 + num2; 
                System.out.println("The sum is " + count);
            }
            if(x==2){
                // checking for substraction
                count = num1 - num2;
                System.out.println("The remainder is " +count);
            }
            if(x==3){
                // checking for multiply 
                System.out.println("The multiplied sum is " + num1 * num2); 
            }
            if(x==4){
                // checking for division
                double count = (double)num1/(double)num2;
                System.out.println("The quotient is " + count);
            }
            if(x==5){
                count = num1%num2;
                System.out.println("The modulo divide answer is " + count);
            }
            x = x + 1; 
        }
        System.out.println("The Simple Calculations lab for 9/12 is now complete!"); 
    }
}
