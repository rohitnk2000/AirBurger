package src;
import java.util.Scanner;

import javax.swing.*;

public class AirBurger extends JFrame
{
    static double cashEarned;
    static Order o;
    public AirBurger() throws Exception
    {
        o = new Order();
        this.getContentPane().add(o);
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 700);
        this.setLocationRelativeTo(null);
        this.setTitle("AirBurger");
        this.setResizable(false);
        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( "Username:" );
        Scanner scan = new Scanner( System.in );
        String username = scan.nextLine();
        FileReaderAndWriter frw = new FileReaderAndWriter(username);

        frw.read(
            "/Users/appx/Dropbox/workspaceAPCS/AirBurger1/src/Users.txt" );
        frw.login();
        try
        {
            new AirBurger();
            //cashEarned = o.cash;
        }
        catch ( Exception e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        while(o.gameInProgress){
            System.out.print("");
            
        }
        //System.out.println("here");
        frw.changeScore( o.cash );

        frw.write();
        
        
        
    }
}
