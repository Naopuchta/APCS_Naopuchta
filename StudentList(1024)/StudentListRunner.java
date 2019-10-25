
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
    while(!inputStr.equals("quit")){
        System.out.println("Welcome to the Student List Project");
        System.out.println("Type in what you would like me to do.");
        System.out.println("[Add Student to List]");
        System.out.println("[Delete Student From List]");
        System.out.println("[Edit Student List]");
        System.out.println("[Clear List]");
        System.out.println("[Print List]");
        System.out.println("[Print Student]");
    }
}
}
