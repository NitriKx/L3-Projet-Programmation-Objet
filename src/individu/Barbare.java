package individu;

import equipement.Caracteristiques;

public class Barbare extends Personnage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8067111339199337973L;

	public Barbare() {
		super("Barbare", 160, new Caracteristiques(200, 7, 14, 2, 5), 5);
	}

	@Override
	public String getPictureFileName() {
		return "barbare.png";
	}
	
}
