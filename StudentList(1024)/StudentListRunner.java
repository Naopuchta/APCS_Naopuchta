
/**
 * Write a description of class StudentListRunner here.
 *
 * @author (Naomi Puchta)
 * @version (10/25)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentListRunner
{
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        // this creates the scanner ^^

        while(!inputStr.equals("8")){

            System.out.println("Welcome to my Student List Project");
            System.out.println("Type in the number for what you'd like me to do.");
            System.out.println("1 [Add Student to List]");
            System.out.println("2 [Delete Student From List]");
            System.out.println("3 [Edit Student List]");
            System.out.println("4 [Clear List]");
            System.out.println("5 [Print List]");
            System.out.println("6 [Print Student]");
            System.out.println("7 [Sort Students]");
            System.out.println("8 [Quit Program]");

            inputStr = kb.nextLine();

            StudentList studentl = new StudentList(inputStr);
        }
        System.out.println("");
        System.out.println("You have quit my program.");
    }
}
