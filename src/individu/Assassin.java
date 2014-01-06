package individu;

public class Assassin extends Personnage {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6038634355196587821L;

	public Assassin() {
		super("Assassin", 100, 15, 10, 6, 0, 10);
	}
	
	@Override
	public String getPictureFileName() {
		return "assassin.png";
	}
	
}
