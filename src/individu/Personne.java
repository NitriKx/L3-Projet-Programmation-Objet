package individu;


/**
 * {@link Element} ayant des caractéristiques supplémentaires
 */
public class Personne extends Element{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int force;                                //la force d'un combattant
	private int defense;                              //la defense d'un combattant
	private int esquive;                              //probabilite d'annuler une attaque
	private int inventaire;						  //capacite en terme de poids des objets deja utilises	

	/**
	 * @param nom
	 * @param force
	 * @param defense
	 * @param esquive
	 * @param inventaire
	 */
	public Personne() {
		super("T5Troll",100);
		this.force = 20;
		this.defense = 10;
		this.esquive = 0;
		this.inventaire = 70;
	}

	

	/**
	 * Renvoie le nombre de vies du combattant prenant en compte aussi les bonus des objets ramasses
	 */
	public int getVie() {
		return 100;
	}

	/**
	 * Renvoie la force du combattant prenant en compte les bonus des abjets ramasses
	 */
	public int getAttaque() {
		return this.getForce();
	}
	
	/**
	 * Renvoir la defense du combattant prenant en compte les bonus des objets ramasses
	 */
	public int getDefense() {
		return this.defense;
	}
	
	/**
	 * @return the force
	 */
	public int getForce() {
		return this.force;
	}



	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}



	/**
	 * @return the esquive
	 */
	public int getEsquive() {
		return this.esquive;
	}



	/**
	 * @param esquive the esquive to set
	 */
	public void setEsquive(int esquive) {
		this.esquive = esquive;
	}



	/**
	 * @return the inventaire
	 */
	public int getInventaire() {
		return inventaire;
	}



	/**
	 * @param inventaire the inventaire to set
	 */
	public void setInventaire(int inventaire) {
		this.inventaire = inventaire;
	}



	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}



	/**
	 * Recalcule le nombre de vies du combattant en enlevant celles qu'il a perdues
	 * @param viePerdue le nombre de vies perdues par le combattant
	 */
	public void perdreVie(int viePerdue) {
		super.setVie(super.getVie() - viePerdue);
	}
	
	
}
