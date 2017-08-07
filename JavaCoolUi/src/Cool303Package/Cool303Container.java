package Cool303Package;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

	/**
	 * Invisible area that adds bounds to the Cool303Box, allowing components to be added
	 */
public class Cool303Container extends JPanel {	
	private Cool303theme themeOf;
	
	
	/**
	 * Constructs Cool303Container
	 * @param usedTheme the theme being used by the Container
	 */
	
	public Cool303Container(Cool303theme usedTheme){
		themeOf=usedTheme;
	}
	
	
	
	/**
	 * Paints the container, it is overriden from the orignal
	 * @param g the Graphics object used to be painted.
	 */
	
	@Override
	public void paint(Graphics g){
   	 super.paint(g);
   	 Color color =this.getTheme().getColorMain();
   	 setBackground(color);
	}
	
	/**
	 * gets the theme being used 
	 * @return the theme
	 */
    public Cool303theme getTheme(){
    	return this.themeOf;
    }
}
