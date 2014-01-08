package individu;

public class Epee extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1388040033905861615L;

	/**
	 * Constructeur épée
	 */
	public Epee() {
		super("T5Epee", 0, 0, 0, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "epee.png";
	}
	
}
