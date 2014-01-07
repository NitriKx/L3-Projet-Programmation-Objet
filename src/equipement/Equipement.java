package equipement;

import individu.*;

public abstract class Equipement extends Element {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 163233551568098109L;
	
	/**
	 * Caracteristiques de l'equipement
	 */
	private Caracteristiques carac;
	
	/**
	 * retourne les caracteristiques
	 */
	public Caracteristiques getCarac() {
		return carac;
	}

	/**
	 * Constructeur Equipement
	 */
	public Equipement(String nom, Caracteristiques c) {
		super(nom);
		carac = c;
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.getNom());
	}
	
	/**
	 * Valeur entre 0 et 1 pour savoir si un objet est mauvais ou non
	 * @return 0 mauvais / 1 bon
	 */
	public float getBalance() {
		float bal = 10;
		bal += carac.getArgent();
		bal += carac.getAttaque();
		bal += carac.getDefense();
		bal += carac.getVie();
		bal += carac.getVitesse();
		return bal / (float) 20;
	}

}
