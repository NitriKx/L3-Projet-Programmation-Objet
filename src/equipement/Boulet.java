package equipement;

public class Boulet extends Equipement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5623243055435677759L;

	/**
	 * Constructeur boulet
	 */
	public Boulet() {
		super("Boulet", new Caracteristiques(0, 0, 0, -5, 0));
	}
	
	@Override
	public String getPictureFileName() {
		return "boulet.png";
	}

}
