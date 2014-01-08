package individu;

import interfaceGraphique.IAfficheImage;


public class Barbare extends Personne implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8067111339199337973L;

	/**
	 * Constructeur Barbare
	 */
	public Barbare() {
		super("T5Barbare", 100, 0, 0, 0);
	}

	/**
	 * retourne l'image associée au barbare
	 */
	public String getPictureFileName() {
		return "barbare.png";
	}
	
}
