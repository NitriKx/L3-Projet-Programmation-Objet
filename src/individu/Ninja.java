package individu;

import equipement.Caracteristiques;

public class Ninja extends Personnage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4246432800893825543L;

	public Ninja() {
		super("Ninja", 70, new Caracteristiques(120, 16, 7, 4, 25), 4);
	}

	@Override
	public String getPictureFileName() {
		return "ninja.png";
	}
}
