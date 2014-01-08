package individu;

import interfaceGraphique.IAfficheImage;


public class Assassin extends Personne implements IAfficheImage  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6038634355196587821L;

	/**
	 * Constructeur Assassin
	 */
	public Assassin() {
		super("T5Assassin", 30, 10, 40, 20);
	}
	
	/**
	 * retourne l'image associée à l'assassin
	 */
	public String getPictureFileName() {
		return "assassin.png";
	}
	
}
