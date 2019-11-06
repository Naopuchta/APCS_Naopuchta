
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
    String fullName;
    String lastName;
    int stuNumber;
    
    // for the while loops 
    int numbering;
    /**
     * Constructor for objects of class StudentList
     */
    public StudentList(String inputStr)
    {
        option = Integer.parseInt(inputStr);
        
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
                System.out.println("Please iput the student's name.");
            }
            addStudent(fullName);
        }
        else if(option == 2){
            deleteStudent(lastName);
            deleteStudent(stuNumber);
        }
        else if(option == 3){
            editStudentList(lastName);
            editStudentList(stuNumber);
        }
        else if(option == 4){
            clearList();
        }
        else if(option == 5){
            printList();
        }
        else if(option == 6){
            printStudent(lastName);
            printStudent(stuNumber);
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
