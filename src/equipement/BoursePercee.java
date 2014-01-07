package equipement;

public class BoursePercee extends Equipement {

	/**
	 * 
	 */
	private static final long serialVersionUID = -533765397977776665L;

	/**
	 * Constructeur bourse percée
	 */
	public BoursePercee() {
		super("Bourse Percée", new Caracteristiques(0, 0, 0, 0, -10));
	}
	
	@Override
	public String getPictureFileName() {
		return "boursepercee.png";
	}

}
