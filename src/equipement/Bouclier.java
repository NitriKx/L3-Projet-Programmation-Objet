package equipement;

public class Bouclier extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5457212606111593813L;

	/**
	 * Constructeur bouclier
	 */
	public Bouclier() {
		super("Bouclier", new Caracteristiques(0, 0, 10, 0, 0));
	}

	@Override
	public String getPictureFileName() {
		return "bouclier.png";
	}
	
}
