import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConSurplus extends JPanel
{
  int counter = 1;

  public ConSurplus()
  {      
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) { 
        
        int relativeX = e.getX();
        int relativeY = e.getY();
        
        System.out.println (relativeX + " " + relativeY);
        
        if (relativeX >= 832 && relativeX <= 916 && relativeY >= 548 && relativeY <= 601 && counter != 4 && counter != 6) //Next
        {
            counter++;
            repaint();
        }
        
        if (counter == 4) //Mission 1
        {          
          
          //Insert math code here for selling price
          
          if (relativeX >= 601 && relativeX <= 868 && relativeY >= 257 && relativeY <= 304) //First choice
          {
            //if answer is correct --> output a textbox telling them they are correct, counter++, repaint();
            //else if answer is incorrect --> output a textbox telling them they are incorrect, Driver.changeScreens("Fired");
          }
          else if (relativeX >= 601 && relativeX <= 868 && relativeY >= 336 && relativeY <= 382) //Second choice
          {
            //same as above
          }
          else if (relativeX >= 601 && relativeX <= 868 && relativeY >= 417 && relativeY <= 465) //Third choice
          {
            //same as above
          }
          else if (relativeX >= 601 && relativeX <= 868 && relativeY >= 498 && relativeY <= 545) //Last choice
          {
            //same as above
          }
        }
        else if (counter == 6) //Mission 2
        {
          
          //Insert math code here for calculating the integral
          
          if (relativeX >= 601 && relativeX <= 868 && relativeY >= 257 && relativeY <= 304) //First choice
          {
            //if answer is correct --> output a textbox telling them they are correct, Driver.changeScreens("Raise");
            //else if answer is incorrect --> output a textbox telling them they are incorrect, Driver.changeScreens("Fired");
          }
          else if (relativeX >= 601 && relativeX <= 868 && relativeY >= 336 && relativeY <= 382) //Second choice
          {
            //same as aboveem they are incorrect, Driver.changeScreens("Fired");
          }
          else if (relativeX >= 601 && relativeX <= 868 && relativeY >= 417 && relativeY <= 465) //Third choice
          {
            //same as above
          }
          else if (relativeX >= 601 && relativeX <= 868 && relativeY >= 498 && relativeY <= 545) //Last choice
          {
            //same as above
          }
        }        
      } 
    }); 
  }
  
  public void paintComponent (Graphics g)
  {
    MediaTracker tracker = new MediaTracker (new Frame ());    
    Image conSurplus = Toolkit.getDefaultToolkit ().getImage ("Backgrounds/ConSurplus" + counter + ".png");
    tracker.addImage (conSurplus, 0); 
    g.drawImage (conSurplus, 0, 0, null);
    g.setFont(new Font("Times New Roman", Font.PLAIN, 25));
    g.setColor (Color.red);
    
    if (counter == 1)
    {
      g.drawString ("Equation", 312, 307); //output the equation of the demand curve onto the screen
    }
    else if (counter == 2)
    {
      g.drawString ("$Value", 320, 315); //output the sales level onto the screen
    }
    else if (counter == 4)
    {
      g.drawString ("Equation", 260, 350); //output the equation of the demand curve
      g.drawString ("Sales level", 260, 447); //output the sales level
      g.drawString ("Option 1", 677, 289); //option 1
      g.drawString ("Option 2", 677, 368); //option 2
      g.drawString ("Option 3", 677, 451); //option 3
      g.drawString ("Option 4", 677, 533); //option 4
    }
    else if (counter == 6)
    {
      g.drawString ("Equation", 260, 350); //output the equation of the demand curve
      g.drawString ("Sales level", 260, 417); //output the sales level
      g.drawString ("Selling price", 260, 477); //output the selling price
      g.drawString ("Option 1", 677, 289); //option 1
      g.drawString ("Option 2", 677, 368); //option 2
      g.drawString ("Option 3", 677, 451); //option 3
      g.drawString ("Option 4", 677, 533); //option 4
    }
    repaint();
  }
}