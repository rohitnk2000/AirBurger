package src;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.Timer;

import java.awt.Graphics2D;

public class Trash implements Ingredients
{
    
    public void fall()
    {
    
    }
 
    public void paint( Graphics g )
    {
        g.setColor( Color.cyan );
      
        g.fillOval( 5, 15, 50, 75 );
    }
}
