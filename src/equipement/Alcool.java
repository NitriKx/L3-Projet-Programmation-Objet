package equipement;

public class Alcool extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4314072822054392792L;

	/**
	 * Constructeur alcool
	 */
	public Alcool() {
		super("Alcool", new Caracteristiques(0, 3, 0, -3, 0));
	}
	
	@Override
	public String getPictureFileName() {
		return "alcool.png";
	}

}
