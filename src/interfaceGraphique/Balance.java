package interfaceGraphique;

import individu.Element;
import individu.Equipement;
import individu.Personne;

public class Balance {

	public static float getBalance (Element el) {
		if (Personne.class.isAssignableFrom(el.getClass())) {
			// Si c'est une personne
			Personne pers = (Personne) el;
			float bal = (float) pers.getVie() / (float) 100;
			return (bal < 0) ? 0 : ((bal > 1) ? 1 : bal);

		} else if (Equipement.class.isAssignableFrom(el.getClass())) {
			// Si c'est une personne
			Equipement equi = (Equipement) el;
			float bal = 50; // Malus maximal
			bal += equi.getBonusDefense();
			bal += equi.getBonusEsquive();
			bal += equi.getBonusForce();
			bal += equi.getBonusInventaire();
			bal += equi.getBonusVie();
			bal /= 100; // Malus max + bonus max
			return (bal < 0) ? 0 : ((bal > 1) ? 1 : bal);
		} else {
			// Si il s'agit juste d'un élément
			return 1;
		}
	}
}
