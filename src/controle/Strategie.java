package controle;

import java.awt.Point;
import java.util.HashMap;
import java.util.Hashtable;

import individu.Element;
import individu.Personne;
import interfaceGraphique.VueElement;
import utilitaires.UtilitaireConsole;
/**
 * Permet de rechercher aux alentours de l'{@link Element}
 */
public class Strategie {

	/**
	 * Cherche l'element le plus proche vers lequel se diriger
	 * @param ve l'element courant
	 * @param voisins les elements voisins
	 * @return un hashmap contenant la distance a parcourir vers l'element le plus proche, son identifiant et sa vue
	 */
	public static HashMap<Integer, HashMap<Integer,VueElement>> chercherElementProche(VueElement ve, Hashtable<Integer,VueElement> voisins){
		HashMap<Integer, HashMap<Integer,VueElement>> resultat = new HashMap<Integer, HashMap<Integer,VueElement>>();
		
		int distPlusProche = 100;
		int refPlusProche = 0;
	
		for(Integer ref:voisins.keySet()) {
			Point target = voisins.get(ref).getPoint();
			if (UtilitaireConsole.distanceChebyshev(ve.getPoint(),target)<distPlusProche) {
				distPlusProche = UtilitaireConsole.distanceChebyshev(ve.getPoint(),target);
				refPlusProche = ref;
			}
		}
		
		HashMap<Integer,VueElement> cible = new HashMap<Integer,VueElement>();
		cible.put((Integer)refPlusProche, voisins.get(refPlusProche));
		resultat.put((Integer)distPlusProche, cible);
		
		return resultat;
	}

}
