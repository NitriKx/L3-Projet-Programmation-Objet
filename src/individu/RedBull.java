package individu;

public class RedBull extends Equipement {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1378046950805706469L;

	/**
	 * Constructeur red bull
	 */
	public RedBull() {
		super("T5Red Bull", 0, 0, 0, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "redbull.png";
	}

}
