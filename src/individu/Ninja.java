package individu;

import interfaceGraphique.IAfficheImage;

/**
 * Un {@link Ninja} a la configuration suivante :
 * <ul>
 * <li><b>Force :</b> 25</li>
 * <li><b>Défense :</b> 15</li>
 * <li><b>Esquive :</b> 50</li>
 * <li><b>Inventaire :</b> 10</li>
 * </ul>
 */
public class Ninja extends Personne implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4246432800893825543L;

	public Ninja() {
		super("T5Ninja", 25, 15, 50, 10);
	}

	@Override
	public String getPictureFileName() {
		return "ninja.png";
	}
}
