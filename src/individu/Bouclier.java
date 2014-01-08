package individu;

public class Bouclier extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5457212606111593813L;

	/**
	 * Constructeur bouclier
	 */
	public Bouclier() {
		super("T5Bouclier", 0, 0, 0, 0, 0);
	}

	@Override
	public String getPictureFileName() {
		return "bouclier.png";
	}
	
}
