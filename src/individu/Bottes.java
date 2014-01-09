package individu;

import interfaceGraphique.IAfficheImage;
/**
 * Les {@link Bottes} donnent un bonus de 10 d'esquive.
 */
public class Bottes extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7831339669069632116L;

	/**
	 * Constructeur bottes
	 */
	public Bottes() {
		super("T5Bottes", 0, 0, 0, 10, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "bottes.png";
	}
	
}
