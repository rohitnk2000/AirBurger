package src;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.Timer;


public class GameGUI extends JPanel implements ActionListener
{
    Timer t = new Timer( 5, this );

    int a = 0;

    int add = 2;

    public GameGUI()
    {
        t.start();
    }
    
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        Graphics2D ga = (Graphics2D)g;
        ga.fillRect( 270, a, 50, 30 );
        
    }


    public void actionPerformed( ActionEvent e )
    {

        if ( a < 0)
        {
            add = -add;
        }
        else if(a > 830)
        {
            add = 0;
        }
        a = a + add;
        repaint();
        
    }


    public static void main( String args[] )
    {
        GameGUI c = new GameGUI();
       
        JFrame f = new JFrame();
       // f.setLayout(new FlowLayout());
      
        Bun b = new Bun();
        f.setSize( 500, 900 );
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setVisible( true );
        f.add( b );
        f.add(c);
       
        
   
 
   

    }
}
