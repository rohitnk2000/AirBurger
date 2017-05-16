package src;
import java.lang.Object;
import java.awt.Component;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.Timer;

import java.awt.Graphics2D;

import java.util.*;


public class Bun extends JPanel implements Ingredients, ActionListener
{
    Timer d = new Timer( 5,this );

    int a = 0;

    int add = 2;

    public Bun()
    {
        d.start();
    }
    
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        Graphics2D ga = (Graphics2D)g;
        ga.fillRect( 100, a, 70, 20 );
        
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

    public void fall()
    {
    
    }
 
    public void paint( Graphics g )
    {
        g.setColor( new Color( 222,184,135 ) );
        g.fillOval( 15, 15, 75, 15 );
    }
}
