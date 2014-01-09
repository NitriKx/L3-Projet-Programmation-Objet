package individu;

import interfaceGraphique.IAfficheImage;
/**
 * Le {@link Casque} donne un bonus de 10 de défense
 */
public class Casque extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6270481893943928380L;

	/**
	 * Constructeur casque
	 */
	public Casque() {
		super("T5Casque", 0, 10, 0, 0, 0);
	}

	@Override
	public String getPictureFileName() {
		return "casque.png";
	}
	
}
