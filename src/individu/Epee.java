package individu;

import interfaceGraphique.IAfficheImage;

public class Epee extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1388040033905861615L;

	/**
	 * Constructeur épée
	 */
	public Epee() {
		super("T5Epee", 10, 0, 0, 0, 30/4);
	}
	
	@Override
	public String getPictureFileName() {
		return "epee.png";
	}
	
}
