package individu;

import interfaceGraphique.IAfficheImage;

public class Potion extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1615746363331053170L;

	/**
	 * Constructeur potion
	 */
	public Potion() {
		super("T5Potion", 0, 0, 10, 0, 0);
	}
	

	@Override
	public String getPictureFileName() {
		return "potion.png";
	}
	
}
