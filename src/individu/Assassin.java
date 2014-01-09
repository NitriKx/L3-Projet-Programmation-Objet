package individu;

import interfaceGraphique.IAfficheImage;

/**
 * Un {@link Assassin} a la configuration suivante :
 * <ul>
 * <li><b>Force :</b> 30</li>
 * <li><b>Défense :</b> 10</li>
 * <li><b>Esquive :</b> 40</li>
 * <li><b>Inventaire :</b> 20</li>
 * </ul>
 */
public class Assassin extends Personne implements IAfficheImage {
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
