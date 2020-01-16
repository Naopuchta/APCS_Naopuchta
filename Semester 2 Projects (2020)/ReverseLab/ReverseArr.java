
/**
 * Write a description of class ReverseArr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseArr
{
    private String[] Stringlist = new String[5];
    private String[] rl = new String[5];
    
    public void RevList(){
        Stringlist[0] = "Tommy";
        Stringlist[1] = "Jacob";
        Stringlist[2] = "Molly";
        Stringlist[3] = "Ethen";
        Stringlist[4] = "Vianne";
        System.out.println(Stringlist);
        rl = reverseL();
        System.out.print(rl);
    }
    
    public static void main(String[] arrs){
        Revlist rl = new Revlist();
        rl.RevList();
    }
    
    public String[] reverseL(){
        String[] temp = new String[5];
        int n = Stringlist.length - 1;
        for (int i = 0; i < Stringlist.length; i++){
            temp[i] = Stringlist[n-i];
        }
        return temp;
    }
}
