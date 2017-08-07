package Cool303Package;
import java.awt.Color;

import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

	/**
	 * One of the package themes, with no curvature and color scheme of Light Blue and White
	 */
public class Winter implements Cool303theme {
	
	/**
	 * This method is to be implemented to return First color pallet of the theme used by the top frame
	 * @return first color of the color scheme
	 */
	public Color getColorMain(){
		Color winter = new Color(143,143,255);
		return winter;
	}
	
	/**
	 * This method return Second color pallet of the theme used by components 
	 * @return Second color of the color scheme
	 */
	public Color getColorSecond(){
		Color winter2 = new Color(185,200,239);
		return winter2;
	}
	
	/**
	 * This method  return First color pallet of the theme used by the top frame
	 * @return int value of the curvature for the components and the frame.
	 */
	public int getCurve(){
		return 0;
	}

}

