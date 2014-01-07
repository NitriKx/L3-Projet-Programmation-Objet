package equipement;

public class Bouclier extends Equipement {
	
	/**
	 * Constructeur bouclier
	 */
	public Bouclier() {
		super("bouclier", new Caracteristiques(0, 0, 10, 0, 0));
	}

	@Override
	public String getPictureFileName() {
		return "bouclier.png";
	}
	
}
