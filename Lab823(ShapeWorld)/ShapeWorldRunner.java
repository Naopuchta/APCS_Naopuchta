
/**
 * Write a description of class ShapeWorldRunner here.
 *
 * @author (Naomi Puchta)
 * @version (825)
 */
public class ShapeWorldRunner
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ShapeWorldRunner
     */
    public ShapeWorldRunner()
    {
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main()
    {
        ShapeWorld shapeWorld = new ShapeWorld (300,500);
        // this is the very top of the head 
        APCSRectangle rectangle = new APCSRectangle(100,250,500,300);
        shapeWorld.addRectangle(rectangle);
        APCSRectangle rectangle1 = new APCSRectangle(100,280,500,350);
        shapeWorld.addRectangle(rectangle1);
        // this is the first part of the head to the left of the eye
        APCSRectangle rectangle2 = new APCSRectangle(50,300,150,400);
        shapeWorld.addRectangle(rectangle2);
        // this is the second part of the head to the right of the eye
        APCSRectangle rectangle3 = new APCSRectangle(270,300,550,400);
        shapeWorld.addRectangle(rectangle3);
        // this is the mouth area of the dino 
        APCSRectangle rectangle4 = new APCSRectangle(50,400,550,500);
        shapeWorld.addRectangle(rectangle4);
        APCSRectangle rectangle41 = new APCSRectangle(500,500,550,550);
        shapeWorld.addRectangle(rectangle41);
        // this is the cheek area of the dino 
        APCSRectangle rectangle5 = new APCSRectangle(50,500,150,600);
        shapeWorld.addRectangle(rectangle5);
        // this is the lower jaw area of the dino 
        APCSRectangle rectangle6 = new APCSRectangle(50,600,400,650);
        shapeWorld.addRectangle(rectangle6);
        // this is the eyeball of the dino 
        APCSRectangle rectangle7 = new APCSRectangle(200,300,230,390);
        shapeWorld.addRectangle(rectangle7);
        // this is the eye detail
        APCSRectangle rectangle8 = new APCSRectangle(200,300,230,390);
        shapeWorld.addRectangle(rectangle8);
        APCSColor white= new APCSColor(0,0,0);
    }
    
    
}
