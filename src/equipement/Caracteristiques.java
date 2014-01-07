package equipement;

import java.io.Serializable;

public class Caracteristiques implements Serializable {
	
	private static final long serialVersionUID = -4333505248877226811L;
	
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

	public void add(Caracteristiques c) {
		this.vie += c.vie;
		this.addExceptLife(c);
	}
	
	public void addExceptLife(Caracteristiques c) {
		this.attaque += c.attaque;
		this.defense += c.defense;
		this.vitesse += c.vitesse;
		this.argent += c.argent;
	}
	
	public Caracteristiques clone() {
		return new Caracteristiques(this.vie, this.attaque, this.defense, this.vitesse, this.argent);
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