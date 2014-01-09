package individu;

import interfaceGraphique.IAfficheImage;
/**
 * Le {@link RedBull} donne un bonus de 5 d'esquive
 */
public class RedBull extends Equipement implements IAfficheImage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1378046950805706469L;

	/**
	 * Constructeur red bull
	 */
	public RedBull() {
		super("T5Red Bull", 0, 0, 0, 5, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "redbull.png";
	}

}
