package individu;

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
	 * @return the vie
	 */
	public int getVie() {
		return vie;
	}

	/**
	 * @param vie the vie to set
	 */
	public void setVie(int vie) {
		this.vie = vie;
	}

	/**
	 * @return the attaque
	 */
	public int getAttaque() {
		return attaque;
	}

	/**
	 * @param attaque the attaque to set
	 */
	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	/**
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}

	/**
	 * @return the vitesse
	 */
	public int getVitesse() {
		return vitesse;
	}

	/**
	 * @param vitesse the vitesse to set
	 */
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	/**
	 * @return the argent
	 */
	public int getArgent() {
		return argent;
	}

	/**
	 * @param argent the argent to set
	 */
	public void setArgent(int argent) {
		this.argent = argent;
	}
	
	
}