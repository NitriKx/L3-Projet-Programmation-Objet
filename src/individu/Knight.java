package individu;

import interfaceGraphique.IAfficheImage;


public class Knight extends Personne implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9169783243919398175L;

	public Knight() {
		super("T5Knight", 100, 0, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "knight.png";
	}
	
}
