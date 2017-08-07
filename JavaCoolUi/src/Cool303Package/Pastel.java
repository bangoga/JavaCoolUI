package Cool303Package;
import java.awt.Color;

import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.border.Border;

	/**
	 * One of the package themes, with curvature and color scheme of Light pink and yellow
	 */

public class Pastel implements Cool303theme{
	
	/**
	 * This method is to be implemented to return First color pallet of the theme used by the top frame
	 * @return first color of the color scheme, pink
	 */
	
	public Color getColorMain(){
		Color pastel = new Color(237,192,255);
		return pastel;
	}
	
	/**
	 * This method is to be implemented to return Second color pallet of the theme used by the top frame
	 * @return second color of the color scheme , yellow
	 */
	public Color getColorSecond(){
		Color pastel = new Color(255,245,187);
		return pastel;
	}
	
	/**
	 * This method  returns the curvature that would be applied on the units 
	 * @return int value of the curvature for the components and the frame making it bubbly.
	 */
	
	public int getCurve(){
		return 20;
	}

}
