package Cool303Package;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

	/**
	 *Components that being added to the Cool303Container
	 */
public class Cool303Components extends JComponent{
	private Cool303theme themeOf;
	
	/**
	 * Constructs Cool303Components
	 * @param usedTheme the theme being used by the Cool303Components
	 */
	
	public Cool303Components(Cool303theme usedTheme) { 
		this.themeOf=usedTheme;
}

	/**
	 * Paints the component, it is overriden from the orignal
	 * @param g the Graphics object used to be painted.
	 */
	
	public void paint(Graphics g){
	   	 super.paint(g);
	   	 Color color =this.getTheme().getColorSecond();
	   	 g.setColor(color);
	   	 
	}
	
	/**
	 * gets the theme being used 
	 * @return the theme
	 */
	
    public Cool303theme getTheme(){
    	return this.themeOf;
    }
	
	
	
}
