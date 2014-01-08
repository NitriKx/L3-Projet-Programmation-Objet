package individu;

public class Casque extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6270481893943928380L;

	/**
	 * Constructeur casque
	 */
	public Casque() {
		super("T5Casque", 0, 0, 0, 0, 0);
	}

	@Override
	public String getPictureFileName() {
		return "casque.png";
	}
	
}
