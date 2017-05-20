
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

//Class representing the onions
public class Onion extends Ingredients
{

    private String craft = "Onion.png";

    private int x;
    private int y;
    private int width;
    private int height;
    private boolean visible;
    //Booleans determine if its falling or stacked
    private boolean fall = true;
    private boolean stacked = false;
    private Image image;




    // Same design as the bun
    public Onion (int x, int y)
    {
	ImageIcon ii = new ImageIcon (this.getClass ().getResource ("Onions.png"));
	image = ii.getImage ();
	width = image.getWidth (null);
	height = image.getHeight (null);
	visible = true;
	this.x = x;
	this.y = y;
    }


    public int speed()
	{
		return 5;
	}

    //Method to make it fall
    public void moveAlien ()
    {
	super.moveAlien();
    }

    //Method to make it move after stacked
    public void move (int x)
    {
	this.x = x;
    }


    public  int getRandomY ()
    {
	int result = (int) (Math.random () * 6000 + 1);
	result = 0 - result;
	return result;
    }


    //Acquires random x-coordinate for falling
    public int getRandomX ()
    {
	int result = (int) (Math.random () * 700 + 1);
	return result;
    }


    //Sets the fall boolean to false
    public void stopFall()
    {
   this.fall = false;
    }


    //Stacks the topping using bun coordnates and number of toppinngs stacked
    public void stack (Bun a, int b)
    {
	this.stacked = true; //boolean to show topping is stacked

	this.x = a.getX ();
	this.y = 600 - b * 30;
    }


    //These methods return things
    public int getXA ()
    {
	return x;
    }


    public int getYA ()
    {
	return y;
    }


    public boolean isVisible ()
    {
	return visible;
    }


    public boolean isStack ()
    {
	return stacked;
    }


    public void setVisible (boolean visible)
    {
	this.visible = visible;
    }


    public Image getImage ()
    {
	return image;
    }


    //Creates Rectangle using topping bounds
    public Rectangle getBounds ()
    {
	return new Rectangle (x, y, width, height);
    }
}
