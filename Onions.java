package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.Timer;


public class Onions implements Ingredients
{
    
    public void fall()
    {
    
    }
    
    public void paint( Graphics g )
    {
        g.setColor( Color.yellow );
        g.drawOval( 5, 15, 50, 75 );
    }
}
