package individu;

import interfaceGraphique.IAfficheImage;


public class Mineur extends Personne implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5203397441535241145L;

	public Mineur() {
		super("T5Mineur", 100, 0, 0, 0);
	}

	@Override
	public String getPictureFileName() {
		return "mineur.png";
	}
}
