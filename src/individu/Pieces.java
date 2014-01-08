package individu;

public class Pieces extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5902641300410478938L;


	/**
	 * Constructeur pieces
	 */
	public Pieces() {
		super("T5Pièces", 0, 0, 0, 0, 0);
	}
	

	@Override
	public String getPictureFileName() {
		return "piece.png";
	}
	
}
