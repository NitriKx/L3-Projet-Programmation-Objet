package individu;

import interfaceGraphique.IAfficheImage;

public class Boulet extends Equipement implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5623243055435677759L;

	/**
	 * Constructeur boulet
	 */
	public Boulet() {
		super("T5Boulet", 0, 0, 0, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "boulet.png";
	}

}
