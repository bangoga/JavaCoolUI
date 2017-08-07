import java.awt.*;
import Cool303Package.*;
import javax.swing.*;
import java.awt.geom.RoundRectangle2D;

import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
	
	/**
	 * The test class, testing the package Cool303.
	 */

public class testApp {
	
	public static void main(String[]args){
		
		Cool303theme pastel = new Pastel();
		Cool303Box frames = new Cool303Box(pastel);

		
		Cool303Container c = new Cool303Container(pastel);
		c.setLayout((new GridLayout(3,2,2,2)));
		for(int i =0; i<20;i++){
		String Label = ""+i;
		Cool303Button button= new Cool303Button(pastel,Label);
		button.setPreferredSize(new Dimension(30,30));
		c.add(button,BorderLayout.SOUTH);
		}
		Cool303Button exit = new Cool303Button(pastel,"exit");
		exit.setPreferredSize(new Dimension(30,30));
		exit.setBackground(Color.RED);
		c.add(exit,BorderLayout.SOUTH);	
		
		frames.setLayout(new GridLayout(1, 3,100,100));
		frames.add(c,BorderLayout.WEST);
		frames.pack();
		
		//frames.setSize(300, 200); uncomment to get specific size 
		
		frames.setVisible(true);
	}
	
		
	}
	

