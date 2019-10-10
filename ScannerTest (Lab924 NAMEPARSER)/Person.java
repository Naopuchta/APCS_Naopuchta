
/**
 * Write a description of class Person here.
 *
 * @author (Naomi Puchta)
 * @version (924)
 */
public class Person 
{
    // instance variables - replace the example below with your own
    // John Adams is an example text while I run through the rest of the program 
    // String fullName = "John Adams";
    static String fullName;
    String fname, mname, lname;
    int si; 
    int si2;
    int checkComma;
    int format; 
    String entireName;
    int checkComma2;

    /**
     * Constructor for objects of class Person
     */
    // this will hopefully import the name over
    public Person(String fullName){
        entireName = fullName;
        parseName(entireName);
    }

    public void parseName(String fullName){
        // checks to see where the spaces are 
        entireName = fullName;
        si = entireName.indexOf(" ");
        // will print a different position if there are multiple spaces 
        si2 = entireName.lastIndexOf(" ");
        checkComma = entireName.indexOf(", ");
        checkComma2 = entireName.lastIndexOf(", ");
        // making sure that there is at least one space otherwise the program will print
        // "Incorrect Format, please try again." 
        
        // Format One "Last, First, Middle" 
        // Format Two "Last, First"
        // Format Three " First Middle Last"
        // Format Four "First Last" 
         if(si != -1){
            //checking to see if there is a comma in the string 
            if(checkComma != -1){
                // if there is only one comma it will follow format two
                if(si == si2){
                    lname = entireName.substring(0,checkComma);
                    fname = entireName.substring(checkComma + 2);
                    System.out.println(fname + " " + lname);
                } 
                // of there is more than one comma then it follows the first format 
                else{
                    lname = entireName.substring(0,checkComma);
                    fname = entireName.substring(checkComma + 2, checkComma2);
                    mname = entireName.substring(checkComma2 + 2);
                    System.out.println(fname + " " + mname + " " + lname);
                }
            }
            // if there are no commas then it will check for the other formats
            else{
                // checking to see if it follows the fourth format with only one space
                if(si == si2){
                    fname = entireName.substring(0,si);
                    lname = entireName.substring(si + 1);
                    System.out.println(fname + " " + lname);
                }
                // if there are more than two spaces then it will do the third format 
                else{
                    fname = entireName.substring(0,si);
                    mname = entireName.substring(si + 1, si2);
                    lname = entireName.substring(si2 + 1);
                    System.out.println(fname + " " + mname + " " + lname);

                }   
            }
        }
        // if it does not follow any of the formats 
        else{
                System.out.println("Please try again. That is an incorrect format.");
        }
    }
}
