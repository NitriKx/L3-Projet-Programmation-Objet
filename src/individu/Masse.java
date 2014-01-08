package individu;

public class Masse extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3823457584835565221L;

	/**
	 * Constructeur masse
	 */
	public Masse() {
		super("T5Masse", 0, 0, 0, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "masse.png";
	}
	
}
