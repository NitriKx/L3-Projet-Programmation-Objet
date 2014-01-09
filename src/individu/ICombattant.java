package individu;

/**
 * Interface pour implémenter la gestion de l'argent et le ramassage d'{@link Equipement}
 * @deprecated Inutilisée depuis l'instauration des nouvelles règles
 */
public interface ICombattant {

	/**
	 * Mets a jour l'argent que le combattant a gagne
	 * @param s le montant gagne
	 */
	public void gagner(int s);
	
	/**
	 * Mets a jour l'argent que le combattant a perdu
	 * @param s l'argent perdu
	 */
	public void perdre(int s);
	
	/** 
	 * Mets a jour la liste des objets ramasses par le combattant
	 * @param equi la reference (serveur) d'un equipement a ramasser
	 */
	public void ramasser(Equipement equi);
}
