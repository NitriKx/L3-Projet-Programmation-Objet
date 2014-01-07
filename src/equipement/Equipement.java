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

}
