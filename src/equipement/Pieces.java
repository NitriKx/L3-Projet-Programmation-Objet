package equipement;

public class Pieces extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5902641300410478938L;


	/**
	 * Constructeur pieces
	 */
	public Pieces() {
		super("Pieces", new Caracteristiques(0, 0, 0, 0, 10));
	}
	

	@Override
	public String getPictureFileName() {
		return "piece.png";
	}
	
}
