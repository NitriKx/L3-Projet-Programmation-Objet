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
		super("T5Potion", 10, 0, 0, 0, 30/4);
	}
	

	@Override
	public String getPictureFileName() {
		return "potion.png";
	}
	
}
