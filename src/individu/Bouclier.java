package individu;

import interfaceGraphique.IAfficheImage;
/**
 * Le {@link Bouclier} donnent un bonus de 20 de défense.
 */
public class Bouclier extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5457212606111593813L;

	/**
	 * Constructeur bouclier
	 */
	public Bouclier() {
		super("T5Bouclier", 0, 20, 0, 0, 0);
	}

	@Override
	public String getPictureFileName() {
		return "bouclier.png";
	}
	
}
