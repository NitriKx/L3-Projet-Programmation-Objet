package equipement;

public class Masse extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3823457584835565221L;

	/**
	 * Constructeur masse
	 */
	public Masse() {
		super("Masse", new Caracteristiques(0, 20, 0, 0, 0));
	}
	
	@Override
	public String getPictureFileName() {
		return "masse.png";
	}
	
}
