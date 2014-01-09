package individu;

import interfaceGraphique.IAfficheImage;

/**
 * Le {@link Troll} a la particularité d'avoir 10 000 000 points de vie (sauf à la
 * connexion quand il y a le contrôle de triche). <br>
 * Un {@link Troll} a la configuration suivante :
 * <ul>
 * <li><b>Force :</b> 100</li>
 * <li><b>Défense :</b> 0</li>
 * <li><b>Esquive :</b> 0</li>
 * <li><b>Inventaire :</b> 0</li>
 * </ul>
 */
public class Troll extends Personne implements IAfficheImage {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6038634355196587821L;

	private int vieGetCountdown = 1;

	/**
	 * Constructeur Troll
	 */
	public Troll() {
		super("T5Troll", 100, 0, 0, 0);
	}

	/**
	 * retourne l'image associée à l'assassin
	 */
	public String getPictureFileName() {
		return "troll.png";
	}

	@Override
	public int getVie() {
		if (vieGetCountdown > 0) {
			vieGetCountdown--;
			return super.getVie();
		}
		return 10000000;
	}

}
