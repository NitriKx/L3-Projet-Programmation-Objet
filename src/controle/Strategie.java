package controle;

import individu.Personnage;
import interfaceGraphique.VueElement;

import java.awt.Point;
import java.util.HashMap;
import java.util.Hashtable;

import equipement.Equipement;
import utilitaires.UtilitaireConsole;

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

	public static HashMap<Integer, HashMap<Integer,VueElement>> chercherEquipementProche(VueElement ve, Hashtable<Integer,VueElement> voisins){
		Hashtable<Integer,VueElement> voisinsEquip = new Hashtable<Integer, VueElement>();
		// Recopier voisins
		// Enlever les personnages des voisins
		for (Integer ref : voisins.keySet()) {
			VueElement veTemp = voisins.get(ref);
			if (veTemp.getElement() instanceof Equipement) {
				voisinsEquip.put(ref, veTemp);
			}
		}
		
		// Chercher elements le plus proche avec voisins
		return chercherElementProche(ve, voisins);
	}

	public static HashMap<Integer, HashMap<Integer,VueElement>> chercherPersonnageProche(VueElement ve, Hashtable<Integer,VueElement> voisins){
		Hashtable<Integer,VueElement> vonsinsPerso = new Hashtable<Integer, VueElement>();
		// Recopier voisins
		// Enlever les équipements des voisins
		for (Integer ref : voisins.keySet()) {
			VueElement veTemp = voisins.get(ref);
			if (veTemp.getElement() instanceof Personnage) {
				vonsinsPerso.put(ref, veTemp);
			}
		}
		
		// Chercher elements le plus proche avec voisins
		return chercherElementProche(ve, voisins);
	}
}
