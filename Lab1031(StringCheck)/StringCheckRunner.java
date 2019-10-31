
/**
 * Write a description of class StringCheckRunner here.
 *
 * @author (Naomi Puchta)
 * @version (10/31)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StringCheckRunner
{
        public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Type in the number of the length of the string.");
            inputStr = kb.nextLine();
            String numberAnswer = inputStr;
            // System.out.println(inputStr); 
            if(numberAnswer != "0"){
                for(int i = 0; i < Integer.parseInt(numberAnswer); i++){
                    System.out.println("Type in what you would like for slot" + (i+1) + "out of" + numberAnswer);
                    
                }
            }
            else{
                System.out.println("Please input a string that is bigger than 0.");
            }
        }

    }
    // instance variables - replace the example below with your own
    public ArrayList<String> wordChecker(String[] str, String key){
        //

    }
    public String[] wordChecker(ArrayList<String> str, String Key){
        op;  
    }

}
