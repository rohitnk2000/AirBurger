import javax.swing.*;
public class AirBurger extends JFrame
{

    public AirBurger () throws Exception
    {
	this.getContentPane ().add (new Order ());

	this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	this.setSize (800, 700);
	this.setLocationRelativeTo (null);
	this.setTitle ("AirBurger");
	this.setResizable (false);
	this.setVisible (true);

    }


    public static void main (String[] args) throws Exception
    {
	new AirBurger ();
    }
}