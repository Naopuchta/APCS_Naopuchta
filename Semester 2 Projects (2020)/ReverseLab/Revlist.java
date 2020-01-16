
/**
 * Write a description of class ReverseList here.
 *
 * @author (Naomi)
 * @version (a version number or a date)
 */

import java.util.*;
public class Revlist
{
    private ArrayList<String> Stringlist = new ArrayList<String>();
    private ArrayList<String> rl = new ArrayList<String>();
    
    public void RevList(){
        Stringlist.add("Tommy");
        Stringlist.add("Jacob");
        Stringlist.add("Molly");
        Stringlist.add("Ethen");
        Stringlist.add("Vianne");
        System.out.println(Stringlist);
        rl = reverseL();
        System.out.print(rl);
    }
    
    public static void main(String[] arrs){
        Revlist rl = new Revlist();
        rl.RevList();
    }
    
    public ArrayList<String> reverseL(){
        ArrayList<String> temp = new ArrayList<String>();
        int n = Stringlist.size() - 1;
        for (int i = 0; i < Stringlist.size(); i++){
            temp.add(Stringlist.get(n-i));
        }
        return temp;
    }
}
