package Cool303Package;
import java.awt.Color;
import java.awt.Shape;

import javax.swing.border.Border;

public interface  Cool303theme {

	/**
	 * This method is to be implemented to return First color pallet of the theme 
	 * @return Color the main color
	 */
	public Color getColorMain();
	
	/**
	 * This method is to be implemented to return Second color pallet of the theme 
	 *@return Color the secondary color
	 */
	public Color getColorSecond();
	
	/**
	 * This method is to be implemented to return integer value of curvature for the units.
	 *@return int the main curvature of units  
	 */
	
	public int getCurve();
}
