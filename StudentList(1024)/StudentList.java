
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
    String actualInput;

    // this is what I will be using to scan through the entire list 
    int rows;
    int cols;

    // for the while loops 
    int numbering;
    // not sure if this is needed 
    //String studentsList[][];
    /**
     * Constructor for objects of class StudentList
     */
    public StudentList(String inputStr)
    {
        option = Integer.parseInt(inputStr);
        Scanner kb2 = new Scanner(System.in);
        // this is creating the 2d matrix, should work 
        String[][] studentsList = new String[5][5];
        if(option == 1){
            System.out.println("");
            System.out.println("You have chosen for me to input a student into the list..");
            // Inputting the name
            // 1. Last, First 
            // 2. Last, First Middle 
            // 3. First Last 
            // 4. First Middle Last 
            numbering = 0; 
            // just a loop so that if I ever change anything to check to see if the user
            // makes an error typing or breaks it will not break the loop and break the code.
            while(numbering != 1){
                System.out.println("Last, First");
                System.out.println("Last, First Middle");
                System.out.println("First Last");
                System.out.println("First Middle Last");
                System.out.println("");
                System.out.println("Please iput the student's name in one of the formats.");
                // this will be where you check for which format.. 
                actualInput = kb2.nextLine();
                // setting the students full name to the input 
                fullName = actualInput;
                numbering = 1; 
            }
            addStudent(fullName);
        }
        else if(option == 2){
            //create a while statement and have the student pick out whether they want
            // to using the student's last name or the student's number..
            System.out.println("You have requested to remove a student from the list..");
            // making sure to set numbering to 0 each time so that there is no error if the
            // user uses the program multiple times in a row to add remove and so on. 
            numbering = 0; 
            while(numbering != 1){
                System.out.println("Please choose which method you'd like me to use to remove their profile");
                System.out.println("1. Student's Last Name");
                System.out.println("2. Student's Number ID");
                System.out.println("Type 1 or 2 when selecting an option.");
                String actualInput = kb2.nextLine();
                // this will check to see what the input is
                individualOpt = Integer.parseInt(actualInput);
                if(individualOpt == 1){
                    System.out.println("You have decided to use the student's name to remove from the list..");
                    System.out.println("Please correctly input the student's LAST name.");
                    actualInput = kb2.nextLine();
                    lastName = actualInput; 
                    // sends the last name to delete the student 
                    deleteStudent(lastName);
                    numbering = 1; 
                }
                else if(individualOpt == 2){
                    System.out.println("You have decided to use the student's number to remove from the list..");
                    System.out.println("Please correctly input the student's NUMBER ID.");
                    actualInput = kb2.nextLine();
                    // this changes the String of the student number into an integer
                    stuNumber = Integer.parseInt(actualInput);
                    // sends the student's ID number to delete the student 
                    deleteStudent(stuNumber);
                    numbering = 1; 
                }
                else{
                    System.out.println("I'm sorry but you've likely made an error in your answer.");
                    System.out.println("I'll need you to type 1 or 2.. simple");
                    System.out.println("If you'd like to exit back to the menu simply type Yes");
                    actualInput = kb2.nextLine();
                    // this makes sure that if there are any caps it will always note it is a yes
                    actualInput = actualInput.toLowerCase();
                    if(actualInput == "yes"){
                        // this sends the user back to the beginning menu
                        numbering = 1; 
                    }
                    else{
                        // this moves the user back to the menu of removing an object 
                        System.out.println("Now then..");
                        System.out.println("");
                    }
                }
            }
        }
        else if(option == 3){
            System.out.println("You have requested to edit a student from the list..");
            // always setting numbering to 0
            numbering = 0; 
            while(numbering != 1){
                System.out.println("Please choose which method you'd like me to use to edit their profile");
                System.out.println("1. Student's Last Name");
                System.out.println("2. Student's Number ID");
                System.out.println("Type 1 or 2 when selecting an option.");
                String actualInput = kb2.nextLine();
                // this will check to see what the input is
                individualOpt = Integer.parseInt(actualInput);
                // the option to see whether the user wants to use the name or number..
                if(individualOpt == 1){
                    System.out.println("You have decided to use the student's name to edit their profile..");
                    System.out.println("Please correctly input the student's LAST name.");
                    actualInput = kb2.nextLine();
                    lastName = actualInput; 
                    // sends the last name to delete the student 
                    editStudentList(lastName);
                    numbering = 1; 
                }
                if(individualOpt == 2){
                    System.out.println("You have decided to use the student's number to edit their profile..");
                    System.out.println("Please correctly input the student's NUMBER ID.");
                    actualInput = kb2.nextLine();
                    // this changes the String of the student number into an integer
                    stuNumber = Integer.parseInt(actualInput);
                    // sends the student's ID number to delete the student 
                    editStudentList(stuNumber);
                    numbering = 1; 
                }
                else{
                    System.out.println("I'm sorry but you've likely made an error in your answer.");
                    System.out.println("I'll need you to type 1 or 2.. simple");
                    System.out.println("If you'd like to exit back to the menu simply type Yes");
                    actualInput = kb2.nextLine();
                    // this makes sure that if there are any caps it will always note it is a yes
                    actualInput = actualInput.toLowerCase();
                    if(actualInput == "yes"){
                        // this sends the user back to the beginning menu
                        numbering = 1; 
                    }
                    else{
                        // this moves the user back to the menu of removing an object 
                        System.out.println("Now then..");
                        System.out.println("");
                    }
                }
            }
        }
        else if(option == 4){
            System.out.println("You have chosen to clear the list..");
            // always set numbering to 0 
            numbering = 0; 
            while(numbering != 1){
                System.out.println("Once the list has cleared it CANNOT be recovered.");
                System.out.println("You will lose all of your data.");
                System.out.println("...");
                System.out.println("Please manually type YES if you would like to clear the entire list. If not please type NO and I will return you to the menu.");
                System.out.println("Choose wisely.");
                String actualInput = kb2.nextLine();
                // this will check to see what the input is, making everything lowercase. 
                actualInput = actualInput.toLowerCase();
                if(actualInput == "yes"){
                    // this is choosing to delete the list 
                    System.out.println("Alright.. I will clear the list for you.");
                    clearList();
                }
                else if (actualInput == "no"){
                    // this is choosing not to delete the list 
                    System.out.println("You have decided not to clear the list.. I will send you back to the main menu.");
                    numbering = 1; 
                }
                else{
                    // if the user inputs anything outside of yes or no the user will be sent back rather than have an error or loop infinitely 
                    System.out.println("I do not know what you've input. Please retype your response properly.");
                    System.out.println("Resetting to the clear list menu...");
                }
            }
        }
        else if(option == 5){
            System.out.println("You have chosen to print the entire list..");
            // always set numbering to 0
            numbering = 0; 
            while(numbering != 1){
                System.out.println("If you would like to print the entire list, please confirm by typing YES.");
                System.out.println("If you would like to go back to the main menu please confirm by typing NO.");
                System.out.println("Any other answer will result in my restart and you will be prompted by the same message.");
                String actualInput = kb2.nextLine();
                // making sure everything is lower case to make sure that the user's input will be accepted
                actualInput = actualInput.toLowerCase();
                if(actualInput == "yes"){
                    // this is choosing to print the entire list
                    System.out.println("Alright.. I will print the entire list.");
                    printList();       
                }
                else if(actualInput == "no"){
                    // this is choosing not to print the entire list 
                    System.out.println("You have decided not to print the list.. I will send you back to the main menu.");
                    numbering = 1; 
                }
            }
        }
        else if(option == 6){
            System.out.println("You have requested to print a student from the list..");
            // always setting numbering to 0
            numbering = 0; 
            while(numbering != 1){
                System.out.println("Please choose which method you'd like me to use to print their profile");
                System.out.println("1. Student's Last Name");
                System.out.println("2. Student's Number ID");
                System.out.println("Type 1 or 2 when selecting an option.");
                String actualInput = kb2.nextLine();
                // this will check to see what the input is
                individualOpt = Integer.parseInt(actualInput);
                // the option to see whether the user wants to use the name or number..
                if(individualOpt == 1){
                    System.out.println("You have decided to use the student's name to print their profile..");
                    System.out.println("Please correctly input the student's LAST name.");
                    actualInput = kb2.nextLine();
                    lastName = actualInput; 
                    // sends the last name to delete the student 
                    printStudentName(lastName);
                    numbering = 1; 
                }
                if(individualOpt == 2){
                    System.out.println("You have decided to use the student's number to edit their profile..");
                    System.out.println("Please correctly input the student's NUMBER ID.");
                    actualInput = kb2.nextLine();
                    // this changes the String of the student number into an integer
                    stuNumber = Integer.parseInt(actualInput);
                    // sends the student's ID number to delete the student 
                    printStudentNumber(stuNumber);
                    numbering = 1; 
                }
                else{
                    System.out.println("I'm sorry but you've likely made an error in your answer.");
                    System.out.println("I'll need you to type 1 or 2.. simple");
                    System.out.println("If you'd like to exit back to the menu simply type Yes");
                    actualInput = kb2.nextLine();
                    // this makes sure that if there are any caps it will always note it is a yes
                    actualInput = actualInput.toLowerCase();
                    if(actualInput == "yes"){
                        // this sends the user back to the beginning menu
                        numbering = 1; 
                    }
                    else{
                        // this moves the user back to the menu of removing an object 
                        System.out.println("Now then..");
                        System.out.println("");
                    }
                }
            }
        }
        else if(option == 7){
            SortStudentsName(lastName);
        }
    }

    public void addStudent (String fullName){
        // here is where the code will split the first and last name (taken from
        // the previous student list project) 
        
        // PLACEHOLDER FOR WHERE THE NAME WILL BE PUT INTO THE LIST 
        
        
        // so starting off I would have already made a matrix list (since that is what I am using here) 
        // I first need to take all of the parameters and put them into the matrix list using a for loop
        
        // currently trying to think of a way to set up the matrix list and how to expand it 
        
        System.out.println("I have added your student to the list, enjoy.");
        System.out.println("1");
    }

    public void deleteStudent(String lastName){
        // stuck here for som reason it says it cannot find this list even though I've created one
        // this will be going however through the entire list to check to find the name
        for(int i = 0; i > studentsList.length(); i++){
            // this will check each first columb for the name 
            if(studentList[i] == lastName){
            
            }
        }
        System.out.println("I have deleted the selected student.");
        System.out.println("2");
    }

    public void deleteStudent(int stuNumber){
        System.out.println("I have deleted the selected student.");
        System.out.println("2");
    }

    public void editStudentList(String lastName){
        System.out.println("You have completed editing the student list.");
        System.out.println("3");
    }

    public void editStudentList(int stuNumber){
        System.out.println("You have completed editing the student list.");
        System.out.println("3");
    }

    public void clearList(){
        System.out.println("I have cleared the entire list. It cannot be undone now.");
        System.out.println("4");
    }

    public void printList(){
        System.out.println("I have printed the entire list for you..");
        System.out.println("5");
    }

    public void printStudentName(String lastName){
        System.out.println("I have successfully printed the selected student's number.");
        System.out.println("6");
    }

    public void printStudentNumber(int stuNumber){
        System.out.println("I have successfully printed the selected student.");
        System.out.println("6");
    }

    public void SortStudentsName(String lastName){
        System.out.println("I have successfully sorted the list.");
        System.out.println("7");
    }

    public void SortStudentsNumber(int stuNumber){
        System.out.println("I have successfully sorted the list.");
        System.out.println("8");
    }

}
