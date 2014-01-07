package equipement;

public class Casque extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6270481893943928380L;

	/**
	 * Constructeur casque
	 */
	public Casque() {
		super("Casque", new Caracteristiques(0, 0, 20, 0, 0));
	}

	@Override
	public String getPictureFileName() {
		return "casque.png";
	}
	
}
