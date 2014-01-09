package individu;

import interfaceGraphique.IAfficheImage;
/**
 * La {@link FioleDePoison} donne un malus de -5 en défense et en vie
 */
public class FioleDePoison extends Equipement implements IAfficheImage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8704693010280664116L;

	/**
	 * Constructeur fiole de poison
	 */
	public FioleDePoison() {
		super("T5Fiole De Poison", 0, -5, -5, 0, 0);
	}
	
	@Override
	public String getPictureFileName() {
		return "fioledepoison.png";
	}

}
