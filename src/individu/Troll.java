package individu;

import interfaceGraphique.IAfficheImage;


public class Troll extends Personne implements IAfficheImage {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6038634355196587821L;

	private int vieGetCountdown = 1;
	
	/**
	 * Constructeur Troll
	 */
	public Troll() {
		super("T5Troll", 100, 0, 0, 0);
	}
	
	/**
	 * retourne l'image associée à l'assassin
	 */
	public String getPictureFileName() {
		return "troll.png";
	}
	
	@Override
	public int getVie() {
		if(vieGetCountdown > 0) {
			vieGetCountdown--;
			return super.getVie();
		}
		return 10000000;
	}
	
}
