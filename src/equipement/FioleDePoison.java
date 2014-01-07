package equipement;

public class FioleDePoison extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8704693010280664116L;

	/**
	 * Constructeur fiole de poison
	 */
	public FioleDePoison() {
		super("Fiole De Poison", new Caracteristiques(-5, 0, -5, 0, 0));
	}
	
	@Override
	public String getPictureFileName() {
		return "fioledepoison.png";
	}

}
