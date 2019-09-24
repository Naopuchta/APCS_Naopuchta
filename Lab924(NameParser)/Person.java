
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person extends Runner
{
    // instance variables - replace the example below with your own
    String fname, mname, lname;

    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        parseName(fullName);
    }
}
