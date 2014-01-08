package individu;


public class Barbare extends Personne {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8067111339199337973L;

	/**
	 * Constructeur Barbare
	 */
	public Barbare() {
		super("T5Barbare", 100, 0, 0, 0);
	}

	/**
	 * retourne l'image associée au barbare
	 */
	public String getPictureFileName() {
		return "barbare.png";
	}
	
}
