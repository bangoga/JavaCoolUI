package Cool303Package;
import java.awt.Color;

	/**
	 * Allows to make your own custom theme that can be added to the package
	 */

public class customTheme implements Cool303theme{
	private Color colorMain;
	private Color colorSecond;
	private int curve;
	
	/**
	 * Constructor for a customTheme 
	 * @param main color for the color scheme of the custom theme
	 * @param second color for the color scheme of the custom theme
	 * @param curvature is the curvature user would like in their units
	 */
	
	public customTheme(Color main, Color second,int curvature){
		this.colorMain=main;
		this.colorSecond=second;
		this.curve=curvature;
	}
	
	/**
	 * This returns the first color that has been added to the custom theme.
	 * @return first color of the color scheme
	 */
	public Color getColorMain(){
		return colorMain;
	}
	
	/**
	 * This returns the second color that has been added to the custom theme.
	 * @return second color of the color scheme
	 */
	
	public Color getColorSecond(){
		return colorSecond;
	}
	
	/**
	 * This method  returns the curvature that would be applied on the units set by user
	 * @return int value of the curvature
	 */
	
	public int getCurve(){
		return curve;
	}
}
