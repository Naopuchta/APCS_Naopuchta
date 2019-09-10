
/**
 * Write a description of class TurtleRunner here.
 *
 * @author (Naomi Puchta)
 * @version (829)
 */
import java.awt.*;
public class TurtleRunner
{
    public static void main(){

        Turtle   t;
        
        int colorSwitch = 0; 
        int checkingColor = 0; 

        TurtleDrawingWindow win = new TurtleDrawingWindow();

        int      size, turn;

        t = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        
            t.jumpTo(0, 0);
        win.add(t);
        win.setVisible(true);
        t.penSize(3);
        size     = 300;    //logical units
        turn     = 123;    //in degree
        t.penColor(Color.red);
        for(int i = 0; i < 120; i++){ 
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            checkingColor = checkingColor + 1;
            if (colorSwitch == 0 && checkingColor == 3){
                t.penColor(Color.orange);
                colorSwitch = 1; 
                checkingColor = 0;
            }
            else if(colorSwitch == 1 && checkingColor == 3){
                t.penColor(Color.yellow);
                colorSwitch = 2;
                checkingColor = 0;
            }
            if (colorSwitch == 2 && checkingColor == 3){
                t.penColor(Color.red);
                colorSwitch = 0;
                checkingColor = 0;
            }
            //t.print(n);
        }
        t.jumpTo(50, 50);
        t.heading(0);
        size     = 200;
        t.penColor(Color.orange);
        t.penSize(2);
        for(int i = 0; i < 120; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }
        t.penSize(1);
        t.jumpTo(75, 75);
        t.heading(0);
        size     = 100;
        t.penColor(Color.yellow);
        for(int i = 0; i < 120; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }

        
        
        t.hide();

    }
}
