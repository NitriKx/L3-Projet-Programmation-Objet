package individu;


public class Mineur extends Personne {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5203397441535241145L;

	public Mineur() {
		super("T5Mineur", 0, 0, 0, 100);
	}

	@Override
	public String getPictureFileName() {
		return "mineur.png";
	}
}
