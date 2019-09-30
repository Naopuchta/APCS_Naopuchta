
/**
 * Scanner tester
 *
 * @author (eettlin)
 * @version (924)
 */

import java.util.Scanner;
public class ScannerTest{
    
    
    public void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            // add in where it links them to the other person
            Person.fullName = inputStr;
            System.out.println(inputStr);
            Person.parseName();
        }
        
        
    }
}
