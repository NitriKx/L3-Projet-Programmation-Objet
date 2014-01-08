package individu;

import interfaceGraphique.IAfficheImage;


public class Ninja extends Personne implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4246432800893825543L;

	public Ninja() {
		super("T5Ninja", 25, 15, 50, 10);
	}

	@Override
	public String getPictureFileName() {
		return "ninja.png";
	}
}
