package individu;

import interfaceGraphique.IAfficheImage;

public class Casque extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6270481893943928380L;

	/**
	 * Constructeur casque
	 */
	public Casque() {
		super("T5Casque", 0, 20, 0, 0, 15);
	}

	@Override
	public String getPictureFileName() {
		return "casque.png";
	}
	
}
