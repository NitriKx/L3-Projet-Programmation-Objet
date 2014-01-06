package interfaceGraphique;

import individu.Element;

import java.awt.Point;
import java.io.Serializable;
import java.rmi.RemoteException;

import controle.IConsole;


public final class VueElement implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ref;                                   //reference de l'element sur le serveur
	private Point point;                               //position de l'element
	private IConsole ctr;                              //controleur de l'element
	private String phrase;                             //message communique par l'element
	private Element element;
	private int TTL=60*10;							   //duree de vie, max 10 minutes 

	/**
	 * Constructeur
	 * @param ref la reference sur le serveur
	 * @param point la position initiale
	 * @param c le controleur auquel l'element est associe
	 * @param phrase le message a communiquer
	 * @param element TODO
	 */
	public VueElement(int ref, Point point, IConsole c, String phrase, Element element) {
		this.ref = ref;
		this.point = point;
		this.ctr = c;
		this.phrase = phrase;
		this.element = element;
	}

	/**
	 * Constructeur
	 * @param ref la reference sur le serveur
	 * @param point la position initiale
	 * @param c le controleur auquel l'element est associe
	 * @param phrase le message a communiquer
	 * @param element TODO
	 * @param tTL le temps de vie
	 */
	public VueElement(int ref, Point point, IConsole c, String phrase, Element element, int tTL) {
		this.ref = ref;
		this.point = point;
		this.ctr = c;
		this.element = element;
		TTL = tTL;
	}

	/**
	 * Renvoie la reference de l'element sur le serveur
	 */
	public int getRef() {
		return ref;
	}

	/**
	 * Renvoie la duree de vie de l'element
	 */
	public int getTTL() {
		return TTL;
	}

	/**
	 * Mets a jour la duree de vie de l'element
	 * @param tTL le nouveau temps de vie
	 */
	public void setTTL(int tTL) {
		TTL = tTL;
	}

	/**
	 * Renvoie le point sur lequel l'element se trouve
	 */
	public Point getPoint() {
		return point;
	}

	/**
	 * Mets a jour la position sur laquelle l'element se trouve
	 */
	public void setPoint(Point point) {
		this.point = point;
	}

	/**
	 * Renvoie le controleur auquel l'element est associe
	 */
	public IConsole getControleur(){
		return this.ctr;
	}

	/**
	 * Renvoie le message communique par l'element
	 */
	public String getPhrase(){
		return this.phrase;
	}
	
	/**
	 * Reinitialise le message a communiquer par l'element
	 * @param phrase le nouveau message 
	 */
	public void setPhrase(String phrase){
		this.phrase = phrase;
	}

	/**
	 * Diminue la duree de vie d'une unite
	 */
	public void decrTTL() {
		if (TTL>0) 
			TTL--;
	}	
	
	/**
	 * @return l'élément associé à la vue
	 */
	public Element getElement() {
		return element;
	}
	
	/**
	 * 
	 * @param element le nouvel element associé à la vue
	 */
	public void setElement(Element element) {
		this.element = element;
	}	

	/**
	 * Clone la representation courante de l'element
	 */
	public VueElement clone() {
		return new VueElement( ref,  point, ctr, phrase, element, TTL);
	}

	/**
	 * Affiche l'etat courant de l'element
	 */
	public String afficher(){
		try{
			return this.ctr.afficher();
		}
		catch(RemoteException e){
			e.printStackTrace();
			return "";
		}
	}

}
