package interfaceGraphique;

import java.awt.Color;

public class Couleur {
	private static final Color colMin = new Color(150,  35, 55);
	private static final Color colMoy = new Color(220, 180, 10);
	private static final Color colMax = new Color( 90, 170, 50);
	
	
	public static Color getBlendedColor (float percentage) {
		if (percentage < 50) return interpolate(colMin, colMoy, percentage / (float) 50) ;
		else return interpolate(colMoy, colMax, (percentage - 50) / (float) 50) ;
	}
	
	private static Color interpolate(Color c1, Color c2, float fraction) {
		float r = c1.getRed()   + (c2.getRed()   - c1.getRed())   * fraction;
		float b = c1.getBlue()  + (c2.getBlue()  - c1.getBlue())  * fraction;
		float g = c1.getGreen() + (c2.getGreen() - c1.getGreen()) * fraction;
		
		return new Color((int) r, (int) g, (int) b);
	}
}
