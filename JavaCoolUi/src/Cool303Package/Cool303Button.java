package Cool303Package;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JButton;

	/**
	 *  A new button being inherited from the JButton, using the features of the JButton 
	 *  with the customized paint method and new theme  
	 */

public class Cool303Button extends JButton{
	private Cool303theme themeOf;
	
	/**
	 * Constructs Cool303Button
	 * @param usedTheme the theme being used by the Cool303Button
	 * @param name the name given to the Cool303Button
	 */
	
	public Cool303Button(Cool303theme usedTheme,String name) { 
		this.themeOf=usedTheme;
		setText(name);
}
	
	/**
	 * Paints the Cool303Button, it is overriden from the original
	 * @param g the Graphics object used to be painted.
	 */
	
	public void paint(Graphics g){
	   	 super.paint(g);
	   	 Color color =this.getTheme().getColorSecond();
	   	  
	   	 setBackground(color);
	   	 setForeground(Color.gray);
	   	 setOpaque(false);
	   	 setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
	     g.drawRoundRect(1, 1, (getWidth() - 3),
	                (getHeight() - 3), getTheme().getCurve(), getTheme().getCurve());//10 is the radius
	     if (getModel().isArmed()) {

	    	      g.setColor(Color.lightGray);
	    	    } else {
	    	      g.setColor(getBackground());
	    	    }
	   	 
	   	 g.fillRoundRect(1, 1, (getWidth() - 3),
	                (getHeight() - 3), getTheme().getCurve(), getTheme().getCurve());
	   	 g.setColor(Color.black);
	   	 g.drawString(getText(), getWidth()/5, getHeight()/2);

	}
	
	/**
	 * gets the theme being used 
	 * @return the theme
	 */
	
    public Cool303theme getTheme(){
    	return this.themeOf;
    }

}
