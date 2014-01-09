package interfaceGraphique;

import java.awt.Color;
/**
 * Permet de connaitre la {@link Couleur} d'une {@link Balance}
 */
public class Couleur {
	private static final Color colMin = new Color(150,  35, 55);
	private static final Color colMoy = new Color(220, 180, 10);
	private static final Color colMax = new Color( 90, 170, 50);
	
	/**
	 * 
	 * @param balance {@link Balance} comprise entre 0 et 1 (automatiquement remise à la balise la plus proche si la valeur dépasse)
	 * @return La {@link Color} correspondante à la balance donnée
	 * <ul>
	 * <li>Couleur entre <code>rouge</code> et <code>jaune</code> si la {@link Balance} est entre <code>0</code> et <code>0.5</code></li>
	 * <li>Couleur entre <code>jaune</code> et <code>vert</code> si la {@link Balance} est entre <code>0.5</code> et <code>1</code></li>
	 * </ul>
	 */
	public static Color getBlendedColor (float balance) {
		float percentage = (balance < 0) ? 0 : ((balance > 1) ? 100 : balance * 100);
		
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
