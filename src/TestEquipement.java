import individu.Alcool;
import individu.Bottes;
import individu.Bouclier;
import individu.Boulet;
import individu.BoursePercee;
import individu.Casque;
import individu.Element;
import individu.Epee;
import individu.FioleDePoison;
import individu.Masse;
import individu.Pieces;
import individu.Potion;
import individu.RedBull;
import interfaceGraphique.IHM;

import java.rmi.RemoteException;
import java.util.Random;

import controle.Console;


public class TestEquipement {
	private enum ListeEquipements {
		ALCOOL,
		BOTTES,
		BOUCLIER,
		BOULET,
		BOURSEPERCEE,
		CASQUE,
		EPEE,
		FIOLEDEPOISON,
		MASSE,
		PIECES,
		POTION,
		REDBULL
	}
	
	public static void main(String[] args) throws RemoteException {
		ListeEquipements equipementPossibles[] = ListeEquipements.values();
		ListeEquipements equipementAFaireApparaitre = equipementPossibles[new Random().nextInt(equipementPossibles.length)];
		Element element = null;
		switch(equipementAFaireApparaitre) {
		case ALCOOL :
			element = new Alcool();
			break;
		case BOTTES :
			element = new Bottes();
			break;
		case BOUCLIER :
			element = new Bouclier();
			break;
		case BOULET :
			element = new Boulet();
			break;
		case BOURSEPERCEE :
			element = new BoursePercee();
			break;
		case CASQUE :
			element = new Casque();
			break;
		case EPEE:
			element = new Epee();
			break;
		case FIOLEDEPOISON :
			element = new FioleDePoison();
			break;
		case MASSE :
			element = new Masse();
			break;
		case PIECES :
			element = new Pieces();
			break;
		case POTION:
			element = new Potion();
			break;
		case REDBULL :
			element = new RedBull();
			break;
		default:
			break;
		}
		
		int randomX = (int)(Math.random() * IHM.tailleAreneX);	// on tire l'abscisse d'une position au hasard
		int randomY = (int)(Math.random() * IHM.tailleAreneY);	// on tire l'ordonnee d'une position au hasard
		new Console(element, randomX, randomY, 5099);
	}

}
