package individu;

import interfaceGraphique.IAfficheImage;
/**
 * La {@link BoursePercee} donne un malus de -10 de taille d'inventaire
 */
public class BoursePercee extends Equipement implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -533765397977776665L;

	/**
	 * Constructeur bourse percée
	 */
	public BoursePercee() {
		super("T5Bourse Percée", 0, 0, 0, 0, -10);
	}
	
	@Override
	public String getPictureFileName() {
		return "boursepercee.png";
	}

}
