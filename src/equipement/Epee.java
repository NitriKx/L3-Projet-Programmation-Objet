package equipement;

public class Epee extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1388040033905861615L;

	/**
	 * Constructeur épée
	 */
	public Epee() {
		super("Epée", new Caracteristiques(0, 10, 0, 0, 0));
	}
	
	@Override
	public String getPictureFileName() {
		return "epee.png";
	}
	
}
