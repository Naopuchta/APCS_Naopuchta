
/**
 * This is code written down from paper used in class.
 *
 * @author (Naomi Puchta)
 * @version (8/23)
 */
public class Pumpkin
{
    // instance variables - replace the example below with your own
    private double rad; // this is a declare 
    private int id;

    /**
     * Constructor for objects of class Pumpkin
     */
    public Pumpkin(double r, int id){
        rad = r; 
        this.id = id;
    }

    public double getRadius(){
        return rad; 
    }
    
    public static void main(String[] args){
        Pumpkin p1= new Pumpkin (3.4,12);
        Pumpkin p2= new Pumpkin (7.6,13);
        System.out.println("The radius of pumpkin 2 is "+p2.getRadius());
    }
}
