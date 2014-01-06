package equipement;

public class Caracteristiques {
	
	/**
	 * Caracteristiques
	 */
	private int vie;
	private int attaque;
	private int defense;
	private int vitesse;
	private int argent;
	
	/**
	 * Constructeur
	 */
	public Caracteristiques(int life, int attack, int defence, int speed, int money) {
		vie = life;
		attaque = attack;
		defense = defence;
		vitesse = speed;
		argent = money;
	}
	
	/**
	 * retourne la vie
	 */
	public int getVie() {
		return vie;
	}
	
	/**
	 * pour modifier la vie
	 */
	public void setVie(int v) {
		vie += v;
	}

	/**
	 * retourne l'attaque
	 */
	public int getAttaque() {
		return attaque;
	}
	
	/**
	 * pour modifier l'attaque
	 */
	public void setAttaque(int a) {
		attaque += a;
	}

	/**
	 * retourne la defense
	 */
	public int getDefense() {
		return defense;
	}
	
	/**
	 * pour modifier la defense
	 */
	public void setDefense(int d) {
		defense += d;
	}

	/**
	 * retourne la vitesse
	 */
	public int getVitesse() {
		return vitesse;
	}
	
	/**
	 * pour modifier la vitesse
	 */
	public void setVitesse(int v) {
		vitesse += v;
	}

	/**
	 * retourne l'argent
	 */
	public int getArgent() {
		return argent;
	}
	
	/**
	 * pour modifier l'argent
	 */
	public void setArgent(int a) {
		argent += a;
	}
	
}