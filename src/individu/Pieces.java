package individu;

import interfaceGraphique.IAfficheImage;
/**
 * Les {@link Pieces} donne un bonne de 10 d'inventaire
 */
public class Pieces extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5902641300410478938L;


	/**
	 * Constructeur pieces
	 */
	public Pieces() {
		super("T5Pièces", 0, 0, 0, 0, 10);
	}
	

	@Override
	public String getPictureFileName() {
		return "piece.png";
	}
	
}
