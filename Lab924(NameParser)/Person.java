
/**
 * Write a description of class Person here.
 *
 * @author (Naomi Puchta)
 * @version (924)
 */
public class Person 
{
    // instance variables - replace the example below with your own
    String fullName = "John Adams";
    String fname, mname, lname;
    int si; 
    int si2;

    /**
     * Constructor for objects of class Person
     */
    public int parseName(String fullName){
        // checks to see where the spaces are 
        si = fullName.indexOf(" ");
        // will print a different position if there are multiple spaces 
        si2 = fullName.lastIndexOf(" ");
        // asking if there is a space in the string, if not it will check for commas  
        if(si != -1){
            if(si == si2){

            }
            else{

            }   
        }
        return 5;
    }
}
