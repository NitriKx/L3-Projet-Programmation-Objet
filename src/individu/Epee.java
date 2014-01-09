package individu;

import interfaceGraphique.IAfficheImage;
/**
 * L'{@link Epee} donne un bonus de 10 d'attaque
 */
public class Epee extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1388040033905861615L;

	/**
	 * Constructeur épée
	 */
	public Epee() {
		super("T5Epee", 10, 0, 0, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "epee.png";
	}
	
}
