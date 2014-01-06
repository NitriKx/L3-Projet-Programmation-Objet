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
	private int money;

	/**
	 * @param nom
	 * @param vie
	 */
	public Personnage(String nom, int vie, int argent) {
		super(nom, vie);
		money = argent;
		objets = new ArrayList<Integer>();
	}

	/* (non-Javadoc)
	 * @see individu.ICombattant#gagner(int)
	 */
	public void gagner(int s) {
		money += s;
	}

	/* (non-Javadoc)
	 * @see individu.ICombattant#perdre(int)
	 */
	public void perdre(int s) {
		money -= s;
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

	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}
}
