/**
 * 
 */
package individu;

import java.util.List;
import java.util.ArrayList;

import equipement.Caracteristiques;

/**
 * @author flemoal
 *
 */
public abstract class Personnage extends Element implements ICombattant {
	/**
	 * 
	 */
	private static final long serialVersionUID = 724457744388737246L;

	private List<Integer> objets;
	
	// Capacité des personnages
	private Caracteristiques caracterisques;
	private int nbelement;
	
	@Override
	public String getPictureFileName() {
		return "personnage.png";
	}
	
	/**
	 * @return the nbelement
	 */
	public int getNbelement() {
		return nbelement;
	}

	/**
	 * @param nom
	 * @param vie
	 */
	public Personnage(String nom, int vie, Caracteristiques propriete, int nbel) {
		super(nom, vie);
		objets = new ArrayList<Integer>();
		caracterisques = propriete;
	}


	/**
	 * met à jour les caractéristiques avec les objets de l'inventaire
	 * @return the caracterisques
	 */
	public Caracteristiques getCaracterisques() {
		return this.caracterisques;
	}

	public void gagner(int s) {
		caracterisques.setArgent(caracterisques.getArgent() + s);;
	}

	/* (non-Javadoc)
	 * @see individu.ICombattant#perdre(int)
	 */
	public void perdre(int s) {
		caracterisques.setArgent(caracterisques.getArgent() - s);;
	}

	/* (non-Javadoc)
	 * @see individu.ICombattant#ramasser(int)
	 */
	public void ramasser(int ref) {
		if (objets.size() < nbelement) objets.add(ref);
	}

	/**
	 * @return the objets
	 */
	public List<Integer> getObjets() {
		return objets;
	}
}
