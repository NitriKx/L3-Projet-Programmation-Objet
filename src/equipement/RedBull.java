package equipement;

public class RedBull extends Equipement {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1378046950805706469L;

	/**
	 * Constructeur red bull
	 */
	public RedBull() {
		super("Red Bull", new Caracteristiques(0, 0, 0, 5, 0));
	}
	
	@Override
	public String getPictureFileName() {
		return "redbull.png";
	}

}
