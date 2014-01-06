package individu;

import equipement.Caracteristiques;

public class Mineur extends Personnage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5203397441535241145L;

	public Mineur() {
		super("Mineur", 110, new Caracteristiques(130, 4, 9, 1, 45), 30);
	}

	@Override
	public String getPictureFileName() {
		return "mineur.png";
	}
}
