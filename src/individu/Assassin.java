package individu;

public class Assassin extends Personnage {
	
	public Assassin() {
		super("Assassin", 100, 15, 10, 3, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "assassin.png";
	}
	
}
