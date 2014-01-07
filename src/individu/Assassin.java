package individu;

import equipement.Caracteristiques;

public class Assassin extends Personnage {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6038634355196587821L;

	/**
	 * Constructeur Assassin
	 */
	public Assassin() {
		super("Assassin", 100, new Caracteristiques(150, 10, 6, 2, 15), 10);
	}
	
	/**
	 * retourne l'image associée à l'assassin
	 */
	public String getPictureFileName() {
		return "assassin.png";
	}
	
}
