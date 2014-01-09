package individu;

import interfaceGraphique.IAfficheImage;

/**
 * Le {@link Mineur} a la particularité de fuir les combats sauf si la personne est à
 * coté de lui quand il a moins de 15 d'attaque. <br>
 * Un {@link Mineur} a la configuration suivante :
 * <ul>
 * <li><b>Force :</b> 0</li>
 * <li><b>Défense :</b> 0</li>
 * <li><b>Esquive :</b> 0</li>
 * <li><b>Inventaire :</b> 100</li>
 * </ul>
 */
public class Mineur extends Personne implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5203397441535241145L;

	public Mineur() {
		super("T5Mineur", 0, 0, 0, 100);
	}

	@Override
	public String getPictureFileName() {
		return "mineur.png";
	}
}
