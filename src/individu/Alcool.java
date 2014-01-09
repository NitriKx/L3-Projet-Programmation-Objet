package individu;

import interfaceGraphique.IAfficheImage;
/**
 * L'{@link Alcool} est un bonus de 3 d'attaque mais un malus de -3 d'esquive
 */
public class Alcool extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4314072822054392792L;

	/**
	 * Constructeur alcool
	 */
	public Alcool() {
		super("T5Alcool", 3, 0, 0, -3, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "alcool.png";
	}

}
