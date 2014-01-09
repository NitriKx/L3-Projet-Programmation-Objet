package interfaceGraphique;

import individu.Element;
import individu.Equipement;
import individu.Personne;
/**
 * Permet de connaitre la {@link Balance} d'un {@link Element}.
 */
public class Balance {
	/**
	 * 
	 * @param el {@link Element} à avoir la balance
	 * @return La balance en <code>float</code> de l'élément donné en paramètre
	 * <ul>
	 * <li><code>0 … 1</code> : Pour une {@link Personne} la balance varie entre 0 et 1 pour représenter la vie entre 0 et 100</li>
	 * <li><code>0 … 1</code> : Pour un {@link Equipement} la balance varie entre 0 pour représenter le l'effet total de l'objet (entre 0 et 20)</li>
	 * <li><code>1</code> : Pour tous les autres</li>
	 * </ul>
	 */
	public static float getBalance (Element el) {
		if (Personne.class.isAssignableFrom(el.getClass())) {
			// Si c'est une personne
			Personne pers = (Personne) el;
			float bal = (float) pers.getVie() / (float) 100;
			return (bal < 0) ? 0 : ((bal > 1) ? 1 : bal);

		} else if (Equipement.class.isAssignableFrom(el.getClass())) {
			// Si c'est une personne
			Equipement equi = (Equipement) el;
			float bal = 20; // Malus maximal
			bal += equi.totalEffetInventaire();
			bal /= 40; // Malus max + bonus max
			return (bal < 0) ? 0 : ((bal > 1) ? 1 : bal);
		} else {
			// Si il s'agit juste d'un élément
			return 1;
		}
	}
}
