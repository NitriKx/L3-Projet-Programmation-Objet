package equipement;

public class Epee extends Equipement {
	
	/**
	 * Constructeur épée
	 */
	public Epee() {
		super("epee", new Caracteristiques(0, 10, 0, 0, 0));
	}
	
	@Override
	public String getPictureFileName() {
		return "epee.png";
	}
	
}
