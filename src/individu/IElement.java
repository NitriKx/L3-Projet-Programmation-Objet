package individu;

import java.util.ArrayList;

/**
 * Interface principale pour gérer les {@link Equipement}
 */
public interface IElement {
	/**
	 * Retourne le nom de l'element
	 */
	public String getNom();
	
	/**
	 * Retourne le nombre de vies de l'element
	 */
	public int getVie();
	
	/**
	 * Reinitialise le nombre de vies de l'element
	 * @param vie le nouveau nombre de vie
	 */
	
	public void setVie(int vie);
	
	/**
	 * Retourne les references des elements avec lesquels l'element courant a joue
	 */
	public ArrayList<Integer> getElementsConnus();
	
	/**
	 * Ajoute a la liste des elements connus (elements avec lesquels l'objet courant a joue) un nouvel element
	 * @param ref le reference de l'objet avec qui il joue
	 */
	public void ajouterConnu(int ref);
		
	/**
	 * Renvoie les informations concernant l'element courant
	 * @return chaine de caractere contenant au moins le nom de l'element et le nombre de vies tel qu'il sera affiche sur l'interface graphique
	 */
	public String toString();
	
	/**
	 * Renvoie le nom du fichier image représentant l'élément
	 * @return chaine de caractère contenant le nom du fichier (relatif au dossier image)
	 */
	public String getPictureFileName();
}
