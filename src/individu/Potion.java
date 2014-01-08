package individu;

public class Potion extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1615746363331053170L;

	/**
	 * Constructeur potion
	 */
	public Potion() {
		super("T5Potion", 0, 0, 0, 0, 0);
	}
	

	@Override
	public String getPictureFileName() {
		return "potion.png";
	}
	
}
