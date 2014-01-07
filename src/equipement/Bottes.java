package equipement;

public class Bottes extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7831339669069632116L;

	/**
	 * Constructeur bottes
	 */
	public Bottes() {
		super("Bottes", new Caracteristiques(0, 0, 0, 10, 0));
	}
	
	@Override
	public String getPictureFileName() {
		return "bottes.png";
	}
	
}
