
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
    

    /**
     * Constructor for objects of class Person
     */
    // this will hopefully import the name over
    public Person(String fullName){
        parseName(fullName);
    }
    
    public void parseName(String fullName){
        // checks to see where the spaces are 
        si = fullName.indexOf(" ");
        // will print a different position if there are multiple spaces 
        si2 = fullName.lastIndexOf(" ");
        checkComma = fullName.indexOf(", ");
        // making sure that there is at least one space otherwise the program will print
        // "Incorrect Format, please try again." 
        if(si != -1){
            //checking to see if there is a comma in the string 
            if(checkComma != -1){
                // if there is only one comma it will follow format two
                if(si == si2){
                    fname = fullName.substring(0,checkComma);
                } 
                // of there is more than one space then it follows the first format 
                else{
                    fname = fullName.substring(0,checkComma);
                }
            }
            // if there are no commas then it will check for the other formats
            else{
                // checking to see if it follows the fourth format with only one space
                if(si == si2){
                    fname = fullName.substring(0,si);
                }
                // if there are more than two spaces then it will do the third format 
                else{
                    fname = fullName.substring(0,si);
                }   
            }
        }
        // if it does not follow any of the formats 
        else{
            System.out.println("Please try again. That is an incorrect format.");
        }
    }
}
