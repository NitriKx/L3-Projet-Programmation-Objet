package individu;

import interfaceGraphique.IAfficheImage;

public class BoursePercee extends Equipement implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -533765397977776665L;

	/**
	 * Constructeur bourse percée
	 */
	public BoursePercee() {
		super("T5Bourse Percée", 0, 0, 0, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "boursepercee.png";
	}

}
