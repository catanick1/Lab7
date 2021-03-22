//created new file "Counter.java"
//add all the imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//declare instance variable
public class Counter implements ActionListener 
{
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

//counter constor
 Counter() 
 {
   //declare & initialize, set the layout, set frame size
   JFrame frame = new JFrame("Let's Count");
   frame.setLayout(new FlowLayout());
   frame.setSize(200,110);

   //declare and initialize JButton
   JButton left = new JButton("Left");
   JButton right = new JButton("Right");

   int leftCount = 0;
   int rightCount = 0;

   left.addActionListener(this);
   right.addActionListener(this);

  // initialize labels
   leftLabel = new JLabel ("Count: " +leftCount);
   rightLabel = new JLabel ("Count: "+rightCount);
  
  //declare and initialize reset button
   JButton reset = new JButton("Reset");
   reset.addActionListener(this);

    //add all of the objects in order of LLabel, RLabel, L , Rbutton, reset   
    frame.add(left);
    frame.add(right);
    frame.add(leftLabel);
    frame.add(rightLabel);
    frame.add(reset);

    frame.setVisible(true);
  }

    //actionPerformed method just like the buttonDemo
    //if left, increase left count
    //else if right, increase right count
    //else if reset, reset to zero
    public void actionPerformed(ActionEvent ae) 
    {
      if(ae.getActionCommand().equals("Left"))
      {
        leftCount++;
        leftLabel.setText("Count: " + leftCount);
      }

      else if(ae.getActionCommand().equals("Right"))
      {
        rightCount++;
        rightLabel.setText("Count: " + rightCount);
      }

      else 
      {
        rightCount = 0;
        leftCount = 0;
        leftLabel.setText("Count: " + leftCount);
        rightLabel.setText("Count: " +rightCount);
      }
    }
   }
  