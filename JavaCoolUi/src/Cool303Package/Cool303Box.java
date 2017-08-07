package Cool303Package;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

	/**
	 * The upper frame, over which all the other container and component are added. 
	 * can either make it of a specific size setSize() method, or will autosize according 
	 * to the size of the components by the frames.pack();
	 */

public class Cool303Box extends JFrame {
		private Cool303theme themeOf;
		
		/**
		 * Constructs Cool303Box
		 * @param usedTheme the theme being used by the  Cool303Box
		 */
		
		public Cool303Box(Cool303theme usedTheme) { 
				this.setUndecorated(true);
				this.themeOf=usedTheme;
		}
		
		/**
		 * Paints the Cool303Box, it is overriden from the orignal
		 * @param g the Graphics object used to be painted.
		 */
		
	    @Override
		public void paint(Graphics g){
	    	 super.paint(g);
	    	 Color color =this.getTheme().getColorMain();
	    	 getRootPane().setBackground(color);	
	    	 setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), getTheme().getCurve(), getTheme().getCurve()));
		}
	    
		/**
		 * gets the theme being used 
		 * @return the theme
		 */
	    
	    public Cool303theme getTheme(){
	    	return this.themeOf;
	    }

}

