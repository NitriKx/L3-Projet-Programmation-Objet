package individu;

import interfaceGraphique.IAfficheImage;

/**
 * Un {@link Knight} a la configuration suivante :
 * <ul>
 * <li><b>Force :</b> 30</li>
 * <li><b>Défense :</b> 30</li>
 * <li><b>Esquive :</b> 10</li>
 * <li><b>Inventaire :</b> 30</li>
 * </ul>
 */
public class Knight extends Personne implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9169783243919398175L;

	public Knight() {
		super("T5Knight", 30, 30, 10, 30);
	}
	
	@Override
	public String getPictureFileName() {
		return "knight.png";
	}
	
}
