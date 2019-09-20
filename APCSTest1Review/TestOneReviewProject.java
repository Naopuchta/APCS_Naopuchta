
/**
 * Write a description of class TestOneReviewProject here.
 *
 * @author (Naomi Puchta)
 * @version (912) */
public class TestOneReviewProject
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TestOneReviewProject
     */
    public TestOneReviewProject()
    {
        // 1. Declare a boolean variable named test and initalize it with an appropriate value.
        //  A. Boolean test = 7;
        //      Answer: this WILL NOT work as 7 is not true or false
        
        //  B. boolean test == true; 
        //      Answer: this WILL NOT work because of the double equal signs. It is not assigning. 
        
        //  C. int x = 7.23;
        //      Answer: this WILL NOT work because 7.23 is not an int, it is a double. 
        
        //  D. int val = 7/12.0;
        //      Answer: this WILL NOT work because of 12.0, there will be a lossy error. 
        
        //  E. Double num1 = num2%3;
        //      Answer: this will probably not work because the answer will not give a double. 
        
        /* 2. Given a class(with or without parameters), declare and initialize an object for 
        // that class
        */
        //  According to the code above, create a pumpkin object with an initial value of 3.
        //      Answer: Pumpkin p = new Pumpkin(3,2.2);
        
        // 3. Write a class with instance variables, constructor and methods. 
        
        // public class Numbers{
            // int x = 0; 
            // int numbers = 12;
            // int sum = 0;
            // Public int numbers(x, numbers){
                // multiply(x,numbers);
            // Public int multiply(x, numbers){
                // sum = x * 12;
            //}
        //}
        
        // 4. Use interger division and modular division to manipulate the digits of an interger.
        //  Ex 1: Write an algorithm that uses a while loop and interger division. 
        int n = 0;
        int count = 0;
        int numbers = 12345;
        String numbers2 = "12345";
        int numbers3 = numbers2.length();
        while(n != numbers){
            numbers = numbers / 10;
            count = count + 1; 
        } 
        count = 0; 
        //for(int i = 0; i < numbers3; i++){
        //    count = count + numbers2[i]; 
        //}
        
        // 5. Create a sum method that will return the sum of digits in an interger of one or more digits
        // Same thing here! 
        //for(int i = 0; i < numbers3; i++){
        //    count = count + numbers2[i]; 
        //}
        
        // 6. Create a simple calc methods
        int a = 2;
        int b = 3;
        int sum = 0; 
        sum = a + b; 
        sum = a * b;
        sum = a / b;
        sum = a - b; 
        
        // 7. Show the output values for a while loop
        //      Answer: num = 5 , cntrl = 1
        //          num = 5 , cntrl = 2
        //          num = 5 , cntrl = 3
        //          num = 5 , cntrl = 4
        //          num = 5 , cntrl = 5
        
        // 8. 
        
    }
}
