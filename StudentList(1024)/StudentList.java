
/**
 * Write a description of class StudentList here.
 *
 * @author (Naomi Puchta)
 * @version (10/25)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList
{
    
    // instance variables - replace the example below with your own
    // String option;
    int option;
    // the full name inputted 
    String fullName;
    // the name logged and recalled 
    String lastName;
    // will pick specific options back and forth for whether using a name or number (etc)
    int individualOpt;
    // will be the assigned ID for 
    int stuNumber;
    String option2;
    
    // for the while loops 
    int numbering;
    /**
     * Constructor for objects of class StudentList
     */
    public StudentList(String inputStr)
    {
        option = Integer.parseInt(inputStr);
        Scanner kb2 = new Scanner(System.in);
        if(option == 1){
            System.out.println("");
            System.out.println("You have chosen for me to input a student into the list..");
            // Inputting the name
            // 1. Last, First 
            // 2. Last, First Middle 
            // 3. First Last 
            // 4. First Middle Last 
            numbering = 0; 
            while(numbering != 1){
                System.out.println("Last, First");
                System.out.println("Last, First Middle");
                System.out.println("First Last");
                System.out.println("First Middle Last");
                System.out.println("");
                System.out.println("Please iput the student's name in one of the formats.");
                // this will be where you check for which format.. 
                option2 = kb2.nextLine();
            }
            addStudent(fullName);
        }
        else if(option == 2){
            //create a while statement and have the student pick out whether they want
            // to using the student's last name or the student's number..
            while(numbering != 1){
                // String option2 = kb2.nextline();
                individualOpt = Integer.parseInt(option2);
            
            }
            if(individualOpt == 1){
                deleteStudent(lastName);
            }
            if(individualOpt == 2){
                deleteStudent(stuNumber);
            }
        }
        else if(option == 3){
            
            // the option to see whether the user wants to use the name or number..
            if(individualOpt == 1){
                editStudentList(lastName);
            }
            if(individualOpt == 2){
                editStudentList(stuNumber);
            }
        }
        else if(option == 4){
            clearList();
        }
        else if(option == 5){
            printList();
        }
        else if(option == 6){
            // the option to see whether the user wants to use the name or number..
            if(individualOpt == 1){
                printStudent(lastName);
            }
            if(individualOpt == 2){
                printStudent(stuNumber);
            }
        }
        else if(option == 7){
            SortStudents(lastName);
        }
    }
    
    public void addStudent (String fullName){
        System.out.println("1");
    }
    
    public void deleteStudent(String lastName){
        System.out.println("2");
    }
    
    public void deleteStudent(int stuNumber){
        System.out.println("2");
    }
    
    public void editStudentList(String lastName){
        System.out.println("3");
    }
    
    public void editStudentList(int stuNumber){
        System.out.println("3");
    }
    
    public void clearList(){
        System.out.println("4");
    }
    
    public void printList(){
        System.out.println("5");
    }
    
    public void printStudent(String lastName){
        System.out.println("6");
    }
    
    public void printStudent(int stuNumber){
        System.out.println("6");
    }
    
    public void SortStudents(String lastName){
        System.out.println("7");
    }
    
}
