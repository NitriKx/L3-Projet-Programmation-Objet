package individu;

import interfaceGraphique.IAfficheImage;

/**
 * Un {@link Barbare} a la configuration suivante :
 * <ul>
 * <li><b>Force :</b> 40</li>
 * <li><b>Défense :</b> 10</li>
 * <li><b>Esquive :</b> 20</li>
 * <li><b>Inventaire :</b> 30</li>
 * </ul>
 */
public class Barbare extends Personne implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8067111339199337973L;

	/**
	 * Constructeur Barbare
	 */
	public Barbare() {
		super("T5Barbare", 40, 10, 20, 30);
	}

	/**
	 * retourne l'image associée au barbare
	 */
	public String getPictureFileName() {
		return "barbare.png";
	}
	
}
