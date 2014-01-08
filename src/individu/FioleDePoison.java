package individu;

public class FioleDePoison extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8704693010280664116L;

	/**
	 * Constructeur fiole de poison
	 */
	public FioleDePoison() {
		super("T5Fiole De Poison", 0, 0, 0, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "fioledepoison.png";
	}

}
