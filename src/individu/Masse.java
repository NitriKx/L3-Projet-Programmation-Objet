package individu;

import interfaceGraphique.IAfficheImage;
/**
 * La {@link Masse} est un bonus de 20 d'attaque
 */
public class Masse extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3823457584835565221L;

	/**
	 * Constructeur masse
	 */
	public Masse() {
		super("T5Masse", 20, 0, 0, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "masse.png";
	}
	
}
