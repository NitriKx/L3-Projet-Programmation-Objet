package individu;

import equipement.Caracteristiques;

public class Knight extends Personnage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9169783243919398175L;

	public Knight() {
		super("Knight", 110, new Caracteristiques(140, 6, 7, 2, 15), 15);
	}
	
	@Override
	public String getPictureFileName() {
		return "knight.png";
	}
	
}
