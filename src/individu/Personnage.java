/**
 * 
 */
package individu;

import java.util.List;
import java.util.ArrayList;

/**
 * @author flemoal
 *
 */
public abstract class Personnage extends Element implements ICombattant {
	private List<Integer> objets;
	
	// Capacité des personnages
	private int defense;
	private int attaque;
	private int vitesse;
	private int argent;
	
	/**
	 * @param nom
	 * @param vie
	 */
	public Personnage(String nom, int vie, int attack, int def, int speed, int money) {
		super(nom, vie);
		argent = money;
		objets = new ArrayList<Integer>();
		defense = def;
		attaque = attack;
		vitesse = speed;
	}

	/**
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * @return the attaque
	 */
	public int getAttaque() {
		return attaque;
	}

	/**
	 * @return the vitesse
	 */
	public int getVitesse() {
		return vitesse;
	}

	/**
	 * @return the argent
	 */
	public int getArgent() {
		return argent;
	}

	/* (non-Javadoc)
	 * @see individu.ICombattant#gagner(int)
	 */
	public void gagner(int s) {
		argent += s;
	}

	/* (non-Javadoc)
	 * @see individu.ICombattant#perdre(int)
	 */
	public void perdre(int s) {
		argent -= s;
	}

	/* (non-Javadoc)
	 * @see individu.ICombattant#ramasser(int)
	 */
	public void ramasser(int ref) {
		objets.add(ref);
	}

	/**
	 * @return the objets
	 */
	public List<Integer> getObjets() {
		return objets;
	}
}