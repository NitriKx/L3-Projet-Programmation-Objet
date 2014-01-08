package individu;

public class Alcool extends Equipement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4314072822054392792L;

	/**
	 * Constructeur alcool
	 */
	public Alcool() {
		super("T5Alcool", 0, 0, 0, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "alcool.png";
	}

}
