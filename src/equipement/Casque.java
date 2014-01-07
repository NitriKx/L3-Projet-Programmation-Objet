package equipement;

public class Casque extends Equipement {
	
	/**
	 * Constructeur casque
	 */
	public Casque() {
		super("casque", new Caracteristiques(0, 0, 20, 0, 0));
	}

	@Override
	public String getPictureFileName() {
		return "casque.png";
	}
	
}
